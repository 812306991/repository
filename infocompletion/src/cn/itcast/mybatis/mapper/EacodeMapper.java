package cn.itcast.mybatis.mapper;

import cn.itcast.mybatis.po.Eacode;
import cn.itcast.mybatis.po.EacodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EacodeMapper {
    int countByExample(EacodeExample example);

    int deleteByExample(EacodeExample example);

    int insert(Eacode record);

    int insertSelective(Eacode record);

    List<Eacode> selectByExample(EacodeExample example);

    int updateByExampleSelective(@Param("record") Eacode record, @Param("example") EacodeExample example);

    int updateByExample(@Param("record") Eacode record, @Param("example") EacodeExample example);
}