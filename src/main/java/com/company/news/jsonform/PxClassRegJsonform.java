package com.company.news.jsonform;

/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class PxClassRegJsonform extends AbstractJsonform {

	private String name;// 昵称

	private String groupuuid;//

	private String headTeacher;// 电话号码。【必填】

	private String teacher;// email

	private String headTeacher_name;// 电话号码。【必填】

	private String teacher_name;// email

	private String context;//

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getHeadTeacher_name() {
		return headTeacher_name;
	}

	public void setHeadTeacher_name(String headTeacher_name) {
		this.headTeacher_name = headTeacher_name;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	private String uuid;// 昵称

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private String create_user;// 品牌名称

	private String create_useruuid;// 公司全称/

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupuuid() {
		return groupuuid;
	}

	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}

	public String getHeadTeacher() {
		return headTeacher;
	}

	public void setHeadTeacher(String headTeacher) {
		this.headTeacher = headTeacher;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
