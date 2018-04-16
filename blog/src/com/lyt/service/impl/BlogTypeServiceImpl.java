package com.lyt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyt.mapper.BlogTypeMapper;
import com.lyt.model.BlogType;
import com.lyt.model.PageBean;
import com.lyt.service.BlogTypeService;

@Service
public class BlogTypeServiceImpl implements BlogTypeService{
	
	@Resource
	private BlogTypeMapper blogTypeMapper;
	
	public PageBean<BlogType> listByPage(PageBean<BlogType> pageBean) {
//		List<BlogType> list = blogTypeMapper.listByPage(pageBean.getStart(),pageBean.getEnd());
//		list.size();
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i).getTypeName());
//		}
		//查询分页结果
		pageBean.setResult(blogTypeMapper.listByPage(pageBean.getStart(),pageBean.getEnd()));
		//查询记录总数
		pageBean.setTotal(blogTypeMapper.getTotal());
		return pageBean;
	}

	//新增博客类别
	public Integer addBlogType(BlogType blogType) {
		return blogTypeMapper.addBlogType(blogType);
	}

	//更新博客类别
	public Integer updateBlogType(BlogType blogType) {
		return blogTypeMapper.updateBlogType(blogType);
	}

	//删除博客类别
	public Integer deleteBlogType(Integer blog_id) {
		return blogTypeMapper.deleteBlogType(blog_id);
	}
	
	public Long getTotal() {
		return blogTypeMapper.getTotal();
	}

}
