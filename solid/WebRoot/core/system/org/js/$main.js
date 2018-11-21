var mainActivity = {};
var queryOrgDialog,addOrgDialog,addPersonDialog;
// 页面初始化
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
	//默认设置菜单按钮不可用
   mainActivity.setAddOrgMenuDisable(true);
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
					mainActivity.menucontrol(snode.kind);
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
			    				$('#org_grid_list').datagrid('load',{treeId: snode.id}); 
			    				mainActivity.menucontrol(snode.kind);
			    			}
			    }
			}
		}
		if(selectNode!=null && !orgTree.isSelectedNode(selectNode)){
			orgTree.selectNode(selectNode,false);
			$('#org_grid_list').datagrid('load',{treeId: selectNode.id}); 
			$("#addOrgMenu").menubutton('enable');
			mainActivity.menucontrol(selectNode.kind);
			
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
	var zNodes = [{id:'',code:'root',name:'组织机构',kind:'ogn',isParent:true,open:false,icon:'/solid/core/system/org/image/root.png'}];
	$.fn.zTree.init($("#orgTree"), setting, zNodes);
	var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
    //调用默认展开第一个结点    
     var nodes = orgTree.getNodes();    
     orgTree.expandNode(nodes[0], true);  
     orgTree.selectNode(nodes[0],false,true);
     mainActivity.menucontrol(nodes[0].kind);
};
mainActivity.loadGrid=function(){
	$('#org_grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#org_grid_list").parent().height(),  
        striped: true,  
        singleSelect : true,  
        url:yufei.portal.contextRoot + "/org/findByOrgListOnTreeClick.action",  
        queryParams:{treeId:"",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        rownumbers: true,  //是否显示列数     
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'sorgkindid',title: '类型',align: 'center',width:60,formatter:function(value,row){
            	var url="";
            	if(value=="org"){
            		url="../org/image/org.png";
            	}else if(value=="dept"){
            		url="../org/image/dept.png";
            	}else if(value=="pos"){
            		url="../org/image/post.png";
            	}else if(value=="psm"){
            		url="../org/image/person.png";
            	}
            	return " <img src='"+url+"'/>";
            }},  
            {field:'scode',title: '编码',align: 'center',width:70},  
            {field:'sname',title: '名称',align: 'center',width:150},  
            {field:'svalidstate',title: '状态',align: 'center',width:80,formatter:function(value,row){
            	if(value=="0"){
            		return "<font color='red'>禁用</font>";
            	}else if(value=="1"){
            		return "<font color='Green'>启用</font>";
            	}
            }},  
            {field:'sfname',title: '路径',align: 'left',width:450} 
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        },
        onSelect:function(index,row){
        	if(row.svalidstate=="1"){
        		$("#ban-org").show();
        		$("#allow-org").hide();
        	}else{
        		$("#allow-org").show();
        		$("#ban-org").hide();
        	}
        	
        }
    });
};
mainActivity.queryGridListData=function(value,name){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree");  
	var treeNode=orgTree.getSelectedNodes();
	$('#org_grid_list').datagrid('load',{treeId: treeNode[0].id,inputText:value});  
};
mainActivity.setAddOrgMenuDisable=function(flag){
	if(flag){
		$("#addOrgMenu").menubutton('disable');
	}else{
		$("#addOrgMenu").menubutton('enable');
	}
};
mainActivity.menucontrol = function(kinid) {
	if("ogn" == kinid){
		$("#add-org").show();
		$("#add-dept,#add-pos,#add-psn,.menu-sep").hide();
		mainActivity.setAddOrgMenuDisable(false);
	} else if ("org" == kinid) {
		$("#add-org,#add-dept,#add-pos,#add-psn").show();
		$(".menu-sep").show();
		$("#resetPassword").hide();
		mainActivity.setAddOrgMenuDisable(false);
	} else if ("dept" == kinid) {
		$("#add-org,#resetPassword").hide();
		$("#add-dept,#add-pos,#add-psn").show();
		$(".menu-sep").show();
		mainActivity.setAddOrgMenuDisable(false);
	} else if ("pos" == kinid) {
		$("#add-org,#add-dept,#add-pos,#resetPassword").hide();
		$(".menu-sep").hide();
		$("#add-psn").show();
		mainActivity.setAddOrgMenuDisable(false);
	} else if ("psm" == kinid) {
		mainActivity.setAddOrgMenuDisable(true);
		$("#resetPassword").show();
	}
};
//单击树节点事件
function orgTreeOnclick(event,treeId,treeNode){
	var treeId=treeNode.id;
	$('#org_grid_list').datagrid('load',{treeId:treeId,inputText:$("#gridInputText").val()}); 
	mainActivity.setAddOrgMenuDisable(false);
	mainActivity.menucontrol(treeNode.kind);
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
//新增组织
mainActivity.openNewAddOrgDialog=function(name, state, type){
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	var treeNode=orgTree.getSelectedNodes();
	addOrgDialog=new yufei.dialog({});
	addPersonDialog=new yufei.dialog({});
	if (state=="newData") { 
		var selectTreeData=treeNode[0];
		var jsonStr="";
		 if(selectTreeData.id){
			 jsonStr = "{\"id\":\"" + selectTreeData.id + "\",\"fullId\":\"" + selectTreeData.fullId + "\",\"fullCode\":\"" + selectTreeData.fullCode + "\",\"fullName\":\"" + selectTreeData.fullName + "\",\"kind\":\"" + type + "\"}";
		 }else{
			 jsonStr = "{\"id\":\"" + selectTreeData.id + "\",\"fullId\":\"" + selectTreeData.fullId + "\",\"fullCode\":\"" + selectTreeData.code + "\",\"fullName\":\"" + selectTreeData.name + "\",\"kind\":\"" + type + "\"}";
		 }
		//判断是新增机构还是部门
		if(type=="org" || type=="dept"|| type=="pos"){
			var url=yufei.portal.contextRoot +"/core/system/org/dialog/add_org_dialog.html?data="+jsonStr+"&dataState=new";
			addOrgDialog.open(url, function(data){
				if(data){
					var jsondata=JSON.stringify(data);
					yufei.ajax("/org/saveOrg.action",{"jsonData":jsondata},function(aysData,state){
						var row=JSON.parse(aysData);
						if(state=="SUCCESS"){
							if (treeNode.length>0) {
								$.messager.alert('系统提示', row.message, 'warning');
								mainActivity.refreshOrgTree(orgTree);
							}
						}
					});
				}
			}, null, "添加"+name, 620, 480);
			
		}else{
		var url=yufei.portal.contextRoot +"/core/system/org/dialog/add_person_dialog.html?data="+jsonStr+"&dataState=new";
		addPersonDialog.open(url, function(data){
			if(data){
				var jsondata=JSON.stringify(data);
				yufei.ajax("/person/savePersonData.action",{"jsonData":jsondata},function(aysData,state){
					var row=JSON.parse(aysData);
					if(state=="SUCCESS"){
						if (treeNode.length>0) {
							$.messager.alert('系统提示', row.message, 'warning');
							mainActivity.refreshOrgTree(orgTree);
						}
					}
				});
			}
		}, null, "添加"+name, 620, 480);
		}
	}else{
		
	}
};
//编辑
mainActivity.editOrgData=function(){
	var row = $('#org_grid_list').datagrid('getSelected');
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	var treeNode=orgTree.getSelectedNodes();
	var selectTreeData=treeNode[0];
	var parentName="";
	if(selectTreeData.id){
		parentName=selectTreeData.fullName;
	}else{
		parentName=selectTreeData.name;
	}
	if(row.sorgkindid=="org" || row.sorgkindid=="dept"|| row.sorgkindid=="pos"){
		if(!addOrgDialog)addOrgDialog=new yufei.dialog({});
		var url=yufei.portal.contextRoot +"/core/system/org/dialog/add_org_dialog.html?rowid="+row.sid+"&dataState=edit"+"&parentName="+parentName;
		addOrgDialog.open(url, function(data){
			if(data){
				var jsondata=JSON.stringify(data);
				yufei.ajax("/org/saveOrg.action",{"jsonData":jsondata},function(aysData,state){
					var row=JSON.parse(aysData);
					if(state=="SUCCESS"){
						if (treeNode.length>0) {
							$.messager.alert('系统提示', row.message, 'warning');
							mainActivity.refreshOrgTree(orgTree);
						}
					}
				});
			}
		}, null, "编辑"+mainActivity.formatterOrgKind(row.sorgkindid), 620, 480);
	}else{
		//编辑人员信息
		if(!addPersonDialog)addPersonDialog=new yufei.dialog({});
		var url=yufei.portal.contextRoot +"/core/system/org/dialog/add_person_dialog.html?rowid="+row.spersonid+"&dataState=edit"+"&parentName="+parentName;
		addPersonDialog.open(url, function(data){
			if(data){
				var jsondata=JSON.stringify(data);
				yufei.ajax("/person/savePersonData.action",{"jsonData":jsondata},function(aysData,state){
					var row=JSON.parse(aysData);
					if(state=="SUCCESS"){
						if (treeNode.length>0) {
							$.messager.alert('系统提示', row.message, 'warning');
							mainActivity.refreshOrgTree(orgTree);
						}
					}
				});
			}
		}, null, "编辑"+mainActivity.formatterOrgKind(row.sorgkindid), 620, 480);
	}
};
mainActivity.refreshOrgTree=function(orgTree){
	var treeNode=orgTree.getSelectedNodes();
	var parentNode = orgTree.getNodeByTId(treeNode[0].parentTId);  
	 orgTree.selectNode(parentNode); 
	 $('#org_grid_list').datagrid('load',{treeId: treeNode[0].id,inputText:$("#gridInputText").val()}); 
		orgTree.reAsyncChildNodes(parentNode, "refresh",false,function(){
			mainActivity.positionOrgTreeNode(treeNode[0]);
		});
};
mainActivity.formatterOrgKind=function(kind){
	var formatterKind="";
	switch(kind)
	{
	case 'org':
		formatterKind="机构";
	  break;
	case 'dept':
		formatterKind="部门";
	  break;
	case'pos':
		formatterKind="岗位";
		break;
	case'psm':
		formatterKind="人员";
		break;
	default:
		formatterKind="人员";
	}
	return formatterKind;
};
//重置密码
mainActivity.resetPassword=function(){
	var row = $('#org_grid_list').datagrid('getSelected');
	if (row.sorgkindid == "psm") {
	$.messager.confirm('提示', '您确定需要重置【'+row.sname+'】的密码吗?', function(r) {
		if (r) {
				var params = {};
				params.userId = row.spersonid;
				$.post(yufei.portal.contextRoot + "/core/resetPassword.action",
						params, function(data) {
					$.messager.alert('系统提示', data.message, 'info');
							$('#updatePasswordw').window('close');
						}, "json");
		}
	});
	}
};
//组织机构禁用
mainActivity.banOrg=function(){
	var row = $('#org_grid_list').datagrid('getSelected');
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	$.messager.confirm('提示', '禁用后将无法登陆系统。您确定需要禁用该组织吗? ', function(r) {
		if (r) {
			yufei.ajax("/org/banOrgData.action",{"orgId":row.sid,"state":"0"},function(aysData,state){
				var row=JSON.parse(aysData);
				if(state=="SUCCESS"){
						$.messager.alert('系统提示', row.message, 'warning');
						mainActivity.refreshOrgTree(orgTree);
				}
			});
		}
	 });
};

//组织机构启用
mainActivity.allowOrg=function(){
	var row = $('#org_grid_list').datagrid('getSelected');
	var orgTree = $.fn.zTree.getZTreeObj("orgTree"); 
	$.messager.confirm('提示', '启用后组织将可以使用系统。您确定需要启用该组织吗?', function(r) {
		if (r) {
			yufei.ajax("/org/banOrgData.action",{"orgId":row.sid,"state":"1"},function(aysData,state){
				var row=JSON.parse(aysData);
				if(state=="SUCCESS"){
						$.messager.alert('系统提示', row.message, 'warning');
						mainActivity.refreshOrgTree(orgTree);
				}
			});
		}
	 });
};