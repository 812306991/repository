package com.jgkj.liao.service;

import java.util.List;
import java.util.Map;

import com.jgkj.liao.photo.Photo;

public interface PhotoService {
	List<Photo> getImage(String sql);
	List<Map> executeQuery(String sql);
}
