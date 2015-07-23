package com.company.news.jsonform;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class StudentBindJsonform extends AbstractJsonform {
	private String studentuuid;// 登录名。手机号码或邮箱
	private String uuid;// 登录名。手机号码或邮箱
	private String cardid;// 姓名.
	
	private String create_user;// 密码，md5加密。（UTF-8）
	
	private String create_useruuid;//
	
	private Integer type;//1:门禁卡
	
	private String note;// 
	
	private String name;//

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getStudentuuid() {
		return studentuuid;
	}

	public void setStudentuuid(String studentuuid) {
		this.studentuuid = studentuuid;
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
