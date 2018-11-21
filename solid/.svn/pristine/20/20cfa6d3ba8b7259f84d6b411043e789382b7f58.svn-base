package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOppermission;
import cn.yufei.ssm.system.po.SysOppermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOppermissionMapper {
    int countByExample(SysOppermissionExample example);

    int deleteByExample(SysOppermissionExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOppermission record);

    int insertSelective(SysOppermission record);

    List<SysOppermission> selectByExample(SysOppermissionExample example);

    SysOppermission selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOppermission record, @Param("example") SysOppermissionExample example);

    int updateByExample(@Param("record") SysOppermission record, @Param("example") SysOppermissionExample example);

    int updateByPrimaryKeySelective(SysOppermission record);

    int updateByPrimaryKey(SysOppermission record);
}