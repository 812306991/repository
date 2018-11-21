package cn.yufei.ssm.system.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

import cn.yufei.ssm.system.utils.StringUtils;
import cn.yufei.ssm.system.utils.Tools;
import cn.yufei.ssm.system.po.FunctionTree;
import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.po.SysOporgExample;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.FunctionTreeMapper;
import cn.yufei.ssm.system.mapper.SysOporgMapper;
import cn.yufei.ssm.system.service.SysFunctionService;

@Service
@Scope("singleton")
public class SysFunctionServiceImpl implements SysFunctionService {
	
	private Logger log=Logger.getLogger(this.getClass());
	
	  // 注入mapper
	@Autowired
	private FunctionTreeMapper functionTreeMapper;
	@Autowired
	private SysOporgMapper sysOporgMapper;
	
	private Document docFun=null;
	
	private final String baseName="/solid/";
	
	
	
	@Override
	@PostConstruct
	public void intial() {
		String readPath=Thread.currentThread().getContextClassLoader().getResource("").toString();
		readPath=readPath.replace("file:/", "");
		readPath=readPath.substring(0,readPath.indexOf("WEB-INF"));
		readPath=readPath.replaceAll("%20", " ");
		String filePaths="WEB-INF/fun_tree/";
		if ((filePaths != null) && (!"".equals(filePaths)))
			filePaths = readPath + filePaths;
		else
			filePaths = "";
		docFun=DocumentHelper.createDocument();
		Element root=DocumentHelper.createElement("root");
		if(!"".equals(filePaths)){
			List fileElementList=new ArrayList();
			List filePathList=getFileList(filePaths);
			for(int i=0;i<filePathList.size();i++){
				String filePath=(String) filePathList.get(i);
				List tempList=null;
				try {
					tempList=generateNewByFile(filePath);
				} catch (Exception e) {
					// TODO: handle exception
					log.info("解析功能树文件出错"+filePath,e);
					System.exit(0);
				}
				fileElementList.addAll(tempList);
			}
			root.setContent(fileElementList);
		}
		docFun.add(root);
	}

