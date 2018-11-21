package cn.yufei.ssm.system.service;

import javax.servlet.http.HttpServletRequest;

import cn.yufei.ssm.system.core.data.GridData;

public interface SysOpmanagementService {
	
	public int save(HttpServletRequest request,String orgId,String manageTypeId,String orgData)throws Exception;
	
	//根据输入内容查询授权信息
	public GridData findByTextManagementData(String orgId,String inputText,int page,int rows) throws Exception;
	
	//删除
	public int deleteById(String id)throws Exception;

}
