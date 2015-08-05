package com.company.news.vo;

/**
 * 老师通讯录
 * @author liumingquan
 *
 */
public class TeacherPhone {
	//关联老师uuid.type=0,表示院长信息,填写幼儿园uuid.
	private String teacher_uuid;
	private String name;
	private Integer type;//类型,0:院长.1:老师.
	private String tel;
	private String img;
	
	public String getTeacher_uuid() {
		return teacher_uuid;
	}
	public void setTeacher_uuid(String teacher_uuid) {
		this.teacher_uuid = teacher_uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
