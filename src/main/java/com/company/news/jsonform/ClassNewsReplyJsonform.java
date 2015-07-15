package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ClassNewsReplyJsonform extends AbstractJsonform {


	private String newsuuid;// 品牌名称
	private String uuid;// 品牌名称
	private Integer type;//点赞类型 0：互动 1：公告 2：课程表 3：食谱
	public String getUuid() {
		return uuid;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private String content;// 公司全称
	private String create_user;// 品牌名称

	private String create_useruuid;// 公司全称

	public String getNewsuuid() {
		return newsuuid;
	}

	public void setNewsuuid(String newsuuid) {
		this.newsuuid = newsuuid;
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
	



}
