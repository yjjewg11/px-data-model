package com.company.news.vo;

import java.sql.Timestamp;


/**
 * 用户基本信息表
 * @author Administrator
 *
 */

public class UserVO extends AbstactVO {
  
   private Long id;//主键
  
  private Timestamp createtime;//创建时间
  
  private String loginname;//登录名。手机号码或邮箱
  
  private String name;//昵称
  
  private String password;//密码，md5加密。（UTF-8）
  
  private String tel;//电话号码。
  
  private Integer tel_verify;//电话号码，验证。默认0，0:没验证。1:验证，2：提交验证，3.验证失败
  
  private String email;//email
  
  private String email_verify;//email,验证。默认0，0:没验证。1:验证，2：提交验证，3.验证失败
  
  private String real_name;//真实姓名
  
  private String identity_card;//身份证号
  
  private Timestamp birth;//出生年月日
  
  private String identity_card_imgurl;//上传身份证图片地址。用于认证
  
  private String real_name_verify;//实名认证。默认0，0:没验证。1:验证。2：提交验证，3.验证失败
  
  private Integer sex;//0:男,1:女
  
  private Integer online;//是否在线。0：不在线。1：在线
  
  private Integer disable;//是否被管理员封号。0：不封。1：封号，不允许登录。
  
  private String disable_reason;//被管理员封号原因。（80字符）
  
  private Timestamp logintime;//最后一次登录时间。
  
  private String city;// 所在城市
  
  private String head_imgurl;//头像地址。
  
  private Integer type;//用户类型。0:普通用户(默认)；1：跑步教练（马拉松教练）
  
  private String context;//简介，自由填写（300个字符）
  
  private Integer trainer_status;//教练工作状态：。1：可以接单。2：暂停接单。
  
  private Integer trainer_star_level;//教练评级，根据评级综合计算。1-5
  
  
  private String marathon_imgurl;//马拉松认证图片地址.
  
  private String marathon_verify;//马拉松认证状态。默认0，0:没验证。1:验证。2：提交验证，3.验证失败
 
  
  
  public String getLoginname() {
    return loginname;
  }
  public void setLoginname(String loginname) {
    this.loginname = loginname;
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
  public Integer getTel_verify() {
    return tel_verify;
  }
  public void setTel_verify(Integer tel_verify) {
    this.tel_verify = tel_verify;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail_verify() {
    return email_verify;
  }
  public void setEmail_verify(String email_verify) {
    this.email_verify = email_verify;
  }
  public String getReal_name() {
    return real_name;
  }
  public void setReal_name(String real_name) {
    this.real_name = real_name;
  }
  public String getIdentity_card() {
    return identity_card;
  }
  public void setIdentity_card(String identity_card) {
    this.identity_card = identity_card;
  }
  public String getReal_name_verify() {
    return real_name_verify;
  }
  public void setReal_name_verify(String real_name_verify) {
    this.real_name_verify = real_name_verify;
  }
  public Integer getSex() {
    return sex;
  }
  public void setSex(Integer sex) {
    this.sex = sex;
  }
  public Timestamp getCreatetime() {
    return createtime;
  }
  public void setCreatetime(Timestamp createtime) {
    this.createtime = createtime;
  }
  public Integer getOnline() {
    return online;
  }
  public void setOnline(Integer online) {
    this.online = online;
  }
  public Integer getDisable() {
    return disable;
  }
  public void setDisable(Integer disable) {
    this.disable = disable;
  }
  public Timestamp getLogintime() {
    return logintime;
  }
  public void setLogintime(Timestamp logintime) {
    this.logintime = logintime;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getHead_imgurl() {
    return head_imgurl;
  }
  public void setHead_imgurl(String head_imgurl) {
    this.head_imgurl = head_imgurl;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getIdentity_card_imgurl() {
    return identity_card_imgurl;
  }
  public void setIdentity_card_imgurl(String identity_card_imgurl) {
    this.identity_card_imgurl = identity_card_imgurl;
  }
  public String getDisable_reason() {
    return disable_reason;
  }
  public void setDisable_reason(String disable_reason) {
    this.disable_reason = disable_reason;
  }
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }
  public Integer getTrainer_status() {
    return trainer_status;
  }
  public void setTrainer_status(Integer trainer_status) {
    this.trainer_status = trainer_status;
  }
  public String getMarathon_imgurl() {
    return marathon_imgurl;
  }
  public void setMarathon_imgurl(String marathon_imgurl) {
    this.marathon_imgurl = marathon_imgurl;
  }
  public String getMarathon_verify() {
    return marathon_verify;
  }
  public void setMarathon_verify(String marathon_verify) {
    this.marathon_verify = marathon_verify;
  }
  public Timestamp getBirth() {
    return birth;
  }
  public void setBirth(Timestamp birth) {
    this.birth = birth;
  }
  public Integer getTrainer_star_level() {
    return trainer_star_level;
  }
  public void setTrainer_star_level(Integer trainer_star_level) {
    this.trainer_star_level = trainer_star_level;
  }


 

}
