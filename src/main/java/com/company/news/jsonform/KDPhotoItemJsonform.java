package com.company.news.jsonform;








/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class KDPhotoItemJsonform extends AbstractJsonform {
	
	private String label;// 标签 长度45

	
	private String note;// 描述.300字符


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}
}
