var mainActivity = {};
//页面初始化
$(document).ready(function() {
	var roleId=yufei.getUrlParam("roleId");
	mainActivity.setPanel();
	mainActivity.funTreeLoad(roleId);
	
});
mainActivity.setPanel=function(){
	var height = $(window).height();
	$("#main_layout").panel("resize", {width : "100%",height : height + "px"});
};


mainActivity.funTreeLoad=function(roleId){
	var setting = {
		check : {
			enable : true
		},
		data : {
			simpleData : {
				enable : true
			}
		},
		callback:{
			onCheck:funTreeOncheck
		}
	};
	yufei.ajax("/common/getFunTreeNode.action",null,function(aysData,state){
		if(state=="SUCCESS"){
			var nodeData=eval("("+aysData+")");
			var roleTree=$.fn.zTree.init($("#funTree"),setting,nodeData);
			if(roleTree && roleId){
				yufei.ajax("/permission/findPermissionByRoleID.action",{"roleId":roleId},function(permissData,state){
					if(state=="SUCCESS"){
						var mData=eval("("+permissData+")");
						for(var i=0;i<mData.length;i++){
							var node=roleTree.getNodeByParam("surl", mData[i].surl, null);
							if(node)
							roleTree.checkNode(node, true, true);
						}
						
					}
				});
			}
		}
	});
};

var funTreeNode=new Array();
function funTreeOncheck(event, treeId, treeNode){
	var funTree=$.fn.zTree.getZTreeObj("funTree");
	var checkNodes=funTree.getCheckedNodes(true);
    for(var i=0;i<checkNodes.length;i++){
    	var name = "'name':" + "'" + checkNodes[i].name + "'" + ",";
		var process = "'process':" + "'" + checkNodes[i].process + "'" + ",";
		var activity = "'activity':" + "'" + checkNodes[i].activity + "'" + ",";
		var surl = "'url':" + "'" + checkNodes[i].surl + "',";
		var path = "'path':" + "'" + checkNodes[i].path + "'";
		funTreeNode.push("{" + name + process + activity + surl +path+ "},");
    }
}

function dailogEngin() {
	if(funTreeNode){
		var param={
				jsonData:funTreeNode.join("")
		};
		return param;
	}else{
		return false;
	}
	
}