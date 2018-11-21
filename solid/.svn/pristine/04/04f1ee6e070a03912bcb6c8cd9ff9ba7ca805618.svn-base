var dataState;
$(function(){
	dataState=yufei.getUrlParam("dataState");
	var data=yufei.getUrlParam("data");
	var rowId=yufei.getUrlParam("rowid");
	if (dataState == "new") {
		if (data) {
			var orgData = JSON.parse(data);
			var json;
			if (orgData) {
				json = {
					sid : yufei.getUuid(),
					version : 0,
					sfname : orgData.fullName,
					sfcode : orgData.fullCode,
					sfid : orgData.fullId,
					smainorgid : orgData.id,
					sprentName : orgData.fullName,
				};
				$("#y-form").form('load', json);
			}
		}
	}else if(dataState=="edit"){
		//修改数据	
		if(rowId){
			var parentName=yufei.getUrlParam("parentName");
			$("#sprentName").textbox('setValue',parentName);
			yufei.ajax("/person/getPersonId.action",{"id":rowId},function(aysData,state){
				debugger;
				var row=JSON.parse(aysData);
				if(state=="SUCCESS"){
					$("#y-form").form('load', row.row);
				}
			});
		}
	}else{
		$("#y-form").hide();
	}
	
});

function dailogEngin() {
	debugger;
	var personCode=$("#scode").textbox('getValue');
	var personName=$("#sname").textbox('getValue');
	if(!personName){
		$.messager.alert('系统提示', '姓名不能为空！', 'warning');
		return false;
	}
	if(!personCode){
		$.messager.alert('系统提示', '账号不能为空！', 'warning');
		return false;
	}
	
	//新增数据
	if (dataState) {
		var json = {
				dataFlag:dataState,
				sid : $("#sid").val(),
				version : $("#version").val(),
				sfname : $("#sfname").val(),
				sfcode : $("#sfcode").val(),
				sfid :$("#sfid").val(),
				smainorgid : $("#smainorgid").val(),
				sname :personName,
				scode : personCode,
				svalidstate:1,
				sidcard : $("#sidcard").textbox('getValue'),
				sloginname :$('#sloginname').textbox('getValue'),
				sfamilyaddress :$("#sfamilyaddress").textbox('getValue'),
				sdescription : $("#sdescription").textbox('getValue')
			};
		
		return json;
	}else{
		return false;
	}
}