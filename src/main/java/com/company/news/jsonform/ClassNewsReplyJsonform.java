package com.company.news.jsonform;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class ClassNewsReplyJsonform extends AbstractJsonform {


	private String classuuid;// 品牌名称


	private String content;// 公司全称

	public String getClassuuid() {
		return classuuid;
	}

	public void setClassuuid(String classuuid) {
		this.classuuid = classuuid;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	



}
