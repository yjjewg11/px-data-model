package com.company.news.jsonform;

import java.sql.Timestamp;
import java.util.Date;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class FavoritesJsonform extends AbstractJsonform {
	  
	private String user_uuid;// 收藏家长UUid
	
	private Integer type;//参照SystemConstants表的类型定义
	
	private String title;//收藏名称
	
	private String reluuid;//关联的实体UUID
	
	private String url;//收藏的外部URL



	public String getUser_uuid() {
		return user_uuid;
	}

	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReluuid() {
		return reluuid;
	}

	public void setReluuid(String reluuid) {
		this.reluuid = reluuid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	  

}
