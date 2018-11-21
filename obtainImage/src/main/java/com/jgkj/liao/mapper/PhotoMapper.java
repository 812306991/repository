package com.jgkj.liao.mapper;

import java.util.List;
import java.util.Map;

import com.jgkj.liao.photo.Photo;

public interface PhotoMapper {
	List<Photo> getImage(String sql);
	List<Map> executeQuery(String sql);
}
