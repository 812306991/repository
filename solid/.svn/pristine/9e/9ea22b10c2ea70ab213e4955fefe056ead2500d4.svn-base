<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
			body{ margin:0; padding:0; background:#efefef; font-family:Georgia, Times, Verdana, Geneva, Arial, Helvetica, sans-serif; }
			div#mother{ margin:0 auto; width:auto; height:800px; position:relative; }
			div#errorBox{ background: url(/solid/core/portal/image/404_bg.png) no-repeat top left; width:943px; height:572px; margin:auto; position: absolute; top: 0; left: 0; bottom: 0; right: 0;}
			div#errorText{ color:red; padding:146px 0 0 446px;height:220px; }
			div.link{ /*background:#f90;*/ height:50px; width:145px; float:left; }
			div#home{ margin:30px 0 0 444px;}
			div#contact{ margin:30px 0 0 25px;}
			h1{ font-size:40px; margin-bottom:35px; }
</style>
</head>
<body>
<div id="mother" >
			<div id="errorBox">
				<div id="errorText">
					${message}
				</div>
				<a href="${pageContext.request.contextPath }/core/logout.action" title="返回登录页"><div class="link" id="home"></div></a>
				<a href="http://www.cssmoban.com/" title="联系管理员">
					<div class="link" id="contact"></div>
				</a>
			</div>
		</div>

</body>
</html>