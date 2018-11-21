package cn.yufei.ssm.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.util.StringUtils;

import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.SysOporgMapper;
import cn.yufei.ssm.system.mapper.SysOppersonMapper;
import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.po.SysOporgExample;
import cn.yufei.ssm.system.po.SysOpperson;
import cn.yufei.ssm.system.po.SysOppersonExample;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.service.SysService;
import cn.yufei.ssm.system.utils.MD5Util;
import cn.yufei.ssm.system.utils.OrgUtils;

@Service
public class SysServiceImpl implements SysService {

	// 注入mapper
	@Autowired
	private SysOppersonMapper personMapper;
	
	@Autowired
	private SysOporgMapper sysOporgMapper;

	@Override
	public String authenticat(String userCode, String password)
			throws Exception {
		// TODO Auto-generated method stub
		if(StringUtils.isEmpty(userCode)){
			throw new CustomException("用户账号不能为空");
		}
		
        if(StringUtils.isEmpty(password)){
        	throw new CustomException("用户密码不能为空");
		}
		
		SysOpperson person=this.findSysPersonByCode(userCode);
		if(person==null){
			throw new CustomException("用户账号不存在");
		}
		String password_db=person.getSpassword();
		//用户密码验证，忽略大小写
		if(!MD5Util.encode(password).equalsIgnoreCase(password_db)){
			throw new CustomException("用户名或密码错误");
		}
		//用户是否被禁用
		String  ban=person.getSvalidstate()+"";
		if(ban.trim().equals("0")){
			throw new CustomException("用户被禁用");
		}
		//认证通过,返回用户相关信息
		return person.getSid();
	}
	
	/**
	 * 根据用户账号查询用户信息
	 * @author LB
	 * @param userCode
	 * @return 
	 */
	public SysOpperson findSysPersonByCode(String userCode) throws Exception{
		if(StringUtils.isEmpty(userCode)){
			throw new CustomException("findSysPersonByCode-----用户账号不能为空");
		}
		SysOppersonExample personExample=new  SysOppersonExample();
		SysOppersonExample.Criteria criteria=personExample.createCriteria();
		criteria.andScodeEqualTo(userCode);
		List<SysOpperson> list=personMapper.selectByExample(personExample);
	    if(list!=null && list.size()==1){
	    	return list.get(0);
	    }else{
	    	return null;
	    }
	}
 
	@Override
	//根据用户id查询用户信息
	public SysOpperson findSysPersonById(String userID) throws Exception {
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("findSysPersonById-------用户id不能为空");
		}
		SysOpperson person=personMapper.selectByPrimaryKey(userID);
		return person;
	}

	@Override
	public String updatePassword(String userID, String pwd) throws Exception {
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("用户id不能为空");
		}
		if(StringUtils.isEmpty(pwd)){
			throw new CustomException("用户密码不能为空");
		}
		String result=null;
		SysOpperson person=new SysOpperson();
		person.setSid(userID);
		person.setSpassword(MD5Util.encode(pwd));
		int upFlag=personMapper.updateByPrimaryKeySelective(person);
		if(upFlag>0){
			result="sucess";
		}else{
			result="error";
		}
		return result;
	}

	@Override
	public UserContext getOrgDataByUserID(String userID) throws Exception {
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("getOrgDataByUserID()---用户id为空");
		}
		SysOporgExample orgExample=new SysOporgExample();
		SysOporgExample.Criteria criteria=orgExample.createCriteria();
		criteria.andSpersonidEqualTo(userID);
		List<SysOporg> list=sysOporgMapper.selectByExample(orgExample);
		UserContext context=new UserContext();
		if(list!=null && list.size()==1){
			SysOporg org=list.get(0);
			Map<String, String> result=OrgUtils.getOrgData(org.getSfid(), org.getSfcode(), org.getSfname());
			context.setUserId(userID);
			context.setUserOrgId(result.get("psmID"));
			context.setUserCode(result.get("psmCode"));
			context.setUserName(result.get("psmName"));
			context.setUserFullId(result.get("psmFullID"));
			context.setUserFullCode(result.get("psmFullCode"));
			context.setUserFullName(result.get("psmFullName"));
			context.setOrgId(result.get("orgID"));
			context.setOrgCode(result.get("orgCode"));
			context.setOrgName(result.get("orgName"));
			context.setDeptId(result.get("deptID"));
			context.setDeptCode(result.get("deptCode"));
			context.setDeptName(result.get("deptName"));
			context.setPosId(result.get("posID"));
			context.setPosCode(result.get("posCode"));
			context.setPosName(result.get("posName"));
	    }
		return context;
	}
	
	

}
