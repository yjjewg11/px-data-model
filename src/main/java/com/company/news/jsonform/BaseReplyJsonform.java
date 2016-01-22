package com.company.news.jsonform;








/**
 * 回复（基本类）其他要继承他
 * 
 * @author Administrator
 * 
 */
public class BaseReplyJsonform extends AbstractJsonform {

	private String to_useruuid;//给指定人回复的回复.
	private String rel_uuid;// 品牌名称
	private String uuid;// 品牌名称
	private Integer type;//点赞类型 0：互动 1：公告 2：课程表 3：食谱
	private String content;// 公司全称
	public String getTo_useruuid() {
		return to_useruuid;
	}
	public void setTo_useruuid(String to_useruuid) {
		this.to_useruuid = to_useruuid;
	}
	public String getRel_uuid() {
		return rel_uuid;
	}
	public void setRel_uuid(String rel_uuid) {
		this.rel_uuid = rel_uuid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
