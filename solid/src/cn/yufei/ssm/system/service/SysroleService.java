package cn.yufei.ssm.system.service;

import java.util.List;





import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.po.Role;
import cn.yufei.ssm.system.po.RoleTree;
import cn.yufei.ssm.system.po.SysOprole;

public interface SysroleService {
	
	//根据用户id查询用户是否是管理员角色
	public boolean getManagerRoleByUserID(String userID) throws Exception;
	//根据用户id查询用户角色信息
	public List<Role> findRoleListByUserId(String userID) throws Exception;
	
	//构建角色树
	public List<RoleTree> findRoleTree() throws Exception;
	
	public SysOprole findRoleByID(String id) throws Exception;
	
	//根据code查询角色
	public SysOprole findRoleByCode(String code) throws Exception;
	
	//根据输入内容查询树节点
	public List<RoleTree> findRoleByText(String inputText) throws Exception;
	
	//新增角色
    public int save(String orgJson) throws Exception;
    
    //根据id删除角色信息，功能信息，权限信息
    public int deleteByIdAll(String id) throws Exception;
    
    //根据组织id查询未授权的角色列表
    public GridData findNotAuthorizeRole(String orgId,int page,int rows) throws Exception;

}
