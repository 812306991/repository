package com.jgkj.liao.property.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyUtil {
	private static final Logger logger = Logger.getLogger(PropertyUtil.class);
	private static Properties prop = null;
	static {
		loadProps();
	}
	synchronized static void loadProps() {
		InputStream is = null;
		prop = new Properties();
		is = PropertyUtil.class.getResourceAsStream("config.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			//e.printStackTrace();
			logger.error("加载配置文件config.properties出错！");
		}finally {
			try {
				if(is != null) {
					prop.clone();
				}
			}catch(Exception e) {
				logger.error("文件流关闭异常！");
			}
		}
	}
	public static String getProperty(String keyName) {
		if(prop != null) {
			loadProps();
		}
		return prop.getProperty(keyName);
	}
	
	public static String getProperty(String keyName,String value) {
		if(prop != null) {
			loadProps();
		}
		return prop.getProperty(keyName);
	}

}
