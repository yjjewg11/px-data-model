package com.company.news.jsonform;








/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class PxTelConsultationJsonform extends AbstractJsonform {
	private String ext_uuid;// 关联uuid.
	private String group_uuid;//学校uuid.
	private Integer type;//学校或者课程.
	public String getExt_uuid() {
		return ext_uuid;
	}
	public void setExt_uuid(String ext_uuid) {
		this.ext_uuid = ext_uuid;
	}
	public String getGroup_uuid() {
		return group_uuid;
	}
	public void setGroup_uuid(String group_uuid) {
		this.group_uuid = group_uuid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
