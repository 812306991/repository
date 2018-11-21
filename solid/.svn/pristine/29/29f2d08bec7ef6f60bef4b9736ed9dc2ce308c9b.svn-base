var mainActivity = {};
var addManagerDialog,selectOrgDialog;
var queryOrgDialog;

//页面初始化
$(document).ready(function() {
	mainActivity.setLayout();
	mainActivity.loadGrid();
	mainActivity.loadTree();
	queryOrgDialog=new yufei.dialog({});
});

//设置Layout宽高
mainActivity.setLayout = function() {
	var height = $(window).height() - 8;
	$("#main_layout").layout("resize", {width : "100%",height : height + "px"});
};

mainActivity.openInputTextDialog=function(value,name){
	var inputText=value;
	if(inputText){
		yufei.ajax("/org/findByTextOrgListData.action",{"inputText":inputText,page:1,rows:5},function(data,state){
			if(state=="SUCCESS"){
				var checkData=JSON.parse(data);
				var rows=checkData.rows;
				if(rows.length>1){
					if(queryOrgDialog){
						var url=yufei.portal.contextRoot +"/core/system/org/dialog/query_org_dialog.html?inputText="+inputText;
						queryOrgDialog.open(url, function(data){
							if(data){
								mainActivity.positionOrgTreeNode(data);
							}
						}, null, "选择机构信息", 600, 300);
					}
				}else{
					mainActivity.positionOrgTreeNode(rows[0]);
				}
			}
		});
	}else{
		$.messager.alert('系统提示', '查询内容不能为空！', 'warning');
	}
	
};

mainActivity.positionOrgTreeNode=function(data){
	if(data){
		var searcherData=data;
		var orgTree=$.fn.zTree.getZTreeObj("orgTree");
		var mySelectID=null;
		if(data.hasOwnProperty('sfid')){
			mySelectID=searcherData.sfid.split("/");
		}else{
			mySelectID=searcherData.fullId.split("/");
		}
		var selectNode=null;
		if(mySelectID.length<1) return;
		if(mySelectID.length==1){
			if(searcherData.sid){
				var snode=orgTree.getNodeByParam("id",searcherData.sid);
				selectNode=snode;
				if(!searcherData.open){
					orgTree.selectNode(snode,false,true);
					orgTree.expandNode(snode);
				}
			}
		}else{
			for(var i=0;i<mySelectID.length;i++){
				var nodeid=mySelectID[i].indexOf(".")>0?mySelectID[i].substring(0,mySelectID[i].indexOf(".")):mySelectID[i];
			    if(nodeid){
			    	var snode=orgTree.getNodeByParam("id",nodeid);
			    	selectNode=snode;
			    			if(!snode.open){
			    				orgTree.selectNode(snode,false,true);
			    				orgTree.expandNode(snode);
			    			}
			    }
			}
		}
		if(selectNode!=null && !orgTree.isSelectedNode(selectNode)){
			orgTree.selectNode(selectNode,false);
		}
	}
};

//加载树节点
mainActivity.loadTree=function(){
	var setting = {
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "parent"
			}
		},
		async : {
			enable : true,// 是否异步加载
			url : yufei.portal.contextRoot + "/org/getOrgTree.action",
			autoParam : [ "id" ],// 异步发送请求时,表示自动传指定属性的参数值
			dataFilter : function(treeId, parentNode, childNodes) {// 这里由于本人设置的节点属性跟zTree不一致所以进行了过滤
				return childNodes;
			}
		},
		callback : {
			onAsyncSuccess: orgTreeOnAsyncSuccess,
			onClick:orgTreeOnclick
		}
	};
	
	yufei.ajax("/org/getOrgTree.action",{"id":""},function(aysData,state){
		var rows=JSON.parse(aysData);
		if(state=="SUCCESS"){
			$.fn.zTree.init($("#orgTree"), setting, rows);
			var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
		    //调用默认展开第一个结点    
		     var nodes = orgTree.getNodes();    
		     orgTree.expandNode(nodes[0], true);  
		     orgTree.selectNode(nodes[0],false,true);
			$('#grid_list').datagrid('load',{orgId:nodes[0].id,inputText:$("#gridInputText").val()});
		}
});
	

};
mainActivity.loadGrid=function(){
	$('#grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#grid_list").parent().height(),  
        striped:true,
        fitColumns:true,
        rownumbers:true,
        view:groupview,
        groupField:'smanagetypename',
        groupFormatter:function(value,rows){
            return '（'+value + '） - ' + rows.length + ' 分组';
        },
        url:yufei.portal.contextRoot + "/management/findByTextManagementData.action",  
        queryParams:{orgId:"",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'ck',checkbox:true,align: 'center',width:20},  
            {field:'smanagetypename',title: '业务管理类型',align: 'left',width:80},  
            {field:'sorgname',title: '管理组织名称',align: 'left',width:80},  
            {field:'smanageorgname',title: '被管理组织名称',align: 'left',width:80}, 
            {field:'screatetime',title: '分配时间',align: 'left',width:90,formatter:yufei.DateTimeFormatter}, 
            {field:'smanageorgfname',title: '被管理组织路径',align: 'left',width:180} 
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        }
    });
};

