package cn.yufei.ssm.system.core;

public enum ApplicationCode {
	SUCCESS("操作成功！", "10000"),FAIL("操作失败","10005"), LOGIN_ERROR("用户不存在或者密码错误！", "10001"), ERROR(
			"内部错误，请重试！", "10002"), LOGIN_SUCCESS("登陆成功！", "10003"), UN_AUTHORIZED(
			"权限不足！", "10004");

	private String message, code;

	private ApplicationCode(String message, String code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
