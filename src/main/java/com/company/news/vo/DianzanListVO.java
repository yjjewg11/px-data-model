package com.company.news.vo;

import java.io.Serializable;

public class DianzanListVO implements Serializable {

	private Integer  count=0;
	private String names="";
	private Boolean canDianzan=true;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public Boolean getCanDianzan() {
		return canDianzan;
	}
	public void setCanDianzan(Boolean canDianzan) {
		this.canDianzan = canDianzan;
	}
}
