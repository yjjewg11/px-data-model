package com.company.news.jsonform;


/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class DoorRecordJsonform extends AbstractJsonform {

	private String private_key;// 密钥
	
	private String groupuuid;// 机构UUID

	private String recordlist;// 回传记录LIST，使用反序列化

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

	public String getRecordlist() {
		return recordlist;
	}

	public void setRecordlist(String recordlist) {
		this.recordlist = recordlist;
	}

}
