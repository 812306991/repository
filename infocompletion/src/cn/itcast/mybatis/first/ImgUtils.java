package cn.itcast.mybatis.first;

import java.io.IOException;
import java.io.InputStream;



import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class ImgUtils  {
	
	public static boolean isEmpty(String str) {
        return str == null || str.length() == 0||"undefined".equals(str)||"null".equalsIgnoreCase(str)||"".equals(str.trim());
    }
	
	 //图片转化成base64字符串
	public static String generateImageBase64Str(InputStream in) throws IOException{
		//将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		String result=null;
		if(in.available()!=0){
			byte[] data=null;
			try{
				data=new byte[in.available()];
				in.read(data);
				in.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			BASE64Encoder encoder=new  BASE64Encoder();
			result=encoder.encode(data);
		}
		return result;
	}
	


	
	//base64字符串转化成byte
	public static byte[] generateBase64Byte(String base64){
		byte[] b=null;
		if(!ImgUtils.isEmpty(base64)){
			BASE64Decoder decoder=new BASE64Decoder();
			try {
				b=decoder.decodeBuffer(base64);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return b;
	}
	
}
