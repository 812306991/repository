package cn.itcast.obtainPhoto.service;

import java.util.List;

import cn.itcast.obtainPhoto.po.Photo;

public interface PhotoService {
	
	//读取照片
	public void selectByExampleWithBLOBs();
	
	//读取总记录数
	public int selectByExampleWithBLOBsCount();
	
	

}
