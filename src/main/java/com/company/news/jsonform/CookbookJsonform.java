package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class CookbookJsonform extends AbstractJsonform {
	  
	  private String name;//机构ID
	  
	  private String img;//早餐
	  
	  private String groupuuid;//早餐
	  
	  private Integer type;//早餐

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getGroupuuid() {
		return groupuuid;
	}

	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	  

	
}
