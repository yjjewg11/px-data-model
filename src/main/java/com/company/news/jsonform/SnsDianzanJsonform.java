package com.company.news.jsonform;



/**
 * 点赞
 * @author liumingquan
 *
 */
public class SnsDianzanJsonform extends AbstractJsonform {
	
	private String rel_uuid;//分类id
	private String user_uuid;//用户id
	private Integer status;//1:yes.2:no
	public String getRel_uuid() {
		return rel_uuid;
	}
	public void setRel_uuid(String rel_uuid) {
		this.rel_uuid = rel_uuid;
	}
	public String getUser_uuid() {
		return user_uuid;
	}
	public void setUser_uuid(String user_uuid) {
		this.user_uuid = user_uuid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
