package cn.yufei.ssm.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yufei.ssm.system.po.FunctionTree;
import cn.yufei.ssm.system.po.Role;

public interface FunctionTreeMapper {
	
	//根据用户组织id查询用户功能菜单树
	List<FunctionTree> findMenuListByUserId(@Param("userOrgID") String userOrgID);
	//根据用户id查询角色信息 
	List<Role> findRoleListByUserId(@Param("userOrgID") String userOrgID);

}
