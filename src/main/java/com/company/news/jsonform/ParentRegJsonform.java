package com.company.news.jsonform;



/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ParentRegJsonform extends AbstractJsonform {

	private String password;// 密码，md5加密。（UTF-8）区分大小写

	private String tel;// 电话号码。【必填】
	
	private Integer type;
	
	private String smscode;//短信验证码

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public String getSmscode() {
		return smscode;
	}

	public void setSmscode(String smscode) {
		this.smscode = smscode;
	}


}