//单击树节点事件
function orgTreeOnclick(event,treeId,treeNode){
	var id=treeNode.id;
	$('#grid_list').datagrid('load',{orgId:id,inputText:$("#gridInputText").val()}); 
}

//异步加载组织节点
function orgTreeOnAsyncSuccess(event, treeId, treeNode, msg){
	var zTreeObj = $.fn.zTree.getZTreeObj(treeId);
    // 这个方法是将标准 JSON 嵌套格式的数据转换为简单 Array 格式
    var nodes = zTreeObj.transformToArray(zTreeObj.getNodes()); 
    for (var i = 0; i < nodes.length; i++) {
        // 判断节点是否已经加载过，如果已经加载过则不需要再加载
        if (!nodes[i].zAsync) {
            zTreeObj.reAsyncChildNodes(nodes[i], '', true);
        }
    }
}

mainActivity.queryGridListData=function(value,name){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
	var treeNode=orgTree.getSelectedNodes();
	$('#grid_list').datagrid('load',{orgId:treeNode[0].id,inputText:value});  
};

//分配业务权限
mainActivity.addManagerData=function(){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
	var treeNode=orgTree.getSelectedNodes();
	if(treeNode){
		if(!addManagerDialog) addManagerDialog=new yufei.dialog({});
		var url=yufei.portal.contextRoot +"/core/system/management/dialog/query_managerType_dialog.html";
		addManagerDialog.open(url, function(data){
			if(data){
				 var managerid=data.sid;
				if(!selectOrgDialog) selectOrgDialog=new yufei.dialog({});
				var orgUrl=yufei.portal.contextRoot +"/core/system/management/dialog/select_org_dialog.html";
				selectOrgDialog.open(orgUrl, function(orgData){
					if(orgData){
						//保存数据
					  var param={
							orgId: treeNode[0].id,
							manageTypeId:managerid,
							orgData:JSON.stringify(orgData)
					  };
					  yufei.ajax("/management/saveManagement.action",param,function(aysData,state){
							var rows=JSON.parse(aysData);
							if(state=="SUCCESS"){
							$.messager.alert('系统提示', rows.message, 'warning');
							$('#grid_list').datagrid('load',{orgId:treeNode[0].id,inputText:$("#gridInputText").val()});
							}
					});
					}
				}, null, "选择组织", 700, 450);
			}
		}, null, "选择业务管理类型", 480, 400);
	}
};
//删除
mainActivity.moveManagerData=function(){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	var treeNode=orgTree.getSelectedNodes();
	$.messager.confirm('提示', '删除后数据无法恢复，您确定要删除吗?', function(r){
		if (r){
			var checkData=$('#grid_list').datagrid("getChecked");
			var cheNode=new Array();
			if(checkData){
				for(var i=0;i<checkData.length;i++){
					cheNode.push(checkData[i].sid);
				}
				yufei.ajax("/management/deleteManagement.action",{"id":cheNode.join(",")},function(aysData,state){
					var rows=JSON.parse(aysData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						$('#grid_list').datagrid('load',{orgId:treeNode[0].id,inputText:$("#gridInputText").val()});
					}
			     });
			}else{
				$.messager.alert('系统提示', "请勾选需要删除的数据行", 'info');	
			}
		}
	});
};
