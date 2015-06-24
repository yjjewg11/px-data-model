package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class RightJsonform extends AbstractJsonform {
	  
	  private String name;//机构ID
	  
	  private String description;//早餐
	  
	  private String uuid;//早餐
	  
	  private Integer type;//早餐

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}


	  

	
}
