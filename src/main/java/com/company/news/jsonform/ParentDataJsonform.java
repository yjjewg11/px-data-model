package com.company.news.jsonform;




public class ParentDataJsonform extends AbstractJsonform {
	
	private String phone_type;//iPhone 或  andorid
	
	private String phone_version;//操作系统版本号
	
	private String app_verion;// 客户端版本号
	
	private String city;// 城市

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public String getPhone_version() {
		return phone_version;
	}

	public void setPhone_version(String phone_version) {
		this.phone_version = phone_version;
	}

	public String getApp_verion() {
		return app_verion;
	}

	public void setApp_verion(String app_verion) {
		this.app_verion = app_verion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
