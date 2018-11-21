//退出
function logout(){
	$.messager.confirm('提示', '您确定要退出本系统吗?', function(r){
		if (r){
			window.location.href = window.location.href.replace("main.action", "core/logout.action");
		}
	});
}
//修改密码
function changePassword(){
	var $newpass = $('#txtNewPass');
    var $rePass = $('#txtRePass');
    if ($newpass.val() == '') {
        msgShow('系统提示', '请输入新密码！', 'warning');
        return false;
    }
    if ($rePass.val() == '') {
        msgShow('系统提示', '请在一次输入密码！', 'warning');
        return false;
    }

    if ($newpass.val() != $rePass.val()) {
        msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
        return false;
    }
    //params.XX必须与Spring Mvc controller中的参数名称一致    
    //否则在controller中使用@RequestParam绑定  
    var params = {};  
    params.newPwd = $newpass.val();  
    $.post(basePath+"/core/changePassword.action",params,function(data){
    	    	 msgShow('系统提示',data.message, 'info');
    	         $('#updatePasswordw').window('close');
    		  },"json");


    
}

//打开设置密码窗口
function openChangePwdWindow(){
	$('#updatePasswordw').window('open');
}