package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOpmanagement;
import cn.yufei.ssm.system.po.SysOpmanagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOpmanagementMapper {
    int countByExample(SysOpmanagementExample example);

    int deleteByExample(SysOpmanagementExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOpmanagement record);

    int insertSelective(SysOpmanagement record);

    List<SysOpmanagement> selectByExample(SysOpmanagementExample example);

    SysOpmanagement selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOpmanagement record, @Param("example") SysOpmanagementExample example);

    int updateByExample(@Param("record") SysOpmanagement record, @Param("example") SysOpmanagementExample example);

    int updateByPrimaryKeySelective(SysOpmanagement record);

    int updateByPrimaryKey(SysOpmanagement record);
}