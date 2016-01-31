package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class BaseDianzanJsonform extends AbstractJsonform {


	private String rel_uuid;// 品牌名称
	private Integer type;//点赞类型 0：互动 1：公告 2：课程表 3：食谱
	public String getRel_uuid() {
		return rel_uuid;
	}
	public void setRel_uuid(String rel_uuid) {
		this.rel_uuid = rel_uuid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}


}
