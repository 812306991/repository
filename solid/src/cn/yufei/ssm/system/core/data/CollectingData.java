package cn.yufei.ssm.system.core.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.yufei.ssm.system.dal.object.Entity;



public class CollectingData {
	
	private static CollectingData collectingData=null;
	
	private CollectingData(){
		// 将构造方法私有
	}
	public static CollectingData getInstance(){
		if(collectingData==null){
			collectingData=new CollectingData();
		}
		return collectingData;
	}
	
	
	 /** 
     * 使用泛型方法，把json字符串转换为相应的JavaBean对象。 
     * (1)转换为普通JavaBean：readValue(json,Student.class) 
     * (2)转换为List,如List<Student>,将第二个参数传递为Student 
     * [].class.然后使用Arrays.asList();方法把得到的数组转换为特定类型的List 
     *  
     * @param jsonStr 
     * @param valueType 
     * @return 
     */  
	public  <T> T readValue(String jsonStr, Class<T> valueType) {  
		ObjectMapper mapper=new ObjectMapper();
        try {  
            return mapper.readValue(jsonStr, valueType);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  
	
	/** 
     * json数组转List 
     * @param jsonStr 
     * @param valueTypeRef 
     * @return 
     */  
    public  <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef){  
    	ObjectMapper mapper=new ObjectMapper();
        try {  
            return mapper.readValue(jsonStr, valueTypeRef);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return null;  
    }  
    
    /** 
     * 把JavaBean转换为json字符串 
     * @param object 
     * @return 
     */  
    public  String toJSon(Object object) {  
    	ObjectMapper mapper=new ObjectMapper();
        try {  
            return mapper.writeValueAsString(object);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  
  
	
	public  Entity getEntity(String json,Class<Entity> calzz) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		Entity readValue = mapper.readValue(json,calzz);
		return readValue;
	}
	
	public  List<Entity> getListEntity(String json,Class<Entity> calzz) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper=new ObjectMapper();
		JavaType javaType=this.getCollectionType(ArrayList.class,calzz);
		return mapper.readValue(json,javaType);
	}
	
	private  JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {   
		ObjectMapper mapper=new ObjectMapper();     
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
	}
	
	public static void main(String[] args) {
		CollectingData emperor1 = CollectingData.getInstance();
		//emperor1.getEntity(json, calzz)
	}
}
