package com.yufei.doc.service.impl;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.po.UserContext;
import cn.yufei.ssm.system.utils.ContextUtils;
import cn.yufei.ssm.system.utils.StringUtils;
import cn.yufei.ssm.system.utils.Tools;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yufei.doc.mapper.SysDocnodeMapper;
import com.yufei.doc.po.DocTree;
import com.yufei.doc.po.SysDocnode;
import com.yufei.doc.po.SysDocnodeExample;
import com.yufei.doc.po.SysDocnodeWithBLOBs;
import com.yufei.doc.service.SysDocService;

@Service
@Scope("singleton")
public class SysDocServiceImpl implements SysDocService {
	
	@Autowired
	private SysDocnodeMapper sysDocnodeMapper;

	@Override
	public boolean isParentNode(String id) throws Exception {
		if(StringUtils.isEmpty(id)){
			throw new CustomException("isParentNode()---id不能为空");
		}
		boolean isParent=false;
		SysDocnodeExample  docExample=new SysDocnodeExample();
		SysDocnodeExample.Criteria criteria=docExample.createCriteria();
		criteria.andSparentidEqualTo(id);
		criteria.andSkindEqualTo("dir");
		criteria.andSflagEqualTo(new BigDecimal(1));
		List<SysDocnode> list =sysDocnodeMapper.selectByExample(docExample);
		if(list.size()>0){
			isParent=true;
		}
		return isParent;
	}

	@Override
	public List<SysDocnodeWithBLOBs> getDocTreeNode(String id) throws Exception {
		SysDocnodeExample docExample=new SysDocnodeExample();
		SysDocnodeExample.Criteria criteria=docExample.createCriteria();
		criteria.andSkindEqualTo("dir");
		criteria.andSflagEqualTo(new BigDecimal(1));
		if(StringUtils.isEmpty(id)){
			criteria.andSparentidIsNull();
		}else{
			criteria.andSparentidEqualTo(id);
		}
		List<SysDocnodeWithBLOBs> list=sysDocnodeMapper.selectByExampleWithBLOBs(docExample);
		return list;
	}
	
	@Override
	public List<DocTree> getDocTreeNode(List<SysDocnodeWithBLOBs> node)
			throws Exception {
		List<DocTree> tree=new ArrayList<DocTree>();
		for(SysDocnodeWithBLOBs dir:node){
			DocTree docTree=new DocTree();
			docTree.setId(dir.getSid());
			docTree.setName(dir.getSdocname());
			docTree.setParent(dir.getSparentid());
			docTree.setIsParent(this.isParentNode(dir.getSid()));
			docTree.setOpen(this.isOpen(dir.getSparentid()));
			tree.add(docTree);
		}
		return tree;
	}
	
