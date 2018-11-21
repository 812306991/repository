package cn.yufei.ssm.system.service;

import java.util.List;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.po.SysOppermission;

public interface SysOppermissionService {
	
	//根据输入内容查询功能信息
	public GridData findByTextOppermissionData(String roleID,String inputText,int page,int rows) throws Exception;
	
	//根据角色id删除功能信息
	public int deleteByRoleID(String roleId) throws Exception;
	
	//添加功能
	public int addPermission(String roleID,String json) throws Exception;
	
	//根据id删除功能信息
	public int deletePermissionByID(String id) throws Exception;
	
	//根据角色id查询功能信息
	public List<SysOppermission> findPermissionByRoleID(String roleID) throws Exception;

}
