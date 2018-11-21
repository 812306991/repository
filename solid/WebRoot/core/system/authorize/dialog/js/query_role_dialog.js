$(function(){
	var orgId=yufei.getUrlParam("orgId");
	if(orgId){
		$('#mianGrid').datagrid({  
			width: '100%',  
		    height:300,  
            striped:true,
            fitColumns:true,
            checkOnSelect:true,
            url:yufei.portal.contextRoot + "/role/findNotAuthorizeListData.action",  
            queryParams:{orgId:orgId},  
            loadMsg:'数据加载中请稍后……',  
            rownumbers: true,  //是否显示列数     
            pageSize: 5,      
            pageList: [5, 10, 15],      
            pagination: true, //是否启用分页
            columns:[[  
                {field:'ck',checkbox:true,align: 'center',width:20},  
                {field:'scode',title: '编码',align: 'center',width:100},  
                {field:'sname',title: '名称',align: 'left',width:100} 
            ]]
        });
	}
});

function dailogEngin() {
	var checkData=$('#mianGrid').datagrid("getChecked");
	if (checkData.length>0) {
		return checkData;
	} else {
		$.messager.alert('系统提示', '请选择需要分配的角色！', 'warning');
		return false;
	}
}