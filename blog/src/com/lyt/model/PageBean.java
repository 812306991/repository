package com.lyt.model;

import java.util.List;

public class PageBean<T> {
	private int currPage;//当前页数
	private int pageSize;//每页显示的个数
	private Long total;//总记录数
	private int start;
	private int end;
	private List<T> result;//分页查询的结果
	
	public PageBean(){
		super();
	}
	
	public PageBean(int currPage,int pageSize){
		this.currPage=currPage;
		this.pageSize=pageSize;
		this.start=(currPage-1)*pageSize;
		this.end=currPage*pageSize;
	}

	@Override
	public String toString() {
		return "PageBean [currPage=" + currPage + ", pageSize=" + pageSize + ", total=" + total + ", start=" + start
				+ ", end=" + end + ", result=" + result + "]";
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
	
	
}
