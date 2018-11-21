<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/UI/tag.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>xx系统</title>
<%@ include file="/WEB-INF/UI/common_css.jsp"%>
<style type="text/css">
.panel-icon,
.panel-tool {
  position: absolute;
  top: 50%;
  margin-top: -11px;
  height: 20px;
  overflow: hidden;
}
.panel-icon {
  left: 10px;
  width: 20px;
}
</style>
</head>
<body class="easyui-layout"  scroll="no">
	<noscript>
		<div style="position: absolute; z-index: 100000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;">
			<img src="/solid/core/portal/image/noscript.gif" alt='抱歉，请开启脚本支持！' />
		</div>
	</noscript>
	<div region="north" split="false" border="false" style="overflow: hidden; height: 40px;
        background: #000;line-height: 40px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
        
        <span style="float:right; padding-right:20px;margin-top:15px;" class="head">
         <img src="/solid/core/portal/image/setting.png" style="width:16px;height:16px;cursor: pointer;" align="top" onclick="javascript:openChangePwdWindow()"/>
          &nbsp;
         <img src="/solid/core/portal/image/shutdown.png" style="width:15px;height:15px;cursor: pointer;" align="top" onclick="javascript:logout()"/>
        </span>
        
        <span style="padding-left:10px; font-size: 20px; text-align: center;">
        <img src="/solid/core/portal/image/blocks.gif" width="30" height="30" align="absmiddle" /> 雨飞自助服务平台</span>
        <span style="padding-left:10px;" id="show_userName_span">欢迎 </span>
    </div>
    <div region="south" split="false" style="height: 30px; background: #D2E0F2; ">
       <div align="center"><nobr>Copyright 2017 </nobr></div>
    </div>
    <div  data-options="region:'west',split:true,hide:true"  title="功能导航菜单" style="width:220px;" id="west">
       <div id="nav" class="easyui-accordion" data-options="fit:true,border:false">
		<!--  导航内容 -->
				
		</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			
		</div>
    </div>
    
    
    <!--修改密码窗口-->
    <div style="display:none;">
    <div id="updatePasswordw" class="easyui-window" title="修改密码" collapsible="false" minimizable="false" maximizable="false" iconCls="icon-set" closed="true" style="width: 300px; height: 210px; padding: 5px; background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 6px; background: #fff; border: 1px solid #ccc;">
					<div style="margin-bottom: 15px">
						<label class="label-left">新&nbsp;密&nbsp;&nbsp;码：&nbsp;</label> <input
							class="easyui-passwordbox theme-textbox-radius" prompt="请输入新密码"
							id="txtNewPass" iconWidth="28" style="width: 70%;">
					</div>
					<div style="margin-bottom: 15px">
						<label class="label-left">确认密码：</label> <input
							class="easyui-passwordbox theme-textbox-radius" prompt="重复输入密码"
							id="txtRePass" iconWidth="28" style="width: 70%;">
					</div>
            </div>
            <div region="south" border="false" style="text-align: right; height: 40px; line-height: 40px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:changePassword()" >确定</a>
                <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:$('#updatePasswordw').window('close')">取消</a>
            </div>
        </div>
    </div></div>

	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出右键菜单</div>
	</div>


</body>
<%@ include file="/WEB-INF/UI/common_js.jsp"%>
<script type="text/javascript">
    var funJsonStr=${funTree};
    var basePath=${baseUrl};
    yufei.context=${context};
    yufei.portal.contextRoot=${context_rootPath};
    </script>
</html>