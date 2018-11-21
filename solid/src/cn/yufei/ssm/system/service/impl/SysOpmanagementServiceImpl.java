package cn.yufei.ssm.system.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.SysBasecodeMapper;
import cn.yufei.ssm.system.mapper.SysOpmanagementMapper;
import cn.yufei.ssm.system.mapper.SysOporgMapper;
import cn.yufei.ssm.system.po.OrgTree;
import cn.yufei.ssm.system.po.SysBasecode;
import cn.yufei.ssm.system.po.SysOpmanagement;
import cn.yufei.ssm.system.po.SysOpmanagementExample;
import cn.yufei.ssm.system.po.SysOpmanagementExample.Criteria;
import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.service.SysOpmanagementService;
import cn.yufei.ssm.system.utils.StringUtils;
import cn.yufei.ssm.system.utils.Tools;


@Service
@Scope("singleton")
public class SysOpmanagementServiceImpl implements SysOpmanagementService {
	
	@Autowired
	private SysOporgMapper sysOporgMapper;
	
	@Autowired
	private SysOpmanagementMapper sysOpmanagementMapper;
	
	@Autowired
	private SysBasecodeMapper sysBasecodeMapper;

	//分配管理权限
	@Override
	public int save(HttpServletRequest request,String orgId, String manageTypeId, String orgData)
			throws Exception {
		if(StringUtils.isEmpty(orgId)){
			throw new CustomException("management  save()---orgId不能为空");
		}
		if(StringUtils.isEmpty(manageTypeId)){
			throw new CustomException("management  save()---manageTypeId不能为空");
		}
		if(StringUtils.isEmpty(orgData)){
			throw new CustomException("management  save()---orgData不能为空");
		}
		int count=0;
		 HttpSession session=request.getSession();
		 UserContext context=(UserContext)session.getAttribute("userContext");
		
		//根据机构id查询机构信息
		SysOporg org=sysOporgMapper.selectByPrimaryKey(orgId);
		//根据管理类型id查询管理类型信息
		SysBasecode managerType=sysBasecodeMapper.selectByPrimaryKey(manageTypeId);
		//遍历机构数据
		ObjectMapper mapper=new ObjectMapper();
		JavaType javaType=mapper.getTypeFactory().constructParametricType(ArrayList.class, OrgTree.class);
		List<OrgTree> list= mapper.readValue(orgData,javaType);
		SysOpmanagement management=new SysOpmanagement();
		if(org!=null && managerType!=null){
			for(int i=0;i<list.size();i++){
				OrgTree orgTree=list.get(i);
				//插入数据管理类型表并保存
				management.setSid(Tools.getID());
				management.setVersion(new BigDecimal(0));
				management.setSorgid(org.getSid());
				management.setSorgname(org.getSname());
				management.setSorgfid(org.getSfid());
				management.setSorgfname(org.getSfname());
				management.setSmanageorgid(orgTree.getId());
				management.setSmanageorgname(orgTree.getName());
				management.setSmanageorgfid(orgTree.getFullId());
				management.setSmanageorgfname(orgTree.getFullName());
				management.setSmanagetypeid(managerType.getSid());
				management.setSmanagetypename(managerType.getSname());
				management.setScreatorfid(context.getUserFullId()); 
				management.setScreatorfname(context.getUserFullName());
				management.setScreatetime(Calendar.getInstance().getTime());
				count=sysOpmanagementMapper.insertSelective(management);
			}
		}
		return count;
	}

	@Override
	public GridData findByTextManagementData(String orgId, String inputText,int page, int rows) throws Exception {
		if(StringUtils.isEmpty(orgId)){
			throw new CustomException("findByTextManagementData()---orgId不能为空");
		}
		SysOpmanagementExample managementExample=new SysOpmanagementExample();
		Criteria criteria=managementExample.createCriteria();
		criteria.andSorgidEqualTo(orgId);
		if(!StringUtils.isEmpty(inputText)){
			criteria.andSmanagetypenameLike("%"+inputText+"%");
			SysOpmanagementExample.Criteria criteria1= managementExample.or();
			criteria1.andSmanageorgnameLike("%"+inputText+"%");
		}
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("sorgname asc");
		PageInfo<SysOpmanagement> pageInfo = new PageInfo<SysOpmanagement>(sysOpmanagementMapper.selectByExample(managementExample));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}

	@Override
	public int deleteById(String id) throws Exception {
		if(StringUtils.isEmpty(id)){
			throw new CustomException("management deleteById()---id不能为空");
		}
		String[] ids=id.split(",");
		int count=0;
		for(int i=0;i<ids.length;i++){
			count=sysOpmanagementMapper.deleteByPrimaryKey(ids[i]);
		}
		return count;
	}

}
