package com.company.news.jsonform;

import java.sql.Timestamp;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class AppraiseJsonform extends AbstractJsonform {
	  


	public String getExt_uuid() {
		return ext_uuid;
	}

	public void setExt_uuid(String ext_uuid) {
		this.ext_uuid = ext_uuid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	private String ext_uuid;// 关联教师teacheruuid
	
	private String content;// 内容(HTML)
	
	private String create_user;// 评价人
	
	private String create_useruuid;//  评价人(uuid)
	
	private Integer type;//

	private Integer score;//

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
