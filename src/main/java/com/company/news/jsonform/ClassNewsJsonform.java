package com.company.news.jsonform;

import java.sql.Timestamp;
import java.util.List;








/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ClassNewsJsonform extends AbstractJsonform {
	private String share_url;// 分享地址.//非数据库字段.
	private String uuid;// 品牌名称
	
	private String classuuid;// 品牌名称

	private String title;// 品牌名称

	private String content;// 公司全称
	private String create_user;// 品牌名称
	private Timestamp create_time;// 创建时间
	private Timestamp reply_time;// 创建时间
	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public Timestamp getReply_time() {
		return reply_time;
	}

	public void setReply_time(Timestamp reply_time) {
		this.reply_time = reply_time;
	}

	public Timestamp getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

	private Timestamp update_time;// 创建时间
	
	private Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	private String create_useruuid;// 公司全称
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShare_url() {
		return share_url;
	}

	public void setShare_url(String share_url) {
		this.share_url = share_url;
	}
	



}
