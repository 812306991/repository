package cn.yufei.ssm.system.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.SysDatabackupsMapper;
import cn.yufei.ssm.system.po.SysDatabackups;
import cn.yufei.ssm.system.po.SysDatabackupsExample;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.service.SysDatabackupsService;
import cn.yufei.ssm.system.utils.ContextUtils;
import cn.yufei.ssm.system.utils.StringUtils;
import cn.yufei.ssm.system.utils.Tools;

@Service
@Scope("singleton")
public class SysDatabackupsServiceImpl implements SysDatabackupsService {
	
	@Autowired
	private SysDatabackupsMapper sysDatabackupsMapper;

	@Override
	public int saveBackData(SysDatabackups backData) throws Exception {
		int count=0;
		if(backData!=null){
			count=sysDatabackupsMapper.insertSelective(backData);
		}else{
			throw new CustomException("saveBackData()---backData不能为空");
		}
		return count;
	}

	@Override
	public GridData findBackDataList(String inputText, int page, int rows)
			throws Exception {
		SysDatabackupsExample  backExample=new SysDatabackupsExample();
		SysDatabackupsExample.Criteria criteria=backExample.createCriteria();
		if(!StringUtils.isEmpty(inputText)){
			criteria.andSbackupnameLike("%"+inputText+"%");
		}
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("SCREATORTIME desc");
		PageInfo<SysDatabackups> pageInfo = new PageInfo<SysDatabackups>(sysDatabackupsMapper.selectByExample(backExample));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}

	@Override
	public int beginInBack(HttpSession session) throws Exception {
		//读取配置文件获取用户密码等
		Properties properties=new Properties();
		properties.load(SysDatabackupsServiceImpl.class.getClassLoader().getResourceAsStream("db.properties"));
		String userName=properties.getProperty("jdbc.username").trim();
		String password=properties.getProperty("jdbc.password").trim();
		String savePath=ContextUtils.getProperty("backDataPath").trim();
		String sid="orcl";//数据库实例
		File saveFile=new File(savePath);
		if(!saveFile.exists()){
			saveFile.mkdirs();
		}
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
		String hehe = dateFormat.format( now ); 
		String backName=userName+"_"+hehe+".dmp";
		String command="exp "+userName+"/"+password+"@"+sid+" file="+savePath+"\\"+backName+" owner=("+userName+")";
		System.out.println(command);
		Process process=Runtime.getRuntime().exec(command);
		final InputStream input=process.getInputStream();
		new Thread(new Runnable(){
			@Override
			public void run() {
				BufferedReader br=new BufferedReader(new InputStreamReader(input));
				String info;
				try {
					while((info=br.readLine()) != null){
						System.out.println("info:"+info);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		InputStream input2=process.getErrorStream();
		BufferedReader br2=new BufferedReader(new InputStreamReader(input2));
		//保存输出结果
		StringBuilder buf=new StringBuilder();
		String line=null;
		int i=0;
		while((line=br2.readLine()) != null){
			buf.append(line);
		}
		try {
			if(buf.toString().contains("ORA-")&&buf.toString().contains("EXP-")){
				System.out.println("备份失败！");
				process.destroy();
			}else{
				i=process.waitFor();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//保存备份日志到数据库
		UserContext context=(UserContext)session.getAttribute("userContext");
		SysDatabackups backData=new SysDatabackups();
		backData.setSid(Tools.getID());
		backData.setSbackupname(backName);
		backData.setSbackuppath(savePath+"\\"+backName);
		backData.setSbackupdata(Calendar.getInstance().getTime());
		backData.setVersion(new BigDecimal(0));
		backData.setScreatorid(context.getUserId());
		backData.setScreatorname(context.getUserName());
		backData.setScreatortime(Calendar.getInstance().getTime());
		backData.setSflag("0");
		i=sysDatabackupsMapper.insertSelective(backData);
		return i;
	}

	@Override
	public int regainBack(String id) throws Exception {
		if(StringUtils.isEmpty(id)){
			throw new CustomException("regainBack()---id不能为空");
		}
		SysDatabackups backData=sysDatabackupsMapper.selectByPrimaryKey(id);
		//读取配置文件获取用户密码等
		Properties properties=new Properties();
		properties.load(SysDatabackupsServiceImpl.class.getClassLoader().getResourceAsStream("db.properties"));
		String userName=properties.getProperty("jdbc.username").trim();
		String password=properties.getProperty("jdbc.password").trim();
		String sid="orcl";//数据库实例
		String command="imp "+userName+"/"+password+"@"+sid+" file="+backData.getSbackuppath()+" full=y ";
		System.out.println(command);
		Process process=Runtime.getRuntime().exec(command);
		final InputStream input=process.getInputStream();
		new Thread(new Runnable(){
			@Override
			public void run() {
				BufferedReader br=new BufferedReader(new InputStreamReader(input));
				String info;
				try {
					while((info=br.readLine()) != null){
						System.out.println("info:"+info);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		InputStream input2=process.getErrorStream();
		BufferedReader br2=new BufferedReader(new InputStreamReader(input2));
		//保存输出结果
		StringBuilder buf=new StringBuilder();
		String line=null;
		int i=0;
		while((line=br2.readLine()) != null){
			buf.append(line);
		}
		backData.setSflag("1");
		sysDatabackupsMapper.updateByPrimaryKey(backData);
		try {
			if(buf.toString().contains("ORA-")&&buf.toString().contains("IMP-")){
				System.out.println("还原失败！");
				process.destroy();
			}else{
				i=process.waitFor();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i);
		return i;
	}
	
}
