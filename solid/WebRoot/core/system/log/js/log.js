var mainActivity = {};
var baseDialog;
//页面初始化
$(document).ready(function() {
	mainActivity.gridLoad();
});

mainActivity.gridLoad=function(){
	var text=$("#gridInputText").val();
	$('#mianGrid').datagrid({  
		width: '100%',  
        toolbar:"#toobar",
        height:$(window).height()-5,  
        striped:true,
        fitColumns:true,
        checkOnSelect:true,
        rownumbers:true,
        view:groupview,
        groupField:'sip',
        groupFormatter:function(value,rows){
            return '（'+value + '） - ' + rows.length + ' 分组';
        },
            url:yufei.portal.contextRoot + "/log/querylogList.action",  
            queryParams:{inputText:text},  
            loadMsg:'数据加载中请稍后……',  
            rownumbers: true,  //是否显示列数     
            pageSize: 20,      
            pageList: [20,30,40],      
            pagination: true, //是否启用分页
            columns:[[  
                 {field:'ck',checkbox:true,align: 'center',width:20},  
                {field:'sip',title: '访问ip',align: 'center',width:60},  
                {field:'susername',title: '用户名称',align: 'left',width:50},  
                {field:'screatetime',title: '访问时间',align: 'left',width:60,formatter:yufei.DateTimeFormatter},
                {field:'sdescription',title: '操作说明',align: 'left',width:100},
                {field:'sfunction',title: '访问地址',align: 'left',width:100},
                {field:'sexception',title:'描述信息',align:'left',width:200}
            ]],
            onLoadSuccess:function(data){
            	$(this).datagrid("selectRow", 0);  
            }
        });
};
//刷新
mainActivity.refreshData=function(){
	$('#mianGrid').datagrid('load',{inputText: $("#gridInputText").val()});  
};
mainActivity.queryGridListData=function(value,name){
	$('#mianGrid').datagrid('load',{inputText:value});  
};
//删除
mainActivity.moveLogData=function(){
		$.messager.confirm('提示', '您确定要删除该日志记录吗?', function(r) {
		var checkData = $('#mianGrid').datagrid("getChecked");
		var cheNode = new Array();
		if (checkData) {
			for (var i = 0; i < checkData.length; i++) {
				cheNode.push(checkData[i].sid);
			}
			yufei.ajax("/log/deleteLog.action", {"id" : cheNode.join(",")}, function(aysData, state) {
				var rows = JSON.parse(aysData);
				if (state == "SUCCESS") {
					$.messager.alert('系统提示', rows.message, 'warning');
					mainActivity.refreshData();
				}
			});
		} else {
			$.messager.alert('系统提示', "请勾选需要删除的数据行", 'info');
		}
	});
};