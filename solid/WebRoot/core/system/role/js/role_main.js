var mainActivity = {};
var add_role_dialog,add_funTree_dialog;

//页面初始化
$(document).ready(function() {
	mainActivity.setLayout();
	mainActivity.loadTree();
	mainActivity.loadGrid();
});


//设置Layout宽高
mainActivity.setLayout = function() {
	var height = $(window).height() - 8;
	$("#main_layout").layout("resize", {width : "100%",height : height + "px"});
};



//加载树节点
mainActivity.loadTree=function(_dialogLocalCallBack){
	var setting = {
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "parent"
			}
		},
		async : {
			enable : true
		},
		callback : {
			onClick:roleTreeOnclick
		}
	};
	yufei.ajax("/role/getRoleTree.action",null,function(aysData,state){
		if(state=="SUCCESS"){
			var row=JSON.parse(aysData);
			var roleTree=$.fn.zTree.init($("#roleTree"),setting,row);
				if(roleTree && _dialogLocalCallBack){
					 _dialogLocalCallBack(roleTree);
				 }else{
					 var nodes = roleTree.getNodes();    
					 roleTree.selectNode(nodes[0],false,true);
					 mainActivity.menucontrol(nodes[0].parent);
				 } 
		}
	});

};

function roleTreeOnclick(event,treeid,treeNode){
	mainActivity.menucontrol(treeNode.parent);
	$('#role_grid_list').datagrid('load',{roleId:treeNode.id,inputText:$("#gridInputText").val()}); 
}

mainActivity.loadGrid=function(){
	$('#role_grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#role_grid_list").parent().height(),  
        striped:true,
        fitColumns:true,
        checkOnSelect:true,
        rownumbers:true,
        view:groupview,
        groupField:'spath',
        groupFormatter:function(value,rows){
            return '（'+value + '） - ' + rows.length + ' 分组';
        },
        url:yufei.portal.contextRoot + "/permission/findTextPermissionListData.action",  
        queryParams:{roleId:"1",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        rownumbers: true,  //是否显示列数     
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'ck',checkbox:true,align: 'center',width:20},  
            {field:'spath',title: '功能模块',align: 'left',width:110},  
            {field:'sname',title: '名称',align: 'left',width:150},  
            {field:'surl',title: '功能路径',align: 'left',width:450} 
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        }
    });
};
mainActivity.queryGridListData=function(value,name){
	var roleTree = $.fn.zTree.getZTreeObj("roleTree");  
	var treeNode=roleTree.getSelectedNodes();
	$('#role_grid_list').datagrid('load',{roleId: treeNode[0].id,inputText:value});  
};
//查询树节点
mainActivity.searcherRoleTree=function(value,name){
	var inputText=value;
	if(inputText){
		yufei.ajax("/role/searcherRoleTree.action",{"inputText":inputText},function(data,state){
			if(state=="SUCCESS"){
				var searData=JSON.parse(data);
				mainActivity.positionRoleTreeNode(searData);
			}
		});
	}else{
		$.messager.alert('系统提示', '查询内容不能为空！', 'warning');
	}
};
mainActivity.positionRoleTreeNode=function(data){
	if(data){
		var searcherData=data;
		var roleTree=$.fn.zTree.getZTreeObj("roleTree");
		var mySelectID=searcherData.fpath.split("/");
		var selectNode=null;
		if(mySelectID.length<1) return;
		if(mySelectID.length==1){
			if(searcherData.id){
				var snode=roleTree.getNodeByParam("id",searcherData.id);
				selectNode=snode;
				if(!searcherData.open){
					roleTree.selectNode(snode,false,true);
					roleTree.expandNode(snode);
					mainActivity.menucontrol(snode.parent);
					$('#role_grid_list').datagrid('load',{roleId:selectNode.id,inputText:$("#gridInputText").val()}); 
				}
			}
		}else{
			for(var i=0;i<mySelectID.length;i++){
				var nodeid=mySelectID[i];
			    if(nodeid){
			    	var snode=roleTree.getNodeByParam("id",nodeid);
			    	selectNode=snode;
			    			if(!snode.open){
			    				roleTree.selectNode(snode,false,true);
			    				roleTree.expandNode(snode);
			    				mainActivity.menucontrol(snode.parent);
			    				$('#role_grid_list').datagrid('load',{roleId:selectNode.id,inputText:$("#gridInputText").val()}); 
			    			}
			    }
			}
		}
		if(selectNode!=null && !roleTree.isSelectedNode(selectNode)){
			roleTree.selectNode(selectNode,false);
			mainActivity.menucontrol(selectNode.parent);
			$('#role_grid_list').datagrid('load',{roleId:selectNode.id,inputText:$("#gridInputText").val()}); 
		}
	}
};
mainActivity.menucontrol = function(parent) {
	if(parent!=null && parent!="" && parent!=undefined){
		$("#deleteRoleBtn,#removeallBtn,#allocationBtn").menubutton('enable');
		$("#addRoleBtn").menubutton('disable').hide();
		$("#editRoleBtn").show();
		
	}else{
		$("#addRoleBtn").menubutton('enable').show();
		$("#editRoleBtn").hide();
		$("#deleteRoleBtn,#removeallBtn,#allocationBtn").menubutton('disable');
	}
};
mainActivity.refreshRoleTree=function(){
	var roleTree = $.fn.zTree.getZTreeObj("roleTree"); 
	var treeNode=roleTree.getSelectedNodes();
	mainActivity.loadTree(function backFun(obj){
		setTimeout(function(){
			obj.selectNode(treeNode[0],false,true);
			$('#role_grid_list').datagrid('load',{roleId:treeNode[0].id,inputText:$("#gridInputText").val()}); 
		}, 100); 
	});
};
//新增角色
mainActivity.addRoleData=function(){
	var roleTree = $.fn.zTree.getZTreeObj("roleTree"); 
	var treeNode=roleTree.getSelectedNodes();
	if(!add_role_dialog) add_role_dialog=new yufei.dialog({});
	var jsonStr = "{\"id\":\"" + treeNode[0].id + "\",\"name\":\"" + treeNode[0].name + "\"}";
	var url=yufei.portal.contextRoot +"/core/system/role/dialog/add_permission_dialog.html?data="+jsonStr+"&dataState=new";
	add_role_dialog.open(url, function(data){
		if(data){
			var jsondata=JSON.stringify(data);
			yufei.ajax("/role/queryRoleByCode.action",{"code":data.scode},function(isData,state){
				if(state=="SUCCESS" && isData!=""){
					var row=JSON.parse(isData);
					if(row.sid!=null){
						alert("你填写的编码已存在，不允许重复！");
						return;
					}
				}
				yufei.ajax("/role/saveRole.action",{"jsonData":jsondata},function(aysData,state){
						var rows=JSON.parse(aysData);
						if(state=="SUCCESS"){
							$.messager.alert('系统提示', rows.message, 'warning');
							mainActivity.refreshRoleTree();
						}
				});
				
			});
		}
	}, null, "添加角色", 620, 360);
};
//编辑角色
mainActivity.editRoleData=function(){
	var roleTree = $.fn.zTree.getZTreeObj("roleTree"); 
	var treeNode=roleTree.getSelectedNodes();
	if(!add_role_dialog) add_role_dialog=new yufei.dialog({});
	var url=yufei.portal.contextRoot +"/core/system/role/dialog/add_permission_dialog.html?rowid="+treeNode[0].id+"&dataState=edit";
	add_role_dialog.open(url, function(data){
		if(data){
			var jsondata=JSON.stringify(data);
				yufei.ajax("/role/saveRole.action",{"jsonData":jsondata},function(aysData,state){
						var rows=JSON.parse(aysData);
						if(state=="SUCCESS"){
							$.messager.alert('系统提示', rows.message, 'warning');
							mainActivity.refreshRoleTree();
						}
				});
		}
	}, null, "编辑角色", 620, 360);
};

