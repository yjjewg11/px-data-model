package com.company.news.query;

public class PaginationData {
	//使用创建时间做分页显示,minTime 取 %Y-%m-%d-%H-%i-%s之前的数据.按照创建时间排倒序
	 private String minTime;
	//使用创建时间做分页显示,maxTime 取 %Y-%m-%d-%H-%i-%s之后的数据.按照创建时间排正序
	 private String maxTime;
	 
    private String orderFiled;

    private String orderType;

    public static final int DEFAULT_PAGESIZE = 10;

    private int pageSize = DEFAULT_PAGESIZE;

    public static final int DEFAULT_PAGENO = 1;

    private int pageNo = DEFAULT_PAGENO;

    public static final String SORT_NONE = "";

    public static final String SORT_ASC = "ASC";

    public static final String SORT_DESC = "DESC";

    public int getStartIndex(){
      return (pageNo-1)*pageSize;
    }
    public String getOrderFiled() {
      return orderFiled;
    }

    public void setOrderFiled(String orderFiled) {
      this.orderFiled = orderFiled;
    }

    public String getOrderType() {
      return orderType;
    }

    public void setOrderType(String orderType) {
      this.orderType = orderType;
    }

    public int getPageSize() {
      return pageSize;
    }

    public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
    }

    public int getPageNo() {
      return pageNo;
    }

    public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
    }
	public String getMinTime() {
		return minTime;
	}
	public void setMinTime(String minTime) {
		this.minTime = minTime;
	}
	public String getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
	}

}
