package cn.yufei.ssm.system.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.UUID;

import org.springframework.util.Assert;

import cn.yufei.ssm.system.mapper.SysKvsequenceMapper;
import cn.yufei.ssm.system.po.SysKvsequence;

public class Tools {  
	//获取大写UUID
	public static String getID() {
		return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");// 生成fid
	}
	//获取全UUID
	public static String getAllID(){
		return UUID.randomUUID().toString();
	}
	//获取随机数
	public static String getRandomNumber(){
		return ""+(1+Math.random()*(10-1+1));
	}
	
	//获取流水号
	public synchronized static String nextSequence(String key,String format){
		Assert.notNull(key);
		if(format.isEmpty()){
			format="0";
		}
		SysKvsequenceMapper sysKvsequenceMapper=ContextUtils.getBean(SysKvsequenceMapper.class);
		SysKvsequence kv=null;
		try {
			kv=sysKvsequenceMapper.selectByPrimaryKey(key);
			if(kv==null){
				kv=new SysKvsequence();
				kv.setK(key);
				kv.setV(new BigDecimal(0));
				sysKvsequenceMapper.insertSelective(kv);
			}else{
				kv.setV(kv.getV().add(new BigDecimal(1)));
				sysKvsequenceMapper.updateByPrimaryKeySelective(kv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new DecimalFormat(format).format(kv.getV());
	}
	
}