//分配功能
mainActivity.addFunTreeData=function(){
	if(!add_funTree_dialog) add_funTree_dialog=new yufei.dialog({});
	var roleTree = $.fn.zTree.getZTreeObj("roleTree"); 
	var treeNode=roleTree.getSelectedNodes();
	var url=yufei.portal.contextRoot +"/core/system/role/dialog/funTree_dialog.html?roleId="+treeNode[0].id;
	add_funTree_dialog.open(url, function(data){
		if(data){
			yufei.ajax("/permission/allocationPermission.action",{"roleId":treeNode[0].id,"json":data.jsonData},function(aysData,state){
				var rows=JSON.parse(aysData);
				if(state=="SUCCESS"){
					$.messager.alert('系统提示', rows.message, 'warning');
					mainActivity.refreshRoleTree();
				}
		     });
		}
	}, null, "选择功能", 480, 450);
};
//删除功能
mainActivity.moveOppermissionData=function(){
	$.messager.confirm('提示', '删除后数据无法恢复，您确定要删除吗?', function(r){
		if (r){
			var checkData=$('#role_grid_list').datagrid("getChecked");
			var cheNode=new Array();
			if(checkData){
				for(var i=0;i<checkData.length;i++){
					cheNode.push(checkData[i].sid);
				}
				yufei.ajax("/permission/deletePermission.action",{"id":cheNode.join(",")},function(aysData,state){
					var rows=JSON.parse(aysData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						mainActivity.refreshRoleTree();
					}
			     });
			}else{
				$.messager.alert('系统提示', "请勾选需要删除的数据行", 'info');	
			}
		}
	});
};

//删除角色
mainActivity.moveRoleData=function(){
	$.messager.confirm('提示', '删除角色后，相关的功能和权限都会被删除，确定要删除吗?', function(r){
		if (r){
			var roleTree = $.fn.zTree.getZTreeObj("roleTree"); 
			var treeNode=roleTree.getSelectedNodes();
			var roleId=treeNode[0].id;
			if(roleId){
				yufei.ajax("/role/deleteRoleById.action",{"id":roleId},function(aysData,state){
					var rows=JSON.parse(aysData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						mainActivity.refreshRoleTree();
					}
			});
			}
		}
	});
};