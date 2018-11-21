package cn.yufei.ssm.system.mapper;

import cn.yufei.ssm.system.po.SysOpauthorize;
import cn.yufei.ssm.system.po.SysOpauthorizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOpauthorizeMapper {
    int countByExample(SysOpauthorizeExample example);

    int deleteByExample(SysOpauthorizeExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SysOpauthorize record);

    int insertSelective(SysOpauthorize record);

    List<SysOpauthorize> selectByExample(SysOpauthorizeExample example);

    SysOpauthorize selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SysOpauthorize record, @Param("example") SysOpauthorizeExample example);

    int updateByExample(@Param("record") SysOpauthorize record, @Param("example") SysOpauthorizeExample example);

    int updateByPrimaryKeySelective(SysOpauthorize record);

    int updateByPrimaryKey(SysOpauthorize record);
}