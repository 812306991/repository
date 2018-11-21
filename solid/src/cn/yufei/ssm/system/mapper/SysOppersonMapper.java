package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOpperson;
import cn.yufei.ssm.system.po.SysOppersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOppersonMapper {
    int countByExample(SysOppersonExample example);

    int deleteByExample(SysOppersonExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOpperson record);

    int insertSelective(SysOpperson record);

    List<SysOpperson> selectByExampleWithBLOBs(SysOppersonExample example);

    List<SysOpperson> selectByExample(SysOppersonExample example);

    SysOpperson selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOpperson record, @Param("example") SysOppersonExample example);

    int updateByExampleWithBLOBs(@Param("record") SysOpperson record, @Param("example") SysOppersonExample example);

    int updateByExample(@Param("record") SysOpperson record, @Param("example") SysOppersonExample example);

    int updateByPrimaryKeySelective(SysOpperson record);

    int updateByPrimaryKeyWithBLOBs(SysOpperson record);

    int updateByPrimaryKey(SysOpperson record);
}