var rowId;
$(function(){
	rowId=yufei.getUrlParam("rowid");
	if(rowId){
		yufei.ajax("/doc/getDocById.action",{"id":rowId},function(aysData,state){
			var row=JSON.parse(aysData);
			row.screatetime=yufei.DateTimeFormatter(row.screatetime);
			row.slastwritetime=yufei.DateTimeFormatter(row.slastwritetime);
			row.skind="文件夹";
			if(state=="SUCCESS"){
				$("#y-form").form('load', row);
			}
		});
	}
});


function dailogEngin() {
	var sdocname=$("#sdocname").textbox('getValue');
	if(!sdocname){
		$.messager.alert('系统提示', '文件夹名称不能为空！', 'warning');
		return false;
	}else{
		var json = {
				id:rowId,
				sdocname:sdocname
			};
		return json;
	}
}