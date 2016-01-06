package com.company.news.jsonform;

import java.util.List;


/**
 * 话题
 * @author liumingquan
 *
 */
public class SnsTopicJsonform extends AbstractJsonform {
	
	private Integer section_id;//分类id
	private String title;// 话题板块.128字符
	
	private String content;// HTML
	private List itemList;// 投票列表
	public Integer getSection_id() {
		return section_id;
	}

	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
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

	public List getItemList() {
		return itemList;
	}

	public void setItemList(List itemList) {
		this.itemList = itemList;
	}


}
