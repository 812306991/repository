package com.lyt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyt.model.BlogType;

public interface BlogTypeMapper {
	//添加博客类别信息
	Integer addBlogType(BlogType blogType);
	//删除博客类别信息
	Integer deleteBlogType(Integer blog_id);
	//更新博客类别信息
	Integer updateBlogType(BlogType blogType);
	//根据id查询博客类别信息
	BlogType getById(Integer blog_id);
	//分页查询博客类别信息
	List<BlogType> listByPage(@Param("start")Integer start,@Param("end") Integer end);
	//查询总记录数
	Long getTotal();
}
