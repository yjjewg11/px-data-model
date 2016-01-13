package com.company.news.jsonform;

import java.sql.Timestamp;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class FPFamilyPhotoCollectionJsonform extends AbstractJsonform {
	
	
	
	private String herald;// 封面照片.
	
	private String title;// 家庭照片集合.128字符.XX的家
	
	private Integer status=0;//类型'0:发布,1:未发布.2:屏蔽',


	public String getHerald() {
		return herald;
	}

	public void setHerald(String herald) {
		this.herald = herald;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	  

}