	private boolean isOpen(String parentId){
		if(StringUtils.isEmpty(parentId)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int saveDir(HttpSession session,String jsonStr) throws Exception {
		if (StringUtils.isEmpty(jsonStr)) {
			throw new CustomException("Doc   dirSave()---内容为空");
		}
		UserContext context=(UserContext)session.getAttribute("userContext");
		JSONObject json=new JSONObject(jsonStr);
		String parentid=json.getString("sparentid");
		int count=0;
		if (!StringUtils.isEmpty(parentid)) {
			SysDocnodeWithBLOBs dirParent=sysDocnodeMapper.selectByPrimaryKey(parentid);
			SysDocnodeWithBLOBs dir=new SysDocnodeWithBLOBs();
			String path="";
			String uuid=Tools.getID();
			dir.setSid(uuid);
			dir.setVersion(new Long(0));
			dir.setSdocname(json.getString("sdocname"));
			dir.setSkind("dir");
			dir.setScreatorfid(context.getUserFullId());
			dir.setScreatorname(context.getUserName());
			dir.setScreatordeptname(context.getDeptName());
			dir.setScreatetime(Calendar.getInstance().getTime());
			dir.setSlastwriterfid(context.getUserFullId());
			dir.setSlastwriterdeptname(context.getDeptName());
			dir.setSlastwritername(context.getUserName());
			dir.setSlastwritetime(Calendar.getInstance().getTime());
			dir.setSflag(new BigDecimal(1));	
			if(dirParent!=null){
				path=dirParent.getSdocdisplaypath()+"/"+json.getString("sdocname");
				dir.setSparentid(dirParent.getSid());
				dir.setSdocpath(dirParent.getSdocpath()+"/"+uuid);
			}else{
				path="/文档中心"+"/"+json.getString("sdocname");
				dir.setSparentid("rootDoc");
				dir.setSdocpath("/rootDoc/"+uuid);
			}
			dir.setSdocdisplaypath(path);
			//生成文件夹目录
			String root=ContextUtils.getProperty("fileData");
			String dirPath=path.replace("/文档中心", root);
			count=sysDocnodeMapper.insertSelective(dir);
			File file = new File(dirPath.replace("/","\\"));
			if (!file.exists()) {
				file.mkdir();
			}
		}
		return count;
	}

	@Override
	public SysDocnodeWithBLOBs finDocDataById(String id) throws Exception {
		if (StringUtils.isEmpty(id)) {
			throw new CustomException("finDocDataById()---id为空");
		}
		return sysDocnodeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateDir(HttpSession session, String jsonStr) throws Exception {
		if (StringUtils.isEmpty(jsonStr)) {
			throw new CustomException("Doc   dirSave()---内容为空");
		}
		UserContext context=(UserContext)session.getAttribute("userContext");
		JSONObject json=new JSONObject(jsonStr);
		String id=json.getString("id");
		int count=0;
		if (!StringUtils.isEmpty(id)) {
			SysDocnodeWithBLOBs dirParent=sysDocnodeMapper.selectByPrimaryKey(id);
			//再更新相关子节点
			Map<String, String> map=new HashMap<String, String>();
			map.put("oldname", dirParent.getSdocname());
			map.put("newname", json.getString("sdocname"));
			map.put("editorfid", context.getUserFullId());
			map.put("editorname", context.getUserName());
			map.put("editordeptname", context.getDeptName());
			map.put("id", dirParent.getSid());
			//原文件夹路径
			String oldDirPath=dirParent.getSdocdisplaypath();
			String root=ContextUtils.getProperty("fileData");
			String dirPath=oldDirPath.replace("/文档中心", root);
			//新文件夹路径
			String newDirPath=oldDirPath.replace(dirParent.getSdocname(), json.getString("sdocname"));
			String newDir=newDirPath.replace("/文档中心", root);
			File file = new File(dirPath.replace("/","\\"));
			boolean isOk=file.renameTo(new File(newDir));
			if(isOk)
			count=sysDocnodeMapper.updateDocPath(map);
			SysDocnodeWithBLOBs dirParent1=sysDocnodeMapper.selectByPrimaryKey(id);
			//更新文件夹名称
			dirParent1.setSdocname(json.getString("sdocname"));
			count=sysDocnodeMapper.updateByPrimaryKeySelective(dirParent1);
		}
		return count;
	}

	@Override
	public GridData findFileDataByDirId(String dirId,String inputText, int page,int rows) throws Exception {
		if(StringUtils.isEmpty(dirId)){
			throw new CustomException("findFileDataByDirId()---dirId不能为空");
		}
		SysDocnodeExample docExample = new SysDocnodeExample();
		SysDocnodeExample.Criteria criteria = docExample.createCriteria();
		criteria.andSkindEqualTo("file");
		criteria.andSparentidEqualTo(dirId);
		criteria.andSflagEqualTo(new BigDecimal(1));
		if (!StringUtils.isEmpty(inputText)) {
			criteria.andSdocnameLike("%" + inputText + "%");
		}
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("ssequence asc");
		PageInfo<SysDocnodeWithBLOBs> pageInfo = new PageInfo<SysDocnodeWithBLOBs>(sysDocnodeMapper.selectByExampleWithBLOBs(docExample));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}

	

}
