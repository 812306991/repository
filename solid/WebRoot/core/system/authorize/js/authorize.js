var mainActivity = {};
var queryOrgDialog ,add_role_dialog;

//页面初始化
$(document).ready(function() {
	mainActivity.setLayout();
	mainActivity.loadTree();
	mainActivity.loadGrid();
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
					if(snode.id){
    					mainActivity.setlinkbuttonDisable(true);
    				}else{
    					mainActivity.setlinkbuttonDisable(false);
    				}
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
			    				if(snode.id){
			    					mainActivity.setlinkbuttonDisable(true);
			    				}else{
			    					mainActivity.setlinkbuttonDisable(false);
			    				}
			    			}
			    }
			}
		}
		if(selectNode!=null && !orgTree.isSelectedNode(selectNode)){
			orgTree.selectNode(selectNode,false);
			$('#authorize_grid_list').datagrid('load',{orgid:selectNode.id,orgFid: selectNode.fullId,inputText:$("#gridInputText").val()});
			if(selectNode.id){
				mainActivity.setlinkbuttonDisable(true);
			}else{
				mainActivity.setlinkbuttonDisable(false);
			}
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
	//添加虚根节点
	var zNodes = [{id:'',code:'root',name:'组织机构',isParent:true,open:false,icon:'/solid/core/system/org/image/root.png'}];
	$.fn.zTree.init($("#orgTree"), setting, zNodes);
	var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
    //调用默认展开第一个结点    
     var nodes = orgTree.getNodes();    
     orgTree.expandNode(nodes[0], true);  
     orgTree.selectNode(nodes[0],false,true);
     mainActivity.setlinkbuttonDisable(false);

};
mainActivity.loadGrid=function(){
	$('#authorize_grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#authorize_grid_list").parent().height(),  
        striped:true,
        fitColumns:true,
        checkOnSelect:true,
        rownumbers:true,
        view:groupview,
        groupField:'sorgname',
        groupFormatter:function(value,rows){
            return '（'+value + '） - ' + rows.length + ' 分组';
        },
        url:yufei.portal.contextRoot + "/authorize/findTextAuthorizeListData.action",  
        queryParams:{orgid:"",orgFid:"",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'ck',checkbox:true,align: 'center',width:20},  
            {field:'sorgname',title: '授权组织名称',align: 'left',width:100},  
            {field:'sdescription',title: '角色名称',align: 'left',width:90},  
            {field:'sorgfname',title: '授权组织路径',align: 'left',width:300}
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
	if(id && treeId){
		mainActivity.setlinkbuttonDisable(true);
		$('#authorize_grid_list').datagrid('load',{orgid:id,orgFid:treeId,inputText:$("#gridInputText").val()}); 
	}else{
		mainActivity.setlinkbuttonDisable(false);
	}
}
mainActivity.setlinkbuttonDisable=function(flag){
	if(flag){
		$("#deleteRoleBtn,#addRoleBtn").linkbutton('enable');
	}else{
		$("#deleteRoleBtn,#addRoleBtn").linkbutton('disable');
	}
};
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

//分配角色
mainActivity.addRoleData=function(){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	var treeNode=orgTree.getSelectedNodes();
	if(!add_role_dialog) add_role_dialog=new yufei.dialog({});
	var url=yufei.portal.contextRoot +"/core/system/authorize/dialog/query_role_dialog.html?orgId="+treeNode[0].id;
	add_role_dialog.open(url, function(data){
		if(data){
			var param={
					orgId:treeNode[0].id,
					orgFid:treeNode[0].fullId,
					orgFname:treeNode[0].fullName,
					orgName:treeNode[0].name
			};
			var jsondata=JSON.stringify(data);
			var orgJson=JSON.stringify(param);
				yufei.ajax("/authorize/saveAuthorize.action",{"orgJson":orgJson,"dataJson":jsondata},function(aysData,state){
						var rows=JSON.parse(aysData);
						if(state=="SUCCESS"){
							$.messager.alert('系统提示', rows.message, 'warning');
							$('#authorize_grid_list').datagrid('load',{orgid:treeNode[0].id,orgFid: treeNode[0].fullId,inputText:$("#gridInputText").val()});
						}
				});
				
		}
	}, null, "分配角色", 600, 400);
};
//删除
mainActivity.moveRoleData=function(){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	var treeNode=orgTree.getSelectedNodes();
	$.messager.confirm('提示', '删除后数据无法恢复，您确定要删除吗?', function(r){
		if (r){
			var checkData=$('#authorize_grid_list').datagrid("getChecked");
			var cheNode=new Array();
			if(checkData){
				for(var i=0;i<checkData.length;i++){
					cheNode.push(checkData[i].sid);
				}
				yufei.ajax("/authorize/deleteAuthorize.action",{"id":cheNode.join(",")},function(aysData,state){
					var rows=JSON.parse(aysData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						$('#authorize_grid_list').datagrid('load',{orgid:treeNode[0].id,orgFid: treeNode[0].fullId,inputText:$("#gridInputText").val()});
					}
			     });
			}else{
				$.messager.alert('系统提示', "请勾选需要删除的数据行", 'info');	
			}
		}
	});
};