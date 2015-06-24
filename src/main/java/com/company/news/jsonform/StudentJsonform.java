package com.company.news.jsonform;

import java.sql.Timestamp;




/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class StudentJsonform extends AbstractJsonform {
	private String uuid;// 登录名。手机号码或邮箱
	
	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	private String loginname;// 登录名。手机号码或邮箱
	
	private String name;// 昵称
	
	private String password;// 密码，md5加密。（UTF-8）
	
	private String nickname;// 电话号码。
	
	private Integer sex;// 0:男,1:女
	
	private String headimg;// 用户类型。0:普通用户(默认)；1:组织管理员

	
	private String birthday;// email


	
	private String ma_tel;// email

	
	private String ba_tel;// email

	
	private String nai_tel;// email

	
	private String ye_tel;// email

	
	private String waipo_tel;// email

	
	private String waigong_tel;// email

	
	private String other_tel;// email

	
	
	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}



	public String getHeadimg() {
		return headimg;
	}


	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getMa_tel() {
		return ma_tel;
	}


	public void setMa_tel(String ma_tel) {
		this.ma_tel = ma_tel;
	}


	public String getBa_tel() {
		return ba_tel;
	}


	public void setBa_tel(String ba_tel) {
		this.ba_tel = ba_tel;
	}


	public String getNai_tel() {
		return nai_tel;
	}


	public void setNai_tel(String nai_tel) {
		this.nai_tel = nai_tel;
	}


	public String getYe_tel() {
		return ye_tel;
	}


	public void setYe_tel(String ye_tel) {
		this.ye_tel = ye_tel;
	}


	public String getWaipo_tel() {
		return waipo_tel;
	}


	public void setWaipo_tel(String waipo_tel) {
		this.waipo_tel = waipo_tel;
	}


	public String getWaigong_tel() {
		return waigong_tel;
	}


	public void setWaigong_tel(String waigong_tel) {
		this.waigong_tel = waigong_tel;
	}


	public String getOther_tel() {
		return other_tel;
	}


	public void setOther_tel(String other_tel) {
		this.other_tel = other_tel;
	}




	public String getClassuuid() {
		return classuuid;
	}


	public void setClassuuid(String classuuid) {
		this.classuuid = classuuid;
	}


	private String classuuid;// email
	
}