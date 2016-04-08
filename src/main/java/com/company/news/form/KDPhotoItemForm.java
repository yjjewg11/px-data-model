package com.company.news.form;

import java.sql.Timestamp;



public class KDPhotoItemForm {
	
	
	private String group_uuid;// 关联家庭uuid
	
	private String class_uuid;// 关联家庭uuid
	
	private Integer status=0;// 状态：0，正常,1：修改，2：删除
	
	
	
	private String photo_time;// 拍摄时间
	
	private String create_useruuid;// 创建人uuid
	
	private String path;// 相对路径.128.fp/uuid.png
	
	private String label;// 标签 长度45
//	
//	private String content_type;// [必填]文件类型："image/jpg","image/jpeg","image/png","image/gif"
	
	private Long file_size;// [必填]文件大小
	
	private String address;//拍摄地址45字
	
	private String note;// 描述.300字符
	
	private String md5;// 唯一表示
	
	private String phone_type;//手机型号.//iPhone 6s,HTC 123
	
	private String phone_uuid;//手机唯一标识

	public String getGroup_uuid() {
		return group_uuid;
	}

	public void setGroup_uuid(String group_uuid) {
		this.group_uuid = group_uuid;
	}

	public String getClass_uuid() {
		return class_uuid;
	}

	public void setClass_uuid(String class_uuid) {
		this.class_uuid = class_uuid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhoto_time() {
		return photo_time;
	}

	public void setPhoto_time(String photo_time) {
		this.photo_time = photo_time;
	}

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getFile_size() {
		return file_size;
	}

	public void setFile_size(Long file_size) {
		this.file_size = file_size;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}