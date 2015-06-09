package com.company.news.jsonform;



/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class UserRegJsonform extends AbstractJsonform {

	private String name;// 昵称

	private String password;// 密码，md5加密。（UTF-8）区分大小写

	private String tel;// 电话号码。【必填】

	private String email;// email

	private String group_uuid;// 关联组织UUID
	
	private Integer type;// 用户类型。0:普通用户(默认)；1:组织管理员
	
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
