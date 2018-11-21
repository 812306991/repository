package cn.yufei.ssm.system.po.Vo;

import cn.yufei.ssm.system.po.SysOprole;

public class SysOpauthorizeVo extends SysOprole{
	
	private String rolePath;
	private String funName;
	private String funUrl;
	private String funPath;
	public String getRolePath() {
		return rolePath;
	}
	public void setRolePath(String rolePath) {
		this.rolePath = rolePath;
	}
	public String getFunName() {
		return funName;
	}
	public void setFunName(String funName) {
		this.funName = funName;
	}
	public String getFunUrl() {
		return funUrl;
	}
	public void setFunUrl(String funUrl) {
		this.funUrl = funUrl;
	}
	public String getFunPath() {
		return funPath;
	}
	public void setFunPath(String funPath) {
		this.funPath = funPath;
	}

}
