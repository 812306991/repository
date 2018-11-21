$(function(){
	var text=yufei.getUrlParam("inputText");
	$('#mianGrid').datagrid({  
            width: 595,  
            height:200,  
            striped: true,  
            singleSelect : true,  
            url:yufei.portal.contextRoot + "/org/findByTextOrgListData.action",  
            queryParams:{inputText:text},  
            loadMsg:'数据加载中请稍后……',  
            rownumbers: true,  //是否显示列数     
            pageSize: 5,      
            pageList: [5, 10, 15],      
            pagination: true, //是否启用分页
            columns:[[  
                {field:'scode',title: '编码',align: 'center',width:70},  
                {field:'sname',title: '名称',align: 'left',width:80},  
                {field:'sfname',title: '路径',align: 'left',width:330} 
            ]],
            onLoadSuccess:function(data){
            	$(this).datagrid("selectRow", 0);  
            }
        });
	
	
});

function dailogEngin() {
	var row = $('#mianGrid').datagrid('getSelected');
	if (row) {
		return row;
	} else {
		$.messager.alert('系统提示', '请选择需要查询的数据行！', 'warning');
		return false;
	}
}