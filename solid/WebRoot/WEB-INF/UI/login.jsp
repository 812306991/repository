<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/UI/tag.jsp"%>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/UI/common_css.jsp"%>
<style type="text/css">
.panel {
	overflow: hidden;
	text-align: left;
	margin: auto;
	border: 0;
	border-radius: 0;
	position: absolute;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
}
</style>
</head>
<body style="background: #f6fdff ">

	<div style="width: 100%; height: 98%; position: relative;">

		<div style="width: 500px; height: 520px; margin: auto; position: absolute; top: 0; left: 0; bottom: 0; right: 0;">
			<form action="${pageContext.request.contextPath }/core/login.action"
				method="post" id="loginform">
				<div class="easyui-panel" title="用户登录"
					style="width: 100%; max-width: 400px; padding: 30px 60px; margin: auto;">
					<div style="margin-bottom: 10px">
						<span style="color: red;" id="tipSpan"></span>
					</div>
					<div style="margin-bottom: 10px">
						<input type="hidden" value="true" name="switchValidateCode"
							id="switchValidateCode"> <input type="hidden"
							value="${tipError }" name="tip" id="tip"> <input
							class="easyui-textbox" name="userCode" id="userCode"
							style="width: 100%; height: 40px; padding: 12px" value="${userCode}"
							data-options="prompt:'用户账号',iconCls:'icon-man',iconWidth:38">
					</div>
					<div style="margin-bottom: 10px">
						<input class="easyui-textbox" type="password" name="password" value="${password}"
							id="password" style="width: 100%; height: 40px; padding: 12px"
							data-options="prompt:'用户密码',iconCls:'icon-lock',iconWidth:38">
					</div>
					<div style="margin-bottom: 10px">
						<span>验证码：</span><input class="easyui-textbox" name="validateCode"
							id="validateCode" maxLength=5 size=10
							style="width: 155px; height: 36px;">&nbsp;<img
							src="${pageContext.request.contextPath }/core/authCode.action"
							 onclick="this.src=this.src+'?'" title="看不清？点击验证码刷新" align="top" 
							id="randomcode_img" style="cursor: pointer;width:65px;height:33px;" /><!-- <a
							href=javascript:login.chageCode()>刷新</a> -->
					</div>
					<div style="margin-bottom: 10px">
						<span>记住用户</span>
						<input id="remember_checkbox" type="checkbox" checked="checked" style="height: 17px;width:17px;margin-left:-1px;"/>
					</div>
					<div>
						<a href="javascript:login.loginSubmit()"  class="easyui-linkbutton"
							data-options="iconCls:'icon-ok'"
							style="padding: 5px 0px; width: 100%;"> <span
							style="font-size: 14px;">登录</span>
						</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript" src="${baseUrl}common/plug/jquery-easyui/jquery.min.js"></script>
<script type="text/javascript" src="${baseUrl}core/portal/js/jquery.cookie.js"></script>
<script type="text/javascript" src="${baseUrl}common/plug/jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${baseUrl}common/plug/jquery-easyui/themes/insdep/jquery.insdep-extend.min.js"></script>
<script type="text/javascript" src="${baseUrl}common/plug/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${baseUrl}core/portal/js/login.js"></script>
</html>