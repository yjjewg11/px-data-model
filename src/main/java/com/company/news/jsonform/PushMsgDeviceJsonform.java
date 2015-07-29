package com.company.news.jsonform;


public class PushMsgDeviceJsonform extends AbstractJsonform {
	private String group_uuid;// 组织名
	private String user_uuid;// 关联 用户uuid.
	
	private Integer type;//1:表示家长版本,2表示老师版本.
	
	private String device_type;//设备类型,android,ios
	
	private String device_id;//设备唯一表示,用户单手机推送.
	
	private Integer status;//状态:其他或0表示启用.2:表示禁用消息推送.
	public String getUser_uuid() {
		return user_uuid;
	}
	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	} 
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getGroup_uuid() {
		return group_uuid;
	}
	public void setGroup_uuid(String group_uuid) {
		this.group_uuid = group_uuid;
	}
	
	

}
