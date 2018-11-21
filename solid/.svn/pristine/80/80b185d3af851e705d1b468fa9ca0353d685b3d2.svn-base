var mainActivity = {};
var addDocDialog,editDocDialog;

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
mainActivity.loadTree=function(){
	var setting = {
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "parent",
				rootPId : 'rootDoc'
			}
		},
		async : {
			enable : true,// 是否异步加载
			url : yufei.portal.contextRoot + "/doc/getDocTree.action",
			autoParam : [ "id" ],// 异步发送请求时,表示自动传指定属性的参数值
			dataFilter : function(treeId, parentNode, childNodes) {//这里由于本人设置的节点属性跟zTree不一致所以进行了过滤
				 if (!childNodes)
		                return null;
		            for (var i = 0, l = childNodes.length; i < l; i++) {
		                childNodes[i].count = childNodes[i].childrenCount;
		                if (childNodes[i].count && parseInt(childNodes[i].count) > 0) {
		                    //当主节点  下面还有父节点时自动将isParent=true
		                    //这样点击父节点zTree会自动再加载其子节点的数据
		                    childNodes[i].isParent = true;
		                }
		            }
		            return childNodes;
	        }
		},
		callback : {
			onClick:docTreeOnclick
		}
	};
	//添加虚根节点
	var zNodes = [{id:'rootDoc',name:'文档中心',parent:"",isParent:true,open:false,icon:'/solid/core/system/doc/image/dir.png'}];
	$.fn.zTree.init($("#docTree"), setting, zNodes);
	var docTree = $.fn.zTree.getZTreeObj("docTree");  
    //调用默认展开第一个结点    
     var nodes = docTree.getNodes();    
     docTree.expandNode(nodes[0], true);  
     docTree.selectNode(nodes[0],false,true);
     mainActivity.menucontrol(nodes[0].id);
};
mainActivity.loadGrid=function(){
	$('#doc_grid_list').datagrid({  
        width: '100%',  
        toolbar:"#toobar",
        height:$("#doc_grid_list").parent().height(),  
        striped:true,
        fitColumns:true,
        checkOnSelect:true,
        rownumbers:true,
        url:yufei.portal.contextRoot + "/doc/findFileByDocIdList.action",  
        queryParams:{dirId:"1",inputText:''},  
        loadMsg:'数据加载中请稍后……',  
        rownumbers: true,  //是否显示列数     
        pageSize: 20,      
        pageList: [20, 30, 40],      
        pagination: true, //是否启用分页
        columns:[[  
            {field:'ck',checkbox:true,align: 'center',width:20},  
            {field:'sdocdisplaypath',title: '路径',align: 'left',width:200},
            {field:'sdocname',title: '文件名称',align: 'left',width:150},  
            {field:'skind',title: '类型',align: 'center',width:80},  
            {field:'screatorname',title: '创建人',align: 'left',width:100}, 
            {field:'screatetime',title: '创建时间',align: 'left',width:100,formatter:yufei.DateTimeFormatter} 
        ]],
        onLoadSuccess:function(data){
        	$(this).datagrid("selectRow", 0);  
        }
    });
};
//单击树节点事件
function docTreeOnclick(event,treeId,treeNode){
	var id=treeNode.id;
	 mainActivity.menucontrol(id);
	$('#doc_grid_list').datagrid('load',{dirId:id,inputText:$("#gridInputText").val()}); 
}
mainActivity.menucontrol=function(docTreeId){
	if(docTreeId=="rootDoc"){
		$("#editDocMenu").menubutton('disable');
		
	}else{
		$("#editDocMenu").menubutton('enable');
	}
};

mainActivity.queryGridListData=function(value,name){
	var docTree = $.fn.zTree.getZTreeObj("docTree");  
	var treeNode=docTree.getSelectedNodes();
	$('#doc_grid_list').datagrid('load',{dirId: treeNode[0].id,inputText:value});
};
mainActivity.refreshDocTree=function(){
	var docTree = $.fn.zTree.getZTreeObj("docTree");
	var treeNode = docTree.getSelectedNodes();
	var parentNode = docTree.getNodeByTId(treeNode[0].parentTId);
	/* 选中指定节点 */
	if (parentNode) {
		docTree.selectNode(parentNode);
		docTree.reAsyncChildNodes(parentNode, "refresh", false, function() {
			$('#doc_grid_list').datagrid('load',{dirId:parentNode.id,inputText:$("#gridInputText").val()}); 
		});
	} else {
		docTree.reAsyncChildNodes(treeNode[0], "refresh", false, function() {
			$('#doc_grid_list').datagrid('load',{dirId:treeNode[0].id,inputText:$("#gridInputText").val()}); 
		});
	}
};

//新建文件夹
mainActivity.createDir=function(){
	if(!addDocDialog) addDocDialog=new yufei.dialog({});
	var docTree = $.fn.zTree.getZTreeObj("docTree");
	var treeNode = docTree.getSelectedNodes();
	var url=yufei.portal.contextRoot +"/core/system/doc/dialog/add_dir_dialog.html?rowid="+treeNode[0].id;
	addDocDialog.open(url, function(data){
		if(data){
			var jsondata=JSON.stringify(data);
			yufei.ajax("/doc/createDir.action",{"jsonStr":jsondata},function(isData,state){
				if(state=="SUCCESS" && isData!=""){
					var rows=JSON.parse(isData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						mainActivity.refreshDocTree();
					}
				}
			});
		}
	}, null, "新建文件夹", 440, 280);
};
//编辑文件夹
mainActivity.editDocData=function(){
	if(!editDocDialog) editDocDialog=new yufei.dialog({});
	var docTree = $.fn.zTree.getZTreeObj("docTree");
	var treeNode = docTree.getSelectedNodes();
	var url=yufei.portal.contextRoot +"/core/system/doc/dialog/edit_dir_dialog.html?rowid="+treeNode[0].id;
	editDocDialog.open(url, function(data){
		if(data){
			var jsondata=JSON.stringify(data);
			yufei.ajax("/doc/updateDir.action",{"jsonStr":jsondata},function(isData,state){
				if(state=="SUCCESS" && isData!=""){
					var rows=JSON.parse(isData);
					if(state=="SUCCESS"){
						$.messager.alert('系统提示', rows.message, 'warning');
						mainActivity.refreshDocTree();
					}
				}
			});
		}
	}, null, "文件夹属性", 440, 420);
	
};
