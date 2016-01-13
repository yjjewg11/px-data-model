package com.company.news.form;



public class FPPhotoItemForm {
	private String family_uuid;// 关联家庭uuid
	
	private String address;//拍摄地址100字
	
	private String note;// 描述.300字符
	
	private String md5;// 唯一表示
	
	private String photo_time;//拍摄时间

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
}
