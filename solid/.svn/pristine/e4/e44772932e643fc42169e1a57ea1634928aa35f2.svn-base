package cn.yufei.ssm.system.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.CollectingData;
import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.FunctionTreeMapper;
import cn.yufei.ssm.system.mapper.RoleTreeMapper;
import cn.yufei.ssm.system.mapper.SysOproleMapper;
import cn.yufei.ssm.system.po.Role;
import cn.yufei.ssm.system.po.RoleTree;
import cn.yufei.ssm.system.po.SysOprole;
import cn.yufei.ssm.system.po.SysOproleExample;
import cn.yufei.ssm.system.po.Vo.SysOproleVo;
import cn.yufei.ssm.system.service.SysOpauthorizeService;
import cn.yufei.ssm.system.service.SysOppermissionService;
import cn.yufei.ssm.system.service.SysroleService;
import cn.yufei.ssm.system.utils.StringUtils;

@Service
@Scope("singleton")
public class SysroleServiceImpl implements SysroleService{
	
	@Autowired
	private FunctionTreeMapper functionTreeMapper;
	
	@Autowired
	private RoleTreeMapper roleTreeMapper;
	
	@Autowired
	private SysOproleMapper sysOproleMapper;
	
	@Autowired
	private SysOpauthorizeService sysOpauthorizeService;
	
	@Autowired
	private SysOppermissionService sysOppermissionService;

	@Override
	public boolean getManagerRoleByUserID(String userID) throws Exception {
		boolean roleManager=false;
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("getManagerRoleByUserID()---用户id不能为空");
		}
		List<Role> list=findRoleListByUserId(userID);
		Role role=null;
		for(int i=0;i<list.size();i++){
			role=list.get(i);
			String roleCode=role.getRoleCode();
			String roleName=role.getRoleName();
			if(roleCode.equals("Administrator") || roleName.equals("Administrator")){
				roleManager=true;	
			}
		}
		return roleManager;
	}

	@Override
	public List<Role> findRoleListByUserId(String userID) throws Exception {
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("findRoleListByUserId()---用户id不能为空");
		}
		List<Role> list=functionTreeMapper.findRoleListByUserId(userID);
		return list;
	}

	//构建角色树
	@Override
	public List<RoleTree> findRoleTree() throws Exception {
		List<RoleTree> list=new ArrayList<RoleTree>();
		List<RoleTree> roleTree=roleTreeMapper.findRoleTree();
		if(roleTree!=null){
			for(RoleTree tree:roleTree){
				if(StringUtils.isEmpty(tree.getParent())){
					tree.setIcon("/solid/core/system/role/image/role_type.png");
				}else{
					tree.setIcon("/solid/core/system/role/image/role.png");
				}
				list.add(tree);
			}
			return list;
		}
		return null;
	}

	@Override
	public List<RoleTree> findRoleByText(String inputText) throws Exception {
		if(StringUtils.isEmpty(inputText)){
			throw new CustomException("findRoleByText()---输入内容不能为空");
		}
		return roleTreeMapper.findRoleByText(inputText);
	}

	@Override
	public int save(String orgJson) throws Exception {
		if (StringUtils.isEmpty(orgJson)) {
			throw new CustomException("role  save()---内容为空");
		}
		int count = 0;
		CollectingData collecting = CollectingData.getInstance();
		SysOproleVo vo = collecting.readValue(orgJson, SysOproleVo.class);
		String flag = vo.getDataFlag();
		SysOprole role=new SysOprole();
		role.setSid(vo.getSid());
		role.setVersion(vo.getVersion());
		role.setScode(vo.getScode());
		role.setSname(vo.getSname());
		role.setSsequence(new BigDecimal(1));
		role.setSrolekind(vo.getSrolekind());
		role.setSvalidstate(new BigDecimal(1));
		role.setScatalog(vo.getScatalog());
		role.setSdescription(vo.getSdescription());
		// 新增数据
		if ("new".equals(flag)) {
			count=sysOproleMapper.insertSelective(role);
		}
		// 更新数据
		if ("edit".equals(flag)) {
			count=sysOproleMapper.updateByPrimaryKeySelective(role);
		}
		return count;
	}

	@Override
	public SysOprole findRoleByID(String id) throws Exception {
		if (StringUtils.isEmpty(id)) {
			throw new CustomException("findRoleByID---id为空");
		}
		SysOprole role=sysOproleMapper.selectByPrimaryKey(id);
		if(role!=null) return role;
		return null;
	}

	@Override
	public SysOprole findRoleByCode(String code) throws Exception {
		if (StringUtils.isEmpty(code)) {
			throw new CustomException("findRoleByCode---code为空");
		}
		List<SysOprole> list=null;
		SysOproleExample roleExample=new SysOproleExample();
		SysOproleExample.Criteria criteria=roleExample.createCriteria();
		criteria.andScodeEqualTo(code);
		list=sysOproleMapper.selectByExample(roleExample);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public int deleteByIdAll(String id) throws Exception {
		if (StringUtils.isEmpty(id)) {
			throw new CustomException("Role deleteByIdAll---id为空");
		}
		int count=0;
		sysOproleMapper.deleteByPrimaryKey(id);
		sysOpauthorizeService.delteRoleByID(id);
		sysOppermissionService.deleteByRoleID(id);
		count=1;
		return count;
	}

	@Override
	public GridData findNotAuthorizeRole(String orgId,int page,int rows) throws Exception {
		if (StringUtils.isEmpty(orgId)) {
			throw new CustomException("Role findNotAuthorizeRole---orgID为空");
		}
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("scode asc");
		PageInfo<SysOprole> pageInfo = new PageInfo<SysOprole>(roleTreeMapper.findNotAuthorizeRole(orgId));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}
	
	

}
