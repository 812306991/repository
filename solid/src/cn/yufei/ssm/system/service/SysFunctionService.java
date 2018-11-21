package cn.yufei.ssm.system.service;

public interface SysFunctionService {
	
	//初始化功能配置文件
	public void intial();
	
	//根据用户获取功能菜单树
	public String getFunctionTreeByUserOrgID(String userID) throws Exception;

}
