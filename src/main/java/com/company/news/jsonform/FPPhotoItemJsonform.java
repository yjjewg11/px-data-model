package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class FPPhotoItemJsonform extends AbstractJsonform {
	
	private String address;//拍摄地址45字
	
	private String note;// 描述.300字符

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
	  

}
