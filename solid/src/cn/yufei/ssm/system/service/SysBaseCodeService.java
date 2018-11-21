package cn.yufei.ssm.system.service;

import java.util.List;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.po.SysBasecode;

public interface SysBaseCodeService {
	
	//根据id查询数据
	public SysBasecode findSysBaseCodeByID(String id) throws Exception;
	
	//根据code查询数据
	public SysBasecode findSysBaseCodeByCode(String code) throws Exception;
	
	//保存数据
	public int save(String baseCodeJson) throws Exception;
	
	//查询列表
    public GridData findBaseCodeListData(String inputText,int page,int rows) throws Exception;
    
    //根据id删除数据
    public int delete(String id)throws Exception;
    
    //根据类型查询数据
    public List<SysBasecode> findSysBaseCodeByType(String type) throws Exception;
    
    //根据类型模糊查询数据列表
    public GridData findSysBaseCodeByTpey(String type,String inputText,int page,int rows) throws Exception;

}
