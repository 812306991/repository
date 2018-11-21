package cn.yufei.ssm.system.service;

import java.math.BigDecimal;
import java.util.List;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.po.OrgTree;
import cn.yufei.ssm.system.po.SysOporg;

public interface SysOrgService {
	
	//根据id查询子节点机构数据
	public List<SysOporg> getChildOrgListByID(String id) throws Exception;
	
	//根据id查询所有父级节点数据
	public List<SysOporg> getParentOrgListByID(String id) throws Exception;
	
	//根据id判断是否是父节点
	public boolean isParentNode(String id) throws Exception;
	
	//展开机构节点
	public boolean isOpen(String parentId);
	
	//获取组织机构树
	public List<OrgTree> getOrgTreeNode(List<SysOporg> orgNode) throws Exception;
	
	//根据输入内容模糊查询机构信息列表、
	public GridData findByTextOrgData(String inputText,int page,int rows) throws Exception;
	
	//单击机构树查询机构列表
	public GridData findByOrgListOnTreeClick(String orgTreeId,String inputText,int page,int rows) throws Exception;
	
	//新增组织机构
	public int save(String orgJson) throws Exception;
	
	//根据id查询组织机构信息
	public SysOporg findOrgByID(String id) throws Exception;
	
	
	//组织机构禁用，启用
	public int updateBanOrg(String orgId,BigDecimal svalidstate) throws Exception;

	

}
