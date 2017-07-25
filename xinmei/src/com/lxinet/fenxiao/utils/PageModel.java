package com.lxinet.fenxiao.utils;

/**
 * 分页
 * @author Cz
 *
 */
public class PageModel {
	/**
	 * 每页多少条记录，默认是10条
	 */
	private int pageSize=10;
	/**
	 * 查询的总的记录数
	 */
	private int allCount;
	/**
	 * 当前第几页
	 */
	private int currentPage;
	
	/**
	 * 共多少条记录
	 * @return
	 */
	public int getAllPage(){
		return (this.allCount-1)/this.pageSize+1;
	}
	
	/**
	 * 当前页从第几条记录开始查询
	 * @return
	 */
	public int getStart(){
		return (currentPage-1)*pageSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getAllCount() {
		return allCount;
	}
	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}
	public int getCurrentPage() {
		return currentPage-1;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public String getPageStr(String path){
		String str="";
		str+="当前第"+currentPage+"页  ";
		str+="共"+allCount+"条记录  ";
		if(currentPage>1){
			str+="<a href='"+path+"1'>首页</a> ";
			int flontPage = currentPage-1;
			str+="<a href='"+path+flontPage+"'>上一页</a> ";
		}
		if(currentPage<this.getAllPage()){
			int lastPage = currentPage+1;
			str+="<a href='"+path+lastPage+"'>下一页</a> ";
			str+="<a href='"+path+this.getAllPage()+"'>末页</a> ";
		}
		str+="共"+this.getAllPage()+"页 ";
		return str;
	}

}
