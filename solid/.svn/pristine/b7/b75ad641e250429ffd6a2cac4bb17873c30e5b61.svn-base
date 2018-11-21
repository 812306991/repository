package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysDatabackups;
import cn.yufei.ssm.system.po.SysDatabackupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDatabackupsMapper {
    int countByExample(SysDatabackupsExample example);

    int deleteByExample(SysDatabackupsExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysDatabackups record);

    int insertSelective(SysDatabackups record);

    List<SysDatabackups> selectByExample(SysDatabackupsExample example);

    SysDatabackups selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysDatabackups record, @Param("example") SysDatabackupsExample example);

    int updateByExample(@Param("record") SysDatabackups record, @Param("example") SysDatabackupsExample example);

    int updateByPrimaryKeySelective(SysDatabackups record);

    int updateByPrimaryKey(SysDatabackups record);
}