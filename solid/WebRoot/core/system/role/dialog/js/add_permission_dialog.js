var dataState;
$(function(){
	dataState=yufei.getUrlParam("dataState");
	var data=yufei.getUrlParam("data");
	var rowId=yufei.getUrlParam("rowid");
	if (dataState == "new") {
		var addData = JSON.parse(data);
			var json = {
					sid : yufei.getUuid(),
					version : 0,
					ssequence:1,
					scatalog:addData.name,
					srolekind:addData.id
					
					
				};
				$("#y-form").form('load', json);
	}else if(dataState=="edit"){
		$("#scode").textbox('disable');
	   //修改数据	
		if(rowId){
			yufei.ajax("/role/queryRoleById.action",{"id":rowId},function(aysData,state){
				var row=JSON.parse(aysData);
				if(state=="SUCCESS"){
					$("#y-form").form('load', row);
				}
			});
		}
	}else{
		$("#y-form").hide();
	}
});

function dailogEngin() {
	var code=$("#scode").textbox('getValue');
	var name=$("#sname").textbox('getValue');
	var srolekind=$("#srolekind").val();
	if(!name){
		$.messager.alert('系统提示', '名称不能为空！', 'warning');
		return false;
	}
	if(!code){
		$.messager.alert('系统提示', '编码不能为空！', 'warning');
		return false;
	}
	if(!srolekind){
		$.messager.alert('系统提示', '类型不能为空！', 'warning');
		return false;
	}
	if(dataState){
		var json = {
				dataFlag:dataState,
				sid : $("#sid").val(),
				version : $("#version").val(),
				srolekind : $("#srolekind").val(),
				scatalog : $("#scatalog").textbox('getValue'),
				sname : $("#sname").textbox('getValue'),
				scode : $("#scode").textbox('getValue'),
				sdescription :$('#sdescription').textbox('getValue')
			};
		return json;
	}else{
		return false;
	}
}