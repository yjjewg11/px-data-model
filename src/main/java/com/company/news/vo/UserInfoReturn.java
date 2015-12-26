package com.company.news.vo;

import java.sql.Timestamp;



public class UserInfoReturn implements java.io.Serializable{
	private String uuid;
	
	private String loginname;// 登录名。手机号码或邮箱
	
	private String name;// 昵称
	
//	private String password;// 密码，md5加密。（UTF-8）
	
	private String tel;// 电话号码。
	
	private Integer tel_verify;// 电话号码，验证。默认0，0:没验证。1:验证，2：提交验证，3.验证失败
	
	
	private Integer disable;// 是否被管理员封号。0：不封。1：封号，不允许登录。
	
	private Timestamp login_time;// 最后一次登录时间。
	
	private Timestamp create_time;
	private Integer sex;// 0:男,1:女
	private String office;// 职位。
	private String img;// 
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}


	private Timestamp last_login_time;// 上一次登录时间
	public Timestamp getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Timestamp last_login_time) {
		this.last_login_time = last_login_time;
	}

	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	private Integer type;// 用户类型。0:普通用户(默认)；1:组织管理员

	
	private String email;// email

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getTel_verify() {
		return tel_verify;
	}

	public void setTel_verify(Integer tel_verify) {
		this.tel_verify = tel_verify;
	}


	public Integer getDisable() {
		return disable;
	}

	public void setDisable(Integer disable) {
		this.disable = disable;
	}



	public Timestamp getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Timestamp loginTime) {
		login_time = loginTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp createTime) {
		create_time = createTime;
	}
}
