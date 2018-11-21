var login={};

$(function(){
	var tipError = $("#tip").val();
	if (tipError) {
		$("#tipSpan").html(tipError);
	}
	$("#remember_checkbox").on("change",null,function(event){  
		$.cookie("as_remember",this.checked, {expires:7,path:'/'}); 
	})[0].checked="false";
	if($.cookie("as_remember")=="true"){
		$("#userCode").textbox('setValue',$.cookie("yufei_username"));
	}else{
		$("#remember_checkbox").removeAttr("checked"); 
	}
});
//设置Layout宽高
login.loginSubmit = function() {
	var userCode=$("#userCode").textbox('getValue');
	var password=$("#password").textbox('getValue');
	var validateCode=$("#validateCode").textbox('getValue');
	var switchValidateCode=$("#switchValidateCode").val();
	if(userCode=="" || userCode==null){
		$("#tipSpan").html("用户账号不能为空");	
		return;
	}
	if(password=="" || password==null){
		$("#tipSpan").html("密码不能为空");	
		return;
	}
	if(switchValidateCode=="true"){
		if(!validateCode){
			$("#tipSpan").html("验证码不能为空");	
			return;
		}
	}
	
	$.cookie("yufei_username", userCode, {expires:7,path:'/'}); 
	
	$("#loginform").submit();
	//params.XX必须与Spring Mvc controller中的参数名称一致    
    //否则在controller中使用@RequestParam绑定  
    /*
	var params = {};  
    params.userCode = userCode;  
    params.password = password;  
    params.switchValidateCode = switchValidateCode; 
    params.validateCode = validateCode; 
	 $.ajax({
         type: "POST",
         url: "${pageContext.request.contextPath }/core/login.action",
         data:params,  
         dataType:"json",  
         success: function(data){
        	 var re=data.row;
        	 if(re.state=="SUCCESS"){
        		 window.location.href = window.location.href.replace("core/portal/login.jsp", "main.action");
        	 }
         }
      });*/
};
login.chageCode=function(){
	//链接后添加Math.random，确保每次产生新的验证码，避免缓存问题。
    $('#randomcode_img').attr('src',"${pageContext.request.contextPath }/core/authCode.action?abc="+Math.random());
};