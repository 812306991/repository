package cn.yufei.ssm.system.mapper;
import java.util.List;

import cn.yufei.ssm.system.po.RoleTree;
import cn.yufei.ssm.system.po.SysOprole;

import org.apache.ibatis.annotations.Param;

public interface RoleTreeMapper {
	
	//角色树构建
	List<RoleTree> findRoleTree();
	
	//根据输入内容查询节点数据
	List<RoleTree> findRoleByText(@Param("inputText") String inputText);
	
	//根据组织id查询未授权的角色
	List<SysOprole> findNotAuthorizeRole(@Param("orgId") String inputText);

}
