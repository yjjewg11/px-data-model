package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class BaseDataListJsonform extends AbstractJsonform {
	  
	  private String datakey;//机构ID
	  
	  private String datavalue;//机构ID
	  
	  private String uuid;//早餐
	  
	  private String description;//早餐
	  
	  private String typeuuid;//早餐
	  
	  private Integer enable;//早餐
	  
	  private Integer ind;//排序默认0.

	public String getDatakey() {
		return datakey;
	}

	public void setDatakey(String datakey) {
		this.datakey = datakey;
	}

	public String getDatavalue() {
		return datavalue;
	}

	public void setDatavalue(String datavalue) {
		this.datavalue = datavalue;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeuuid() {
		return typeuuid;
	}

	public void setTypeuuid(String typeuuid) {
		this.typeuuid = typeuuid;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getInd() {
		return ind;
	}

	public void setInd(Integer ind) {
		this.ind = ind;
	}




	
}
