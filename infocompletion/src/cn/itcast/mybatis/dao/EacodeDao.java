package cn.itcast.mybatis.dao;

import cn.itcast.mybatis.po.Eacode;

public interface EacodeDao {
	
	public  Eacode queryByCode(String code,String type) throws Exception; 

}
