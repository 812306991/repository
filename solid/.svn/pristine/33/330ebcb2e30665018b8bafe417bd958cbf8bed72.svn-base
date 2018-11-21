package cn.yufei.ssm.system.utils;

import java.util.HashMap;
import java.util.Map;


public class OrgUtils {
	
	//组织机构树的图标设置
	public static String getIcon(String kind){
		String icon="";
		switch(kind){
		case "ogn":
			icon="/solid/core/system/org/image/org.png";
			break;
		case "org":
			icon="/solid/core/system/org/image/org.png";
			break;
		case "dept":
			icon="/solid/core/system/org/image/dept.png";
			break;
		case "pos":
			icon="/solid/core/system/org/image/post.png";
			break;
		case "psm":
			icon="/solid/core/system/org/image/person.png";
			break;
		default	:
			icon="";
		}
		
		return icon;
	}
	
	public static Map<String,String> getOrgData(String fullID,String fullCode,String fullName){
		String[] idsArray=fullID.split("/");
		String[] codesArray=fullCode.split("/");	
		String[] namesArray=fullName.split("/");
		String SUFFIX_ORGAN = ".org";
		String SUFFIX_DEPT = ".dept";
		String SUFFIX_POSITION = ".pos";
		String SUFFIX_EMPLOYEE = ".psm";
		int idxOrgan = -1, idxDept = -1, idxPosition = -1, idxEmployee = -1;
		for (int i = idsArray.length - 1; i >= 0; i--) {
			if (idsArray[i].endsWith(SUFFIX_EMPLOYEE)) {
				if (idxEmployee == -1) {
					idxEmployee = i;
				}
				continue;
			} else if (idsArray[i].endsWith(SUFFIX_POSITION)) {
				if (idxPosition == -1) {
					idxPosition = i;
				}
				continue;
			} else if (idsArray[i].endsWith(SUFFIX_DEPT)) {
				if (idxDept == -1) {
					idxDept = i;
				}
				continue;
			} else if (idsArray[i].endsWith(SUFFIX_ORGAN)) {
				if (idxOrgan == -1) {
					idxOrgan = i;
				}
				break;
			}
		}
		String orgID=(idxOrgan == -1 ? "" : idsArray[idxOrgan].substring(0, idsArray[idxOrgan].length()- SUFFIX_ORGAN.length()));
		String orgCode=(idxOrgan == -1 ? "" : codesArray[idxOrgan].substring(0, codesArray[idxOrgan].length()));
		String orgName=(idxOrgan == -1 ? "" : namesArray[idxOrgan].substring(0, namesArray[idxOrgan].length()));
		String deptID=(idxDept == -1 ? "" : idsArray[idxDept].substring(0, idsArray[idxDept].length() - SUFFIX_DEPT.length()));
		String deptCode=(idxDept == -1 ? "" : codesArray[idxDept].substring(0, codesArray[idxDept].length()));
		String deptName=(idxDept == -1 ? "" : namesArray[idxDept].substring(0, namesArray[idxDept].length()));
		String posID=(idxPosition == -1 ? "": idsArray[idxPosition].substring(0, idsArray[idxPosition].length()- SUFFIX_POSITION.length()));
		String posCode=(idxPosition == -1 ? "": codesArray[idxPosition].substring(0, codesArray[idxPosition].length()));
		String posName=(idxPosition == -1 ? "": namesArray[idxPosition].substring(0, namesArray[idxPosition].length()));
		String psmID=(idxEmployee == -1 ? "": idsArray[idxEmployee].substring(0, idsArray[idxEmployee].length()- SUFFIX_EMPLOYEE.length()));
		String psmCode=(idxEmployee == -1 ? "": codesArray[idxEmployee].substring(0, codesArray[idxEmployee].length()));
		String psmName=(idxEmployee == -1 ? "": namesArray[idxEmployee].substring(0, namesArray[idxEmployee].length()));
		Map<String, String> result = new HashMap<String, String>();
		result.put("orgID", orgID);
		result.put("orgCode", orgCode);
		result.put("orgName", orgName);
		result.put("deptID", deptID);
		result.put("deptCode", deptCode);
		result.put("deptName", deptName);
		result.put("posID", posID);
		result.put("posCode", posCode);
		result.put("posName", posName);
		result.put("psmID", psmID);
		result.put("psmCode", psmCode);
		result.put("psmName", psmName);
		result.put("psmFullID", fullID);
		result.put("psmFullCode", fullCode);
		result.put("psmFullName", fullName);
		return result;

	}
	
	

}
