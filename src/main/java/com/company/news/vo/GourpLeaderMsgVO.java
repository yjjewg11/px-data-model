package com.company.news.vo;

import java.io.Serializable;

public class GourpLeaderMsgVO implements Serializable {

	private String revice_useruuid;
	private String revice_user;
	private String send_useruuid;
	private String send_user;
	private String count;
	private String last_time;
	public String getRevice_useruuid() {
		return revice_useruuid;
	}
	public void setRevice_useruuid(String revice_useruuid) {
		this.revice_useruuid = revice_useruuid;
	}
	public String getRevice_user() {
		return revice_user;
	}
	public void setRevice_user(String revice_user) {
		this.revice_user = revice_user;
	}
	public String getSend_useruuid() {
		return send_useruuid;
	}
	public void setSend_useruuid(String send_useruuid) {
		this.send_useruuid = send_useruuid;
	}
	public String getSend_user() {
		return send_user;
	}
	public void setSend_user(String send_user) {
		this.send_user = send_user;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getLast_time() {
		return last_time;
	}
	public void setLast_time(String last_time) {
		this.last_time = last_time;
	}
}
