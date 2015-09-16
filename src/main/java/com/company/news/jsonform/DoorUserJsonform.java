package com.company.news.jsonform;


/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class DoorUserJsonform extends AbstractJsonform {

	private String private_key;// 密钥
	
	private String groupuuid;// 机构UUID

	private String cardid;// 卡ID
	
	private String userid;// 用户编码
	
	private String userName;// 用户名
	
	private String idNo;// 身份证

	public String getGroupuuid() {
		return groupuuid;
	}

	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}

	public String getPrivate_key() {
		return private_key;
	}

	public void setPrivate_key(String private_key) {
		this.private_key = private_key;
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}



}
