package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class UserTeacherJsonform extends AbstractJsonform {

	
	private String realname;// 昵称
	
	private String idcard;// 密码，md5加密。（UTF-8）
	
	private String introduction;// 电话号码。
	
	private String useruuid;// 用户uuid
	
	private String birthdayStr;// 最后一次登录时间。
	
	private String img;// 最后一次登录时间。

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getUseruuid() {
		return useruuid;
	}

	public void setUseruuid(String useruuid) {
		this.useruuid = useruuid;
	}

	public String getBirthdayStr() {
		return birthdayStr;
	}

	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}
	
}
