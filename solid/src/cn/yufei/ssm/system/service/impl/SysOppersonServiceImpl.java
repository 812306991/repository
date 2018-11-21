package cn.yufei.ssm.system.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.yufei.ssm.system.core.data.CollectingData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.SysOporgMapper;
import cn.yufei.ssm.system.mapper.SysOppersonMapper;
import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.po.SysOpperson;
import cn.yufei.ssm.system.po.SysOppersonExample;
import cn.yufei.ssm.system.po.Vo.SysOppersonVo;
import cn.yufei.ssm.system.service.SysOppersonService;
import cn.yufei.ssm.system.utils.ContextUtils;
import cn.yufei.ssm.system.utils.MD5Util;
import cn.yufei.ssm.system.utils.StringUtils;

@Service
@Scope("singleton")
public class SysOppersonServiceImpl implements SysOppersonService {
	
	@Autowired
	private SysOppersonMapper sysOppersonMapper;
	
	@Autowired
	private SysOporgMapper sysOporgMapper;
	

	

	@Override
	public int updateResetPassword(String userId)
			throws Exception {
		if(StringUtils.isEmpty(userId)){
			throw new CustomException("updateResetPassword()---userId不能为空");
		}
		String password = ContextUtils.getProperty("resetPassword");
		SysOpperson person=new SysOpperson();
		person.setSid(userId);
		person.setSpassword(MD5Util.encode(password));
		int count=sysOppersonMapper.updateByPrimaryKeySelective(person);
		return count;
	}
	
	//根据用户id查询用户信息
	@Override
	public SysOpperson findPersonById(String id) throws Exception {
		if(StringUtils.isEmpty(id)){
			throw new CustomException("findPersonById()---id不能为空");
		}
		return sysOppersonMapper.selectByPrimaryKey(id);
	}

	//根据用户账号查询用户信息
	@Override
	public SysOpperson findPersonByCode(String code) throws Exception {
		if(StringUtils.isEmpty(code)){
			throw new CustomException("findPersonByCode()---code不能为空");
		}
		SysOpperson person=null;
		SysOppersonExample personExample=new SysOppersonExample();
		SysOppersonExample.Criteria criteria=personExample.createCriteria();
		criteria.andScodeEqualTo(code);
		List<SysOpperson> list=sysOppersonMapper.selectByExample(personExample);
		if(list.size()>0){
			person=list.get(0);
		}
		return person;
	}

	@Override
	public int save(String personJson) throws Exception {
		if(StringUtils.isEmpty(personJson)){
			throw new CustomException("person  save()---内容为空");
		}
		int count=0;
		CollectingData collecting = CollectingData.getInstance();
		SysOppersonVo vo = collecting.readValue(personJson, SysOppersonVo.class);
		String flag=vo.getDataFlag();
		if("new".equals(flag)){
			//添加人员信息
			SysOpperson person=this.copyProperties(vo);
			count=sysOppersonMapper.insertSelective(person);
			//添加到机构信息表
			SysOporg org=new SysOporg();
			org.setSid(vo.getSid()+"@"+vo.getSmainorgid());
			org.setVersion(vo.getVersion());
			org.setSfname(vo.getSfname()+"/"+vo.getSname());
			org.setSfcode(vo.getSfcode()+"/"+vo.getScode());
			org.setSfid(vo.getSfid()+"/"+vo.getSid()+"@"+vo.getSmainorgid()+".psm");
			org.setSparent(vo.getSmainorgid());
			org.setSname(vo.getSname());
			org.setScode(vo.getScode());
			org.setSlongname(vo.getSname());
			org.setSorgkindid("psm");
			org.setSsequence(vo.getSsequence()+"");
			org.setSphone(vo.getSmobilephone());
			org.setSaddress(vo.getSfamilyaddress());
			org.setSdescription(vo.getSdescription());
			org.setSvalidstate(vo.getSvalidstate());
			org.setSpersonid(vo.getSid());
			count=sysOporgMapper.insertSelective(org);
		}
		//更新数据
		if("edit".equals(flag)){
			SysOpperson personOld=sysOppersonMapper.selectByPrimaryKey(vo.getSid());
			String oldName=personOld.getSname();
			String oldCode=personOld.getScode();
			String newName=vo.getSname();
			String newCode=vo.getScode();
			SysOpperson person=this.copyProperties(vo);
			count=sysOppersonMapper.updateByPrimaryKeySelective(person);
			Map<String, String> map=new HashMap<String, String>();
			map.put("oldname", oldName);
			map.put("oldcode", oldCode);
			map.put("newname", newName);
			map.put("newcode", newCode);
			map.put("personId", vo.getSid());
			count=sysOporgMapper.updateOrgPathnodes(map);
					
		}
		return count;
	}
	
	private SysOpperson copyProperties(SysOppersonVo vo) throws IOException{
		SysOpperson person=new SysOpperson();
		person.setSid(vo.getSid());
		person.setScode(vo.getScode());
		person.setSname(vo.getSname());
		person.setSloginname(vo.getSloginname());
		person.setSidcard(vo.getSidcard());
		person.setVersion(vo.getVersion());
		person.setSnumb(vo.getSnumb());
		//默认密码
		String pwd = ContextUtils.getProperty("resetPassword");
		person.setSpassword(MD5Util.encode(pwd));
		person.setSpasswordtimelimit(new BigDecimal(0));
		person.setSpasswordmodifytime(new Date());
		person.setSmainorgid(vo.getSmainorgid());
		person.setSsafelevelid(vo.getSsafelevelid());
		person.setSsequence(vo.getSsequence());
		person.setSvalidstate(vo.getSvalidstate());
		person.setSdescription(vo.getSdescription());
		person.setSsex(vo.getSsex());
		person.setSbirthday(vo.getSbirthday());
		person.setSjoindate(vo.getSjoindate());
		person.setShomeplace(vo.getShomeplace());
		person.setSdegree(vo.getSdegree());
		person.setSgraduateschool(vo.getSgraduateschool());
		person.setSspeciality(vo.getSspeciality());
		person.setSschoollength(vo.getSschoollength());
		person.setStitle(vo.getStitle());
		person.setSmarriage(vo.getSmarriage());
		person.setScardno(vo.getScardkind());
		person.setScardkind(vo.getScardkind());
		person.setSfamilyaddress(vo.getSfamilyaddress());
		person.setSzip(vo.getSzip());
		person.setSmsn(vo.getSmsn());
		person.setSqq(vo.getSqq());
		person.setSmail(vo.getSmail());
		person.setSmobilephone(vo.getSmobilephone());
		person.setSfamilyphone(vo.getSfamilyphone());
		person.setSofficephone(vo.getSofficephone());
		person.setScountry(vo.getScountry());
		person.setScity(vo.getScity());
		person.setSpositions(vo.getSpositions());
		person.setSschool(vo.getSschool());
		person.setSstudy(vo.getSstudy());
		person.setSenglishname(vo.getSenglishname());
		return person;
	}

}
