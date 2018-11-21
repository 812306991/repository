
var mainActivity = {};
//页面初始化
$(document).ready(function() {
	mainActivity.setLayout();
	mainActivity.gridLoad();
});

mainActivity.setLayout=function(){
	$('#back_progressbar').progressbar({
		height:50, 
		value:0
	});
	$("#main_panel").panel({
		width : window.innerWidth,
		height : window.innerHeight
	});
	
	$("#tabs").tabs({
		width : $("#tabs").parent().width(),
		height : $("#tabs").parent().height()-5
	});
};

mainActivity.gridLoad=function(){
	var text=$("#gridInputText").val();
	$('#mianGrid').datagrid({  
		width: '100%',  
        toolbar:"#toobar",
        height:$("#tabs").height()-18,  
        striped:true,
        singleSelect : true,  
        rownumbers:true,
        url:yufei.portal.contextRoot + "/common/findBackDataList.action",  
        queryParams:{inputText:text},  
        loadMsg:'数据加载中请稍后……',  
        pageSize: 20,      
        pageList: [20,30,40],      
        pagination: true, //是否启用分页
        columns:[[  
                {field:'sbackupname',title: '备份文件名称',align: 'left',width:180},  
                {field:'sbackuppath',title: '备份路径',align: 'left',width:350},
                {field:'sbackupdata',title: '备份日期',align: 'center',width:140,formatter:yufei.DateTimeFormatter},
                {field:'screatorname',title: '操作人',align: 'center',width:100},
                {field:'sflag',title: '操作状态',align: 'center',width:400,formatter: function(value,row,index){
    				if (value=="1"){
    					 var tempval=100;  
    				        var htmlstr = '<div class="easyui-progressbar progressbar-red" style="width: 400px; height: 20px;" value="'+tempval +'" text="'+tempval+'%">'+  
    				        '<div class="progressbar-text" style="width: 400px; height: 20px; line-height: 20px;">'+tempval+'%</div>'+  
    				            '<div class="progressbar-value" style="width: '+tempval+'%; height: 20px; line-height: 20px;">'+  
    				                '<div class="progressbar-text" style="width: 400px; height: 20px; line-height: 20px;">'+tempval+'%</div>'+  
    				            '</div>'+  
    				        '</div>';  
    				        return htmlstr;  
    				} else {
    					 var tempval=0;  
 				        var htmlstr = '<div class="easyui-progressbar progressbar-green" style="width: 400px; height: 20px;" value="'+tempval +'" text="'+tempval+'%">'+  
 				        '<div class="progressbar-text" style="width: 400px; height: 20px; line-height: 20px;">'+tempval+'%</div>'+  
 				            '<div class="progressbar-value" style="width: '+tempval+'%; height: 20px; line-height: 20px;">'+  
 				                '<div class="progressbar-text" style="width: 400px; height: 20px; line-height: 20px;">'+tempval+'%</div>'+  
 				            '</div>'+  
 				        '</div>';  
 				        return htmlstr;  
    				}
    			}
}
            ]],
        onClickRow:function(index,row){
            	if(row.sflag=="1"){
            		$("#regain_btn").menubutton('disable');
            		$('#regain_progressbar').progressbar('setValue', 100);
            	}else{
            		$("#regain_btn").menubutton('enable');
            		$('#regain_progressbar').progressbar('setValue', 0);
            	}
       }   
        });
};

//备份数据
mainActivity.backupData=function(){
	yufei.ajax("/common/backData.action",null,function(data,state){
		if(state=="SUCCESS" && data!=""){
			var rows=JSON.parse(data);
			if(state=="SUCCESS"){
				 var i = $('#back_progressbar').progressbar('getValue')==100?0:$('#back_progressbar').progressbar('getValue');
				 var aa=setInterval(function(){
		                i++;
		                $('#back_progressbar').progressbar('setValue', i);
		                $('#back_progressbar').attr("data-percent",i);
		                if(i==100){
		                	if(rows.code=="10000"){
		    					$.messager.alert('系统提示', "数据备份成功", 'warning');
		    					$('#mianGrid').datagrid('load',{inputText:$("#gridInputText").val()}); 
		    				}else{
		    					$.messager.alert('系统提示', "数据备份失败", 'warning');
		    				}
		                    i=0;
		                    clearInterval(aa);
		                }
		            },10);
				
			}
		}
	});
};

//数据库还原
mainActivity.regainBack=function(){
	var row = $('#mianGrid').datagrid('getSelected');
		yufei.ajax("/common/regainBack.action",{id:row.sid},function(data,state){
			if(state=="SUCCESS" && data!=""){
				var rows=JSON.parse(data);
				if(state=="SUCCESS"){
					 var i = $('#regain_progressbar').progressbar('getValue')==100?0:$('#regain_progressbar').progressbar('getValue');
					 var aa=setInterval(function(){
			                i++;
			                $('#regain_progressbar').progressbar('setValue', i);
			                $('#regain_progressbar').attr("data-percent",i);
			                if(i==100){
			                	if(rows.code=="10000"){
			    					$.messager.alert('系统提示', "数据还原成功", 'warning');
			    					$('#mianGrid').datagrid('load',{inputText:$("#gridInputText").val()}); 
			    				}else{
			    					$.messager.alert('系统提示', "数据还原失败", 'warning');
			    				}
			                    i=0;
			                    clearInterval(aa);
			                }
			            },10);
				}
			}
		});
};
