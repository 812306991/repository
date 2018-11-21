package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOporg;
import cn.yufei.ssm.system.po.SysOporgExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysOporgMapper {
    int countByExample(SysOporgExample example);

    int deleteByExample(SysOporgExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOporg record);

    int insertSelective(SysOporg record);

    List<SysOporg> selectByExample(SysOporgExample example);

    SysOporg selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOporg record, @Param("example") SysOporgExample example);

    int updateByExample(@Param("record") SysOporg record, @Param("example") SysOporgExample example);

    int updateByPrimaryKeySelective(SysOporg record);

    int updateByPrimaryKey(SysOporg record);
    
    int updateOrgPathnodes(Map map);
}