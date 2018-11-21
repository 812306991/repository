package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysBasecode;
import cn.yufei.ssm.system.po.SysBasecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBasecodeMapper {
    int countByExample(SysBasecodeExample example);

    int deleteByExample(SysBasecodeExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysBasecode record);

    int insertSelective(SysBasecode record);

    List<SysBasecode> selectByExample(SysBasecodeExample example);

    SysBasecode selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysBasecode record, @Param("example") SysBasecodeExample example);

    int updateByExample(@Param("record") SysBasecode record, @Param("example") SysBasecodeExample example);

    int updateByPrimaryKeySelective(SysBasecode record);

    int updateByPrimaryKey(SysBasecode record);
}