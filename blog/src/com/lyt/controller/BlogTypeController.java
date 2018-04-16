package com.lyt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lyt.model.BlogType;
import com.lyt.model.PageBean;
import com.lyt.service.BlogTypeService;
import com.lyt.util.ResponseUtil;

/**
 * 部分注解解释
其中@Controller代表这是一个控制器bean
@RequestMapping(value = "/admin/blogType") 类级别的请求路径 我们使用admin代表这是后台管理blogType代表管理博客类别
@RequestMapping("/list")就是请求这个分页方法的路径

fastjson序列化
第一步 创建 JSONObject result = new JSONObject();  
第二步 使用 JSON.toJSONString方法将List对象序列化成json字符串
第三步 将json字符串转成JSONArray对象
第四步 将数据put进result中
第五步 将result方法
 * @author Administrator
 *
 */

@Controller
@RequestMapping(value="/admin/blogType")
public class BlogTypeController {
	@Resource
	private BlogTypeService blogTypeService;

	//分页查询博客类别
	@RequestMapping("/list")
	public String listBlogType(
			@RequestParam(value="page",required=false)String page,
			@RequestParam(value="rows",required=false)String rows,
			HttpServletResponse res)throws Exception {
		//定义分页bean
		PageBean<BlogType> pageBean	= new PageBean<BlogType>(Integer.parseInt(page),
				Integer.parseInt(rows));	
		//拿到分页结果已经记录总数的pageBean
		pageBean = blogTypeService.listByPage(pageBean);
		//使用阿里巴巴的fastJson创建JSONObject
		JSONObject result=new JSONObject();
		//通过fastJson序列化list为jsonArray
		String jsonArray = JSON.toJSONString(pageBean.getResult());
		JSONArray array=JSONArray.parseArray(jsonArray);
		//将序列化结果放入json对象中
		result.put("rows",array);
		result.put("total", pageBean.getTotal());
		//		result.getInteger("total");
		//		System.out.println("result" + result);
		//使用自定义工具类向response中写入数据
		ResponseUtil.write(res, result);
		return null;
	}

	//添加和更新博客类别
	@RequestMapping("/save")
	public String saveBlogType(BlogType blogType,HttpServletResponse res)throws Exception {
		int resultTotal=0;//接受返回结果记录数
		if(blogType.getBlog_id()==null) {//说明是第一次插入
			resultTotal=blogTypeService.addBlogType(blogType);

		}else {//有ID表示修改
			resultTotal=blogTypeService.updateBlogType(blogType);
		}
		String result="";
//		JSONObject result=new JSONObject();
		if(resultTotal>0) {
			result="{\"success\":true}";
//			result.put("success", true);
		}else {
			result="{\"success\":false}";
//			result.put("success", false);
		}
		ResponseUtil.write(res, result);
		return null;
	}

	//博客类别信息删除
	@RequestMapping(value="/delete")
	public String deleteBlogType(
			@RequestParam(value="idsStr",required=false)String ids,
			HttpServletResponse res)throws Exception {
		JSONObject result=new JSONObject();
		JSONArray json = JSON.parseArray(ids);
		for(int i = 0;i<json.size();i++) {
			JSONObject sObj = (JSONObject)json.get(i);
			int id = (int)sObj.get("blog_id");
			System.out.println("id" + id);
			blogTypeService.deleteBlogType(id);
		}
		result.put("success", true);
		ResponseUtil.write(res, result);
		return null;
	}

}
