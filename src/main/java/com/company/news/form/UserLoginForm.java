package com.company.news.form;

public class UserLoginForm {
  private String loginname;//登录用户名
  private String password;//登录密码
  private String grouptype;//登录标志,如果是grouptype=0表示,后台管理员.
  public String getGrouptype() {
	return grouptype;
}
public void setGrouptype(String grouptype) {
	this.grouptype = grouptype;
}
public String getLoginname() {
    return loginname;
  }
  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
