package com.company.news.form;



public class FPPhotoItemForm {
	private String family_uuid;// 关联家庭uuid
	
	private String address;//拍摄地址100字
	
	private String note;// 描述.300字符
	
	private String md5;// 唯一表示
	
	private String photo_time;//拍摄时间
	
	private String phone_type;//手机型号.//iPhone 6s,HTC 123.45字符
	
	private String phone_uuid;//手机唯一标识.字符64字符.
	
	public String getFamily_uuid() {
		return family_uuid;
	}

	public void setFamily_uuid(String family_uuid) {
		this.family_uuid = family_uuid;
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

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getPhoto_time() {
		return photo_time;
	}

	public void setPhoto_time(String photo_time) {
		this.photo_time = photo_time;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public String getPhone_uuid() {
		return phone_uuid;
	}

	public void setPhone_uuid(String phone_uuid) {
		this.phone_uuid = phone_uuid;
	}
}
