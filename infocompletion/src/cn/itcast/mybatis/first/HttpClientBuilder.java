package cn.itcast.mybatis.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpClientBuilder {
	
	public static String restFullPost(String url,String param){
		String rtn="";
		try
		{
			byte[] b = param.getBytes("UTF-8");
			if(b == null) return "{\"success\":false,\"message\":\"参数不全\",\"recordcount\":0,\"datas\":[]}";
			URL targetUrl = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
	        httpConnection.setDoOutput(true);
	        httpConnection.setRequestMethod("POST");
	        httpConnection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
			OutputStream outputStream = httpConnection.getOutputStream();
	        outputStream.write(b);
	        outputStream.flush();
	        BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream(),"UTF-8"));
	        String output;
	        while ((output = responseBuffer.readLine()) != null) {
		         rtn=output;//new String(output.getBytes("UTF-8"));
			}
	        outputStream.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
        return rtn;

	}

}
