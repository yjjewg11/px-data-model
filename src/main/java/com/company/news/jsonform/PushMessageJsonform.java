package com.company.news.jsonform;









/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class PushMessageJsonform extends AbstractJsonform {
	 
	  private String group_uuid;//幼儿园uuid
	  
	  private String revice_useruuid;//接收人
	  
	  private String title;//标题
	  
	  private String message;//内容
	  
	  private Integer type;//类型,标识模块.模块类型.0:公告,3:精品文章.4:招生计划.5:课程表.6:食谱.99:班级互动.
	  
	  private String rel_uuid;//模块下的uuid
	  
	  private String url;//访问地址.

	public String getGroup_uuid() {
		return group_uuid;
	}

	public void setGroup_uuid(String group_uuid) {
		this.group_uuid = group_uuid;
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

	public String getRel_uuid() {
		return rel_uuid;
	}

	public void setRel_uuid(String rel_uuid) {
		this.rel_uuid = rel_uuid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
