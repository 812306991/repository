package cn.itcast.obtainPhoto.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.itcast.obtainPhoto.Utils.PropertyUtil;
import cn.itcast.obtainPhoto.mapper.ReadPhotoMapper;
import cn.itcast.obtainPhoto.po.Photo;
import cn.itcast.obtainPhoto.service.PhotoService;

public class PhotoServiceImpl implements PhotoService {

	private static final Logger logger = Logger.getLogger(PhotoServiceImpl.class);
	private SqlSessionFactory sqlSessionFactory;

	public PhotoServiceImpl() {
		// 配置文件（SqlMapConfig.xml）
		String resource = "SqlMapConfig.xml";
		// 加载配置文件到输入 流
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			logger.error("加载配置文件SqlMapConfig.xml出错");
		}
		// 创建会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Override
	public void selectByExampleWithBLOBs() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//获取sql
        String sql=this.getSql();
        if(!sql.equals("")){
        	logger.info("----开始读取数据并生成文件begin---");
        	//检查目录存在
        	this.isDirExists();
        	ReadPhotoMapper readPhotoMapper=sqlSession.getMapper(ReadPhotoMapper.class);
        	List<Photo> list=readPhotoMapper.selectByExampleWithBLOBs(sql);
        	if(list.size()>0){
        		for(int i=0;i<list.size();i++){
        			String fileName=list.get(i).getFileId()+PropertyUtil.getProperty("obtainPhoto.suffixName");
        			//检查文件是否存在,存在则删除
        			this.isFileExists(PropertyUtil.getProperty("obtainPhoto.directoryPath")+fileName);
        			byte[] imgByte=list.get(i).getPhoto();
        			if(imgByte!=null){
        				//生成文件
            			OutputStream os=null;
            			try {
    						os=new FileOutputStream(PropertyUtil.getProperty("obtainPhoto.directoryPath")+fileName);
    						os.write(imgByte,0,imgByte.length);
    						os.flush();
    					} catch (Exception e) {
    						logger.error("生成"+fileName+"文件出错");
    					}finally{
    						if(os!=null){
    							try {
    								os.close();
    							} catch (IOException e) {
    								e.printStackTrace();
    							}
    						}
    					}
        			}
        		}
        		logger.info("----生成文件end---");
        	}
        	sqlSession.close();
        }else{
        	logger.info("-_-没有可读取的数据了");
        }
	}
	//检查需要存放文件的目录是否已经生成
	private void isDirExists(){
		String directoryPath=PropertyUtil.getProperty("obtainPhoto.directoryPath");
		if(directoryPath.length()>0){
			File dir=new File(directoryPath);
			if(!dir.exists()){
				dir.mkdir();
			}
		}else{
			logger.error("文件存放目录未配置");
		}
	}
	
	//判断文件是否存在,存在则删除
	private void isFileExists(String  fileName){
		File file = new File(fileName);
		if(file.exists()){
			if (!file.delete()) {
				logger.info("删除"+fileName+"文件失败");
			}
		}
	}

	// 获取配置文件中需要查询的值拼装sql
	private String getSql() {
        String tableName=PropertyUtil.getProperty("obtainPhoto.tableName");
        String fileId=PropertyUtil.getProperty("obtainPhoto.fileNameField");
        String photoField=PropertyUtil.getProperty("obtainPhoto.photoField");
        String timeField=PropertyUtil.getProperty("obtainPhoto.timeField");
        String settingTime=PropertyUtil.getProperty("obtainPhoto.settingTime");
        String sql="select ";
        if(fileId.length()>0){
        	sql+=fileId+" as FILEID,";
        }else{
        	sql="";
        	logger.error("配置中没有指定需要生成文件名称的字段配置");
        }
        if(photoField.length()>0){
        	sql+=photoField+" as PHOTO ";
        }else{
        	sql="";
        	logger.error("配置中没有指定需要生成文件的字段配置");
        }
        if(tableName.length()>0){
        	sql+=" from "+tableName;
        }else{
        	sql="";
        	logger.error("配置中没有指定需要查询的表");
        }
        if(timeField.length()>0 && settingTime.length()>0){
        	sql+=" where "+timeField+">=to_date('"+settingTime+"','yyyy-mm-dd hh24:mi:ss') and "+photoField+" is not null  order by "+timeField+" desc " ;
        }else{
        	sql="";
        	logger.error("配置中没有指定需要生成的时间字段");
        }
        //分页读取
        XMLWriter writer=null;
        try {
        	SAXReader reader=new SAXReader();
			Document document=reader.read(new File(PhotoServiceImpl.class.getResource("").getFile()+"\\page.xml"));
		    Element pageElement=(Element) document.selectSingleNode("/root/page");
		    Integer start=Integer.parseInt(pageElement.getText());
		    int page=0,end=0;
		    int limit=120;
		    //判断是否大于数据库总数
		    int numCount=this.selectByExampleWithBLOBsCount();
		    if((start*limit)<numCount){
		    	if(start==1){
			    	page=start;
			    	end=limit;
			    }else{
			    	page=(start-1)*limit;
			    	end=start*limit;
			    }
		    	sql=" select FILEID,PHOTO from ( select a.*,rownum rn from("+sql+") a ) where rn between "+page+" and "+end;
	            start=start+1;
	            pageElement.setText(start+"");
	            //创建xml格式
	            OutputFormat format=OutputFormat.createCompactFormat();
	            format.setEncoding("UTF-8");
				writer=new XMLWriter(new FileOutputStream(PhotoServiceImpl.class.getResource("").getFile()+"\\page.xml") ,format);
				writer.write(document);
		    }else{
		    	sql="";
		    	logger.info(start+"："+limit+":"+numCount+"查询结束");
		    }
        } catch (DocumentException e) {
			logger.error("解析page.xml出错");
		}catch (FileNotFoundException e) {
			logger.error("写入page.xml出错");
		}catch (UnsupportedEncodingException e) {
			logger.error("写入page.xml出错");
		}catch (IOException e) {
			logger.error("写入page.xml出错");
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sql;
	}

	@Override
	public int selectByExampleWithBLOBsCount() {
		   int num=0;
		    String tableName=PropertyUtil.getProperty("obtainPhoto.tableName");
	        String timeField=PropertyUtil.getProperty("obtainPhoto.timeField");
	        String settingTime=PropertyUtil.getProperty("obtainPhoto.settingTime");
	        String sql="select count(*) as CNUM ";
	        if(tableName.length()>0){
	        	sql+=" from "+tableName;
	        }else{
	        	sql="";
	        	logger.error("配置中没有指定需要查询的表");
	        }
	        if(timeField.length()>0 && settingTime.length()>0){
	        	sql+=" where "+timeField+">=to_date('"+settingTime+"','yyyy-mm-dd hh24:mi:ss') order by "+timeField+" desc " ;
	        }else{
	        	sql="";
	        	logger.error("配置中没有指定需要生成的时间字段");
	        }
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        ReadPhotoMapper readPhotoMapper=sqlSession.getMapper(ReadPhotoMapper.class);
        	List<Map> list=readPhotoMapper.executeSqlQuery(sql);
        	Map map=null;
        	if(list.size()>0){
        		map=list.get(0);
        	}
        num=Integer.parseInt(map.get("CNUM").toString());
        sqlSession.close();
		return num;
	}
	
	//获取上次取到的记录数
	

}
