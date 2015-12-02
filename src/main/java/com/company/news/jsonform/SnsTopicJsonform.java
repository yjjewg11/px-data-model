package com.company.news.jsonform;


/**
 * 话题
 * @author liumingquan
 *
 */
public class SnsTopicJsonform extends AbstractJsonform {
	
	private Integer section_id;//分类id
	
	private String create_useruuid;// 创建人uuid
	
	private String title;// 话题板块.128字符
	
	private String content;// HTML

	public Integer getSection_id() {
		return section_id;
	}

	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
	}

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
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

}
