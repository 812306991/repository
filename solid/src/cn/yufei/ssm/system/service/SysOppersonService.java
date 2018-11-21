package cn.yufei.ssm.system.service;

import cn.yufei.ssm.system.po.SysOpperson;


public interface SysOppersonService {
	
	//根据用户id重置密码
	public int updateResetPassword(String userId) throws Exception;
	
	//根据用户id查询用户信息
	public SysOpperson findPersonById(String id) throws Exception;
	
	//根据用户账号查询用户信息
	public SysOpperson findPersonByCode(String code) throws Exception;
	
	//保存人员信息
	public int save(String personJson) throws Exception;

}
