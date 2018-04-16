package com.lyt.model;

import java.io.Serializable;

public class BlogType implements Serializable{
	private Integer blog_id;
	private String typeName;
	private Integer orderNum;
	
	public BlogType() {
		super();
	}
	public BlogType(Integer blog_id,String typeName,Integer orderNum) {
		this.blog_id=blog_id;
		this.typeName=typeName;
		this.orderNum=orderNum;
	}
	@Override
	public String toString() {
		return "BlogType [blog_id=" + blog_id + ", typeName=" + typeName + ", orderNum=" + orderNum + "]";
	}
	public Integer getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(Integer blog_id) {
		this.blog_id = blog_id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	
	
}
