package com.company.news.jsonform;




/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ClassRegJsonform extends AbstractJsonform {

	private String name;// 昵称

	private String groupuuid;// 

	private String headTeacher;// 电话号码。【必填】

	private String teacher;// email
	

	  private String createUser;//

	  public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateUseruuid() {
		return createUseruuid;
	}

	public void setCreateUseruuid(String createUseruuid) {
		this.createUseruuid = createUseruuid;
	}

	private String createUseruuid;//

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
