package com.company.news.jsonform;


/**
 * 基类，body传入json数据转对象。
 * @author Administrator
 *
 */
public class AbstractJsonform implements java.io.Serializable{
	private String uuid;// 昵称
	private String group_type;//组织 
	
	  public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
