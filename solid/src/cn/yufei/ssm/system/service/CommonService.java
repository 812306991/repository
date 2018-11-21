package cn.yufei.ssm.system.service;


import cn.yufei.ssm.system.core.data.SimpleData;

public interface CommonService {
	
	public SimpleData getCurrentDateTime(String flag) throws Exception;
	
	public SimpleData getCurrentDate(String flag) throws Exception;
	
	public SimpleData getUuid();
	
	public SimpleData getRandomNumber();
	
	public String getFunTreeStr() throws Exception;

}
