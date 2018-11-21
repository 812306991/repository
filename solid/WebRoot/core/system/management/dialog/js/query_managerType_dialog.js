$(function(){
	$('#mianGrid').datagrid({  
        width: 475,  
        height:300,  
        toolbar:"#toobar",
        striped: true,  
        singleSelect : true,  
        url:yufei.portal.contextRoot + "/baseCode/findBaseCodeListDataLike.action",  
        queryParams:{type:"managerType",inputText:""},  
        loadMsg:'数据加载中请稍后……',  
        rownumbers: true,  //是否显示列数     
        pageSize: 10,      
        pageList: [10, 20, 30],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'scode',title: '编码',align: 'left',width:120},  
            {field:'sname',title: '名称',align: 'left',width:180}  
            
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        }
    });
});

function queryGridListData(value,name){
	$('#mianGrid').datagrid('load',{type:"managerType",inputText:value});  
}
function dailogEngin() {
	var row = $('#mianGrid').datagrid('getSelected');
	if (row) {
		return row;
	} else {
		$.messager.alert('系统提示', '请选择需要查询的数据行！', 'warning');
		return false;
	}
}


