package cn.yufei.ssm.system.utils;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FunctionTreeUtils {
	
	private static final String FILE_POSTFIX = ".fun.xml";
	private static int init = 0;
	private String ParentID = "";
	private String tempParentID = "";
	
	@SuppressWarnings("unchecked")
	public String initFunctionTree(String filePathDir){
		Document doc = DocumentHelper.createDocument();
		Element docRoot = DocumentHelper.createElement("root");
		String realPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		realPath = realPath.substring(0, realPath.indexOf("WEB-INF"));
		realPath = realPath.replaceAll("%20", " ");
		filePathDir = realPath + filePathDir;
		if (!"".equals(filePathDir)) {
			List fileElementList = new ArrayList();
			List filePathList = generateFileList(filePathDir);
			for (int i = 0; i < filePathList.size(); i++) {
				String filePath = (String) filePathList.get(i);
				List tempList = generateNewByFile(filePath);
				fileElementList.addAll(tempList);
			}
			docRoot.clearContent();
			docRoot.setContent(fileElementList);
		}
		doc.add(docRoot);
		Element root = doc.getRootElement();
		List<String> path=new ArrayList<String>();
		return readElement(root,path);
	}
	
	/*
	 * 构建树：JSON
	 */
	@SuppressWarnings( { "unchecked", "unused" })
	private String readElement(Element ele,List<String> path)  {
		StringBuffer str = new StringBuffer();
		str.append("{");
		if("root".equals(ele.getName())){
			str.append("name:'");
			str.append("功能菜单',");
			str.append("open:'");
			str.append("true");
		}else{
			str.append("nodeName:'");
			str.append(ele.getName());
		}
		str.append("' ");
		List attrs = ele.attributes();
		int atsz = attrs.size();
		String urlR=null;
		if (atsz > 0) {
			for (int i = 0; i < atsz; i++) {
				str.append(", ");
				Attribute attr = (Attribute) attrs.get(i);
				if("label".equals(attr.getName())){
					str.append("name");
					str.append(":'");
					str.append(attr.getValue());
					str.append("'"); 
					str.append(","); 
					str.append("path");
					str.append(":'");
					str.append(StringUtils.join(path, "/"));
					str.append("' "); 
					path.add(attr.getValue());
				}else if("url".equals(attr.getName())){ 
					str.append("surl");
					str.append(":'");
					urlR=attr.getValue();
					urlR=(urlR.startsWith("/"))?urlR:"/"+urlR;
					str.append(urlR);
					str.append("' ");
				}else if("icon".equals(attr.getName())){
					str.append("sicon");
					str.append(":'");
					str.append(attr.getValue());
					str.append("' ");
				}else if("open".equals(attr.getName())){
					str.append("open");
					str.append(":'");
					str.append(attr.getValue());
					str.append("' ");
				}else{
					str.append(attr.getName());
					str.append(":'");
					str.append(attr.getValue());
					str.append("' ");  
				}
			}
		}
		str.append(", children:[");
		List eles = ele.elements();
		if (!eles.isEmpty()) {
			int elesz = eles.size();
			for (int i = 0; i < elesz; i++) {
				Element e = (Element) eles.get(i);
				if (i > 0)
					str.append(", ");
				str.append(readElement(e,path));
			}
		}
		str.append("]} ");
		if(path.size()>0){
			path.remove(path.size()-1);
		}
		return str.toString();
	}
	
	/**
	 * 菜单文件路径列表
	 * 
	 * @param fileDir
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List generateFileList(String fileDir) {
		ArrayList fileList = new ArrayList();
		File file = new File(fileDir);
		File[] subFiles = file.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				if (subFile.getName().contains(FILE_POSTFIX)) {
					fileList.add(fileDir + subFile.getName());
				}
			}
		}
		return fileList;
	}
	
	/**
	 * 创建临时菜单集合
	 * 
	 * @param filePath
	 *            菜单文件
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List generateNewByFile(String filePath) {
		ArrayList elementList = new ArrayList();
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(filePath);
			Element root = doc.getRootElement();
			elementList = (ArrayList) root.elements();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return elementList;
	}

}