	@Override
	public String getFunctionTreeByUserOrgID(String userID) throws Exception {
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("getFunctionTreeByUserOrgID()---用户id不能为空");
		}
		Map<String,Set<FunctionTree>> have=getPermissionList(userID);
		if(have!=null){
			Element root=docFun.getRootElement();
			return readElement(have,root);
		}
		return null;
	}
	
	private Map<String,Set<FunctionTree>> getPermissionList(String userID) throws Exception{
		if(StringUtils.isEmpty(userID)){
			throw new CustomException("getPermissionList(String userID)----用户id不能为空");
		}
		SysOporg org=null;
		SysOporgExample sysOporgExample=new  SysOporgExample();
		SysOporgExample.Criteria criteria=sysOporgExample.createCriteria();
		criteria.andSpersonidEqualTo(userID);
		List<SysOporg> list=sysOporgMapper.selectByExample(sysOporgExample);
		List<FunctionTree> listFun=null;
	    if(list!=null && list.size()==1){
	    	org=list.get(0);
	    }else{
	    	return null;
	    }
	    if(org!=null){
	    	listFun=functionTreeMapper.findMenuListByUserId(userID);
	    	for(FunctionTree function :listFun){
	    		function.setOrgCode(org.getScode());
	    		function.setOrgName(org.getSname());
	    		function.setOrgFullID(org.getSfid());
	    		function.setOrgFullName(org.getSfname());
	    	}
	    }
	    return filterFunction(listFun);
	}
	
	private Map<String,Set<FunctionTree>> filterFunction(List<FunctionTree> list){
		Map<String,Set<FunctionTree>> map=new HashMap<String, Set<FunctionTree>>();
		if(list==null) return map;
		FunctionTree funTree=null;
		String url=null,activity=null;
		Set<FunctionTree> set=null;
		for(int i=0;i<list.size();i++){
			funTree=list.get(i);
			url=funTree.getUrl();
			activity=(StringUtils.isEmpty(funTree.getActivity())?"":funTree.getActivity());
			set=map.get(url+activity);
			if(set==null){
				set=new HashSet<FunctionTree>();
				map.put(url+activity, set);
			}
			for(FunctionTree function:set){
				if(function.getOrgCode().equals(funTree.getOrgCode())){
					continue;
				}
			}
			set.add(funTree);
		}
		return map;
	}
	
	private List getFileList(String fileDir){
		ArrayList fileList=new ArrayList();
		File file=new File(fileDir);
		File[] files=file.listFiles();
		for(File subFile:files){
			if((!subFile.isFile())  || (!subFile.getName().contains(".fun.xml")))
				continue;
			fileList.add(fileDir+subFile.getName());
		}
		return fileList;
	}
	
	private List<Element> generateNewByFile(String filePath) throws Exception{
		ArrayList elementList=new ArrayList();
		SAXReader reader=new SAXReader();
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		Document doc=reader.read(filePath);
		Element root=doc.getRootElement();
		elementList=(ArrayList) root.elements();
		renderFileAddId(elementList);
		XMLWriter writer=new XMLWriter(new FileOutputStream(filePath),format);
		writer.write(doc);
		writer.close();
		return elementList;
		
	}
	
	//递归处理文档，主要为其添加id
	private void renderFileAddId(List<Element> list) throws CustomException{
		String tagName=null;
		Element e=null;
		Attribute a=null,a1=null;
		for(int i=0;i<list.size();i++){
			e=list.get(i);
			tagName=e.getName();
			if("item".equals(tagName.toLowerCase())){
				a=e.attribute("url");
				if(a!=null){
					a1=e.attribute("id");
					if(a1==null){
						e.addAttribute("id",Tools.getID());
					}
				}else{
					renderFileAddId(e.elements());
				}
			}else{
				throw new CustomException("renderFileAddId()---fun.xml出错，无法解析的标签名称："+tagName);
			}
		}
	}
	
	//递归调用解析
	private String readElement(Map<String,Set<FunctionTree>> autherSet,Element ele){
		StringBuffer str = new StringBuffer();
		StringBuffer tempStr = new StringBuffer();
		tempStr.append("{");
		tempStr.append("nodeName:'");
		tempStr.append(ele.getName());
		tempStr.append("' ");
		List attrs = ele.attributes();
		int atsz = attrs.size();
		String url = null;
		String authurl = null;
		String process = "";
		String activity = "", display = "";
		boolean isEff = isEffective(autherSet, ele);
		boolean isHiden = false;
		String attrName = null, attrValue = null;
		for (int i = 0; i < atsz; i++) {
			tempStr.append(", ");
			Attribute attr = (Attribute) attrs.get(i);
			attrName = attr.getName();
			attrValue = attr.getValue();
			if ("url".equals(attrName)) {
				attrValue=(attrValue.startsWith("/"))?attrValue:"/"+attrValue;
				url =attrValue;   
			} else if ("process".equals(attrName)) {
				process = attrValue;
			} else if ("activity".equals(attrName)) {
				activity = attrValue;
			} else if ("display".equals(attrName)) {
				display = ele.attributeValue("display");
			}
			tempStr.append(attrName);
			tempStr.append(":'");
			tempStr.append(attrValue);
			tempStr.append("' ");
		}
		if (url == null) {
			url = "";
		}
		if ("hide".equals(display)) {
			isHiden = true;
		}
		if ((activity != null) && (!"".equals(activity)))
			authurl = url + activity;
		else {
			authurl = url;
		} 
		Element e = null;
		tempStr.append(", childNodes:[");
		if ((!isHiden)
				&& ((("".equals(url)) && (isEff)) || (isHaveAuther(autherSet,
						authurl)))) {
			str.append(tempStr);
			List eles = ele.elements();
			int elesz = eles.size();
			for (int i = 0; i < elesz; i++) {
				e = (Element) eles.get(i); 
				if (isEffective(autherSet, e)) {
					if (i > 0) {
						str.append(", ");
					}
					str.append(readElement(autherSet, e));
				}
			}
			str.append("]} ");
		}
		return str.toString();
	}
	
	private boolean isEffective(Map<String,Set<FunctionTree>> autherSet, Element ele) {
		boolean eff = false;
		List eles = ele.elements();
		String url = ele.attributeValue("url");
		String process = ele.attributeValue("process");
		String activity = ele.attributeValue("activity");
		String display = ele.attributeValue("display");
		String authurl = null;
		if (url == null) {
			url = "";
		}
		if (!StringUtils.isEmpty(activity))
			authurl = url + activity;
		else {
			authurl = url;
		}
		authurl=(authurl.startsWith("/"))?authurl:"/"+authurl;
		if ((!"".equals(url)) && (isHaveAuther(autherSet, authurl))
				&& (!"hide".equals(display))) {
			return true;
		}
		if ("".equals(url)) {
			for (int i = 0; i < eles.size(); i++) {
				Element e = (Element) eles.get(i);
				eff = isEffective(autherSet, e);
				if (eff) {
					return true;
				}
			}
		}
		return eff;
	}
	private boolean isHaveAuther(Map<String,Set<FunctionTree>> autherSet, String key) {
		return autherSet.containsKey(key);
	}
	

}
