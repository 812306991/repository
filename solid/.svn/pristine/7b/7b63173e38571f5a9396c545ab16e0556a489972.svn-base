package cn.yufei.ssm.system.service;

import cn.yufei.ssm.system.po.SysOpperson;
import cn.yufei.ssm.system.po.UserContext;

public interface SysService {
	
	//根据用户名和密码认证
	public String authenticat(String userCode,String password) throws Exception;
	//根据用户名查询用户信息
	public SysOpperson findSysPersonByCode(String userCode) throws Exception;
	//根据用户id查询用户信息
	public SysOpperson findSysPersonById(String userID)throws Exception;
    //根据用户id修改用户密码
	public String updatePassword(String userID,String pwd)throws Exception;
	//根据用户id查询组织机构信息
	public UserContext getOrgDataByUserID(String userID) throws Exception;
	
	
}
