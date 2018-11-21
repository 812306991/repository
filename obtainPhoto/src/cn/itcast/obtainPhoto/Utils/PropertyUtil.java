package cn.itcast.obtainPhoto.Utils;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;




public class PropertyUtil {

	private static final Logger logger = Logger.getLogger(PropertyUtil.class);

	private static Properties props;
	static {
		loadProps();
	}

	synchronized static private void loadProps() {
		props = new Properties();
		InputStream in = null;
		try {
			in =PropertyUtil.class.getClassLoader().getResourceAsStream("config.properties");
			props.load(in);
		} catch (Exception e) {
			logger.error("加载properties文件出现异常");
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				logger.error("jdbc.properties文件流关闭出现异常");
			}
		}
		logger.info("config.properties文件内容：" + props);
	}

	public static String getProperty(String key) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key, defaultValue);
	}
}
