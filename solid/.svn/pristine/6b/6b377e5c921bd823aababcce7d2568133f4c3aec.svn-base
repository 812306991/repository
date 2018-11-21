package cn.yufei.ssm.system.service;

import javax.servlet.http.HttpSession;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.po.SysDatabackups;

public interface SysDatabackupsService {
	
	//添加备份日志
	public int saveBackData(SysDatabackups backData) throws Exception;
	
	//备份列表
	public GridData findBackDataList(String inputText, int page,int rows) throws Exception;
	
	//备份数据
	public int beginInBack(HttpSession session) throws Exception;
	
	//数据恢复
	public int regainBack(String id) throws Exception;

}
