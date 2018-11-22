package com.jgkj.liao.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.jgkj.liao.photo.Photo;
import com.jgkj.liao.property.util.PropertyUtil;
import com.jgkj.liao.service.PhotoService;

public class PhotoServiceImpl implements PhotoService{
	private static final Logger logger = Logger.getLogger(PhotoServiceImpl.class);
	private static SqlSessionFactory sqlSessionFactory;
	public PhotoServiceImpl() {
		//配置文件
		String resource = "SqlMapConfig.xml";
		//加载配置文件输入流
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			logger.error("加载配置文件SqlMapConfig错误！");
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	public String getSql() {
		String tableName = PropertyUtil.getProperty("tableName");
		String fileName = PropertyUtil.getProperty("fileName");
		String getColumn = PropertyUtil.getProperty("getColumn");
		String taskName = PropertyUtil.getProperty("taskName");
		String settingDate = PropertyUtil.getProperty("settingDate");
		String settingTime = PropertyUtil.getProperty("settingTime");
		String sql = "select ";
		if(fileName.length() > 0) {
			sql += fileName + ",";
		}else {
			sql = "";
			logger.error("配置文件中没有指定要生成的文件名字段设置！");
		}
		if(getColumn.length() > 0) {
			sql += getColumn + ",";
		}else {
			sql = "";
			logger.error("配置文件中没有指定要生成的文件字段设置！");
		}
		if(tableName.length() > 0) {
			sql += "from" + tableName;
		}else {
			sql = "";
			logger.error("配置文件中没有指定要生成的文件表名称设置！");
		}
		if(settingDate.length() > 0 && settingTime.length() > 0) {
			sql += " where " + settingDate + " >= to_date('"+settingTime+"'"
		return sql;
	}

	public List<Photo> getImage(String sql) {
		return null;
	}

	public List<Map> executeQuery(String sql) {
		return null;
	}

}
