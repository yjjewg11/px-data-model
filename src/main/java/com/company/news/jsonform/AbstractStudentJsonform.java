package com.company.news.jsonform;

public class AbstractStudentJsonform  extends AbstractJsonform {
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

	
	private String ma_name;// 妈妈姓名

	
	private String ba_name;// 爸爸姓名

	
	private String address;// 家庭住址

	
	private String note;// 备注（3行）
	
	
	private String idcard;// 
	
	
	private String ma_work;// 妈妈的工作

	
	private String ba_work;// 爸爸的工作
	
	private Integer status;// 学生在校状态-0在线-1离线-2毕业
	






	public String getMa_name() {
		return ma_name;
	}


	public void setMa_name(String ma_name) {
		this.ma_name = ma_name;
	}


	public String getBa_name() {
		return ba_name;
	}


	public void setBa_name(String ba_name) {
		this.ba_name = ba_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getIdcard() {
		return idcard;
	}


	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}


	public String getMa_work() {
		return ma_work;
	}


	public void setMa_work(String ma_work) {
		this.ma_work = ma_work;
	}


	public String getBa_work() {
		return ba_work;
	}


	public void setBa_work(String ba_work) {
		this.ba_work = ba_work;
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

	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}
}
