package cn.itcast.mybatis.dao;

import java.util.List;

import cn.itcast.mybatis.po.PoePersoninfo;

public interface PoePersoninfoDao {
	
	//查询未补充数据的从业人员数据
	public List<PoePersoninfo> queryByPersonData() throws Exception;
	
	//根据身份证号码更新从业人员数据
	public int updatePersonData(String cardCode,PoePersoninfo poePersoninfo) throws Exception;

}
