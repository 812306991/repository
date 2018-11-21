package cn.yufei.ssm.system.po;

import cn.yufei.ssm.system.dal.object.Entity;

public class FunctionTree implements Entity{

	/**
	 * 功能 菜单树
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String url;
	private String process;
	private String activity;
	private String orgFullCode;
	private String orgCode;
	private String orgID;
	private String orgName;
	private String orgFullID;
	private String orgFullName;
	private String roleID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getOrgFullCode() {
		return orgFullCode;
	}
	public void setOrgFullCode(String orgFullCode) {
		this.orgFullCode = orgFullCode;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgID() {
		return orgID;
	}
	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgFullID() {
		return orgFullID;
	}
	public void setOrgFullID(String orgFullID) {
		this.orgFullID = orgFullID;
	}
	public String getOrgFullName() {
		return orgFullName;
	}
	public void setOrgFullName(String orgFullName) {
		this.orgFullName = orgFullName;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	
	
	
	
	

}
