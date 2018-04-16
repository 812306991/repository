package com.lyt.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyt.mapper.BlogTypeMapper;
import com.lyt.model.BlogType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-common.xml")
public class BlogTypeMapperTest {
	@Resource
	private BlogTypeMapper blogTypeMapper;
	
	@Test
	public void addBlogType()throws Exception{
		BlogType blogType = new BlogType(null, "Mysql",10);
		int result=blogTypeMapper.addBlogType(blogType);
		System.out.println(result);
	}
	
	@Test
	public void deleteBlogType()throws Exception{
		int result=blogTypeMapper.deleteBlogType(19);
		System.out.println(result);
	}
	
	@Test
	public void updateBlogType()throws Exception{
		// 先查询出要更新的记录然后修改
		BlogType blogType=blogTypeMapper.getById(19);
		//然后提交更新
		blogType.setTypeName("更新MySQL");
		//更新
		blogTypeMapper.updateBlogType(blogType);
		//查询更新后的值 并且打印
		System.out.println(blogTypeMapper.getById(19));
	}
	
	@Test
    public void getById() throws Exception {
        BlogType blogType = blogTypeMapper.getById(19);
        System.out.println(blogType);
    }

    @Test
    public void  listByPage(){
        Integer page = 1;  //第一页
        Integer pageSize = 2;  //一页显示两条
        Integer start =(page-1)*pageSize;
        Integer end = page*pageSize;
        List<BlogType> blogTypeList = blogTypeMapper.listByPage(start,end);
        for (BlogType b: blogTypeList) {
            System.out.println(b);
        }
    }

    @Test
    public void getTotal(){
        long total = blogTypeMapper.getTotal();
        System.out.println(total);
    }
}
