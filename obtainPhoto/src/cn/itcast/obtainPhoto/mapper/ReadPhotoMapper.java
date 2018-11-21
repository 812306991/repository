package cn.itcast.obtainPhoto.mapper;

import java.util.List;
import java.util.Map;

import cn.itcast.obtainPhoto.po.Photo;

public interface ReadPhotoMapper {
	
	List<Photo> selectByExampleWithBLOBs(String sql);
	
	List<Map> executeSqlQuery(String sql);

}
