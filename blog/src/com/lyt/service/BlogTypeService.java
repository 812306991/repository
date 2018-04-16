package com.lyt.service;

import com.lyt.model.BlogType;
import com.lyt.model.PageBean;

public interface BlogTypeService {
	//分页查询
	PageBean<BlogType> listByPage(PageBean<BlogType> pageBean);
	//添加博客类别
	public Integer addBlogType(BlogType blogType);
	//更新博客类别
	public Integer updateBlogType(BlogType blogType);
	//删除博客类别
	public Integer deleteBlogType(Integer blog_id);
}
