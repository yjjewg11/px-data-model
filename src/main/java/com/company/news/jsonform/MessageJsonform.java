package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class MessageJsonform extends AbstractJsonform {
	  
	  private String send_user;//品牌名称
	  
	  private String send_useruuid;//公司全称
	  
	  private String revice_user;//品牌名称
	  
	  private String revice_useruuid;//公司全称
	  
	  private String title;//坐标
	  
	  private String message;//电话
	  
	  private Integer type;//类型'0:普通通知 1:内部通知 2：班级通知',

	public String getSend_user() {
		return send_user;
	}

	public void setSend_user(String send_user) {
		this.send_user = send_user;
	}

	public String getSend_useruuid() {
		return send_useruuid;
	}

	public void setSend_useruuid(String send_useruuid) {
		this.send_useruuid = send_useruuid;
	}

	public String getRevice_user() {
		return revice_user;
	}

	public void setRevice_user(String revice_user) {
		this.revice_user = revice_user;
	}

	public String getRevice_useruuid() {
		return revice_useruuid;
	}

	public void setRevice_useruuid(String revice_useruuid) {
		this.revice_useruuid = revice_useruuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	  

}
