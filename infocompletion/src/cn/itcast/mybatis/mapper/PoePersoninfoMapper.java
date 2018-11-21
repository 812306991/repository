package cn.itcast.mybatis.mapper;

import cn.itcast.mybatis.po.PoePersoninfo;
import cn.itcast.mybatis.po.PoePersoninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoePersoninfoMapper {
    int countByExample(PoePersoninfoExample example);

    int deleteByExample(PoePersoninfoExample example);

    int deleteByPrimaryKey(String fid);

    int insert(PoePersoninfo record);

    int insertSelective(PoePersoninfo record);

    List<PoePersoninfo> selectByExampleWithBLOBs(PoePersoninfoExample example);

    List<PoePersoninfo> selectByExample(PoePersoninfoExample example);

    PoePersoninfo selectByPrimaryKey(String fid);

    int updateByExampleSelective(@Param("record") PoePersoninfo record, @Param("example") PoePersoninfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PoePersoninfo record, @Param("example") PoePersoninfoExample example);

    int updateByExample(@Param("record") PoePersoninfo record, @Param("example") PoePersoninfoExample example);

    int updateByPrimaryKeySelective(PoePersoninfo record);

    int updateByPrimaryKeyWithBLOBs(PoePersoninfo record);

    int updateByPrimaryKey(PoePersoninfo record);
}