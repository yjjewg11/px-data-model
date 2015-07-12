package com.company.news.jsonform;


/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class AccountsJsonform extends AbstractJsonform {

	private String uuid;// 品牌名称

	private String classuuid;// 品牌名称
	private String groupuuid;// 品牌名称
	private String title;// 品牌名称
	  private String create_user;//
	private String create_useruuid;//
	private String description;// 公司全称
	private String accounts_timeStr;
	private Double num;
	private Integer type;
	private String  studentuuid;

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
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getClassuuid() {
		return classuuid;
	}

	public void setClassuuid(String classuuid) {
		this.classuuid = classuuid;
	}

	public String getGroupuuid() {
		return groupuuid;
	}

	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAccounts_timeStr() {
		return accounts_timeStr;
	}

	public void setAccounts_timeStr(String accounts_timeStr) {
		this.accounts_timeStr = accounts_timeStr;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}
	public String getStudentuuid() {
		return studentuuid;
	}
	public void setStudentuuid(String studentuuid) {
		this.studentuuid = studentuuid;
	}

}
