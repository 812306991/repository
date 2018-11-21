var mainActivity = {};
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
					$('#authorize_grid_list').datagrid('load',{orgid:selectNode.id,orgFid: selectNode.fullId,inputText:$("#gridInputText").val()});
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
			    				$('#authorize_grid_list').datagrid('load',{orgid:selectNode.id,orgFid: selectNode.fullId,inputText:$("#gridInputText").val()});
			    			}
			    }
			}
		}
		if(selectNode!=null && !orgTree.isSelectedNode(selectNode)){
			orgTree.selectNode(selectNode,false);
			$('#authorize_grid_list').datagrid('load',{orgid:selectNode.id,orgFid: selectNode.fullId,inputText:$("#gridInputText").val()});
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
			$('#authorize_grid_list').datagrid('load',{orgid:nodes[0].id,orgFid: nodes[0].fullId,inputText:$("#gridInputText").val()});
		}
});
	

};
mainActivity.loadGrid=function(){
	$('#authorize_grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#authorize_grid_list").parent().height(),  
        striped:true,
        fitColumns:true,
        rownumbers:true,
        view:groupview,
        groupField:'sname',
        groupFormatter:function(value,rows){
            return '（'+value + '） - ' + rows.length + ' 分组';
        },
        url:yufei.portal.contextRoot + "/authorize/findAllAuthorizeData.action",  
        queryParams:{orgid:"",orgFid:"",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'scode',title: '角色编码',align: 'left',width:80},  
            {field:'sname',title: '角色名称',align: 'left',width:90},  
            {field:'rolePath',title: '角色路径',align: 'left',width:120},  
            {field:'funName',title: '功能名称',align: 'left',width:90},
            {field:'funUrl',title: '功能地址',align: 'left',width:150},
            {field:'funPath',title: '功能路径',align: 'left',width:120},
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        }
    });
};

//单击树节点事件
function orgTreeOnclick(event,treeId,treeNode){
	var id=treeNode.id;
	var treeId=treeNode.fullId;
	$('#authorize_grid_list').datagrid('load',{orgid:id,orgFid:treeId,inputText:$("#gridInputText").val()}); 
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
	$('#authorize_grid_list').datagrid('load',{orgid:treeNode[0].id,orgFid: treeNode[0].fullId,inputText:value});  
};
