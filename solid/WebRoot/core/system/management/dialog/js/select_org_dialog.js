var mainActivity = {};

//页面初始化
$(document).ready(function() {
	mainActivity.setLayout();
	mainActivity.loadGrid();
	mainActivity.loadTree();
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
		check : {
				enable : true,
				chkboxType: { "Y": "s", "N": "p" }
			},
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
			onCheck: orgOnCheck
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
		}
});
};
mainActivity.loadGrid=function(){
		$('#grid_list').datagrid({  
	        width: '100%',  
	        height:$("#authorize_grid_list").parent().height(),  
	        striped:true,
	        fitColumns:true,
	        rownumbers:true,
	        singleSelect:true,
	        pageSize: 30,      
	        pageList: [30, 40, 50],      
	        pagination: false, //是否启用分页
	        columns:[[  
	            {field:'code',title: '组织编码',align: 'left',width:70},  
	            {field:'name',title: '组织名称',align: 'left',width:80},  
	            {field:'fullName',title: '组织路径',align: 'left',width:120},  
	            {field:'id',title: 'id',align: 'left',width:0,hidden:true},
	            {field:'fullCode',title: 'fullCode',align: 'left',width:0,hidden:true},
	            {field:'fullId',title: 'fullId',align: 'left',width:0,hidden:true},
	            {field:'personId',title: 'personId',align: 'left',width:0,hidden:true}
	        ]]
	    });
};

	//单击树节点事件
function orgOnCheck(event,treeId,treeNode){
	var treeObj=$.fn.zTree.getZTreeObj("orgTree");
	nodes=treeObj.getCheckedNodes(true);
	$('#grid_list').datagrid('loadData', {total:0,rows:[]} );
	$('#grid_list').datagrid('loadData', getData(nodes));
	//默认选中
	if (treeNode.checked) {
		$('#grid_list').datagrid('selectRecord',treeNode.id);
	} else {
		var data = $('#grid_list').datagrid('getData');
		if (data.total > 0) {
			$('#grid_list').datagrid('selectRow', 0);
		}
	}
}

function pagerFilter(data){
	if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array
		data = {
			total: data.length,
			rows: data
		}
	}
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
	pager.pagination({
		onSelectPage:function(pageNum, pageSize){
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh',{
				pageNumber:pageNum,
				pageSize:pageSize
			});
			dg.datagrid('loadData',data);
		}
	});
	if (!data.originalRows){
		data.originalRows = (data.rows);
	}
	var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start, end));
	return data;
}

function addAll(){
	var treeObj = $.fn.zTree.getZTreeObj("orgTree");
	treeObj.checkAllNodes(true);
	var nodes = treeObj.getCheckedNodes(true);
	//清空数据
	$('#grid_list').datagrid('loadData', {total:0,rows:[]} );
	$('#grid_list').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData(nodes));
	
	//默认选中第一行
	$('#grid_list').datagrid('selectRow', 0);
}
function removeSelect(){
	var row = $('#grid_list').datagrid('getSelected'),
	treeObj = $.fn.zTree.getZTreeObj("orgTree"),
	nodes = treeObj.getCheckedNodes(true);
    for (var i = 0; i < nodes.length; i ++) {
	      var treeNode = nodes[i];
	if (treeNode.id == row.id) {
		treeObj.checkNode(nodes[i], false, true,true);
	}
   }
}
function removeAll() {
	var treeObj = $.fn.zTree.getZTreeObj("orgTree");
	treeObj.checkAllNodes(false);
	var nodes = treeObj.getCheckedNodes(true);
	//清空数据
	$('#grid_list').datagrid('options').pageNumber = 1;
	$('#grid_list').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData(nodes));
}
function getData(nodes){
	var rows = [];
	for(var i = 0; i < nodes.length; i ++){
		var treeNodeTemp = nodes[i];
		rows.push({
			id: treeNodeTemp.id,
			code: treeNodeTemp.code,
			name: treeNodeTemp.name,
			fullName: treeNodeTemp.fullName,   
			fullCode: treeNodeTemp.fullCode,
			fullId: treeNodeTemp.fullId,       
			personId: treeNodeTemp.personId
		});
	}
	return rows;
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

function dailogEngin(){ 
	 var k=$("#grid_list").datagrid("getData");
	 if(k.rows.length>0){
		 return k.rows;
	 }else{
		 $.messager.alert('系统提示', '请选择数据！', 'warning');
		 return false; 
	 } 
}
	