package com.company.news.jsonform;



/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class UserRegJsonform extends AbstractJsonform {
	private String uuid;// 昵称
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private String name;// 昵称
	
	private String  realname;//  真实姓名

	private String password;// 密码，md5加密。（UTF-8）区分大小写
	
	private String oldpassword;// 原密码，用作密码修改用

	private String tel;// 电话号码。【必填】

	private String email;// email

	private String group_uuid;// 关联组织UUID
	
	private Integer type;
	
	private String office;// office
	
	private String smscode;// smscode
	
	
	public String getSmscode() {
		return smscode;
	}

	public void setSmscode(String smscode) {
		this.smscode = smscode;
	}

	private String img;// 头像
	
	private Integer Sex;

	public Integer getSex() {
		return Sex;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setSex(Integer sex) {
		Sex = sex;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getGroup_uuid() {
		return group_uuid;
	}

	public void setGroup_uuid(String groupUuid) {
		group_uuid = groupUuid;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
