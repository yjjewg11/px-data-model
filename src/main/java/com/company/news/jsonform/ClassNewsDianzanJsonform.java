package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ClassNewsDianzanJsonform extends AbstractJsonform {


	private String newsuuid;// 品牌名称


	private String message;// 公司全称
	private String create_user;// 品牌名称

	private String create_useruuid;// 公司全称

	public String getNewsuuid() {
		return newsuuid;
	}

	public void setNewsuuid(String newsuuid) {
		this.newsuuid = newsuuid;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}
	



}