package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOprole;
import cn.yufei.ssm.system.po.SysOproleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOproleMapper {
    int countByExample(SysOproleExample example);

    int deleteByExample(SysOproleExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOprole record);

    int insertSelective(SysOprole record);

    List<SysOprole> selectByExample(SysOproleExample example);

    SysOprole selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOprole record, @Param("example") SysOproleExample example);

    int updateByExample(@Param("record") SysOprole record, @Param("example") SysOproleExample example);

    int updateByPrimaryKeySelective(SysOprole record);

    int updateByPrimaryKey(SysOprole record);
}