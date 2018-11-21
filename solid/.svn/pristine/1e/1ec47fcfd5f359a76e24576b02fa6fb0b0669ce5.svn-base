var rowId;
$(function(){
	rowId=yufei.getUrlParam("rowid");
			var json = {
					sdocname : "新建文件夹",
					sdescription:""
				};
				$("#y-form").form('load', json);
	
});

function dailogEngin() {
	var sdocname=$("#sdocname").textbox('getValue');
	var sdescription=$("#sdescription").textbox('getValue');
	if(!sdocname){
		$.messager.alert('系统提示', '文件夹名称不能为空！', 'warning');
		return false;
	}else{
		var json = {
				sparentid:rowId,
				sdocname:sdocname,
				sdescription : sdescription
			};
		return json;
	}
}