package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class FPFamilyMembersJsonform extends AbstractJsonform {
	
	
	
	private String family_uuid;// 关联家庭uuid
	
	
	
	private String tel;// 电话号码。
	
	private String family_name;//家庭称呼.爸爸,妈妈,20限制

	public String getFamily_uuid() {
		return family_uuid;
	}

	public void setFamily_uuid(String family_uuid) {
		this.family_uuid = family_uuid;
	}


	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	  

}
