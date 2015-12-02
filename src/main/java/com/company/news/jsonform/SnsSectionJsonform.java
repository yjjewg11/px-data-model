package com.company.news.jsonform;


/**
 * 话题板块
 * @author liumingquan
 *
 */
public class SnsSectionJsonform extends AbstractJsonform {
	
	private Integer id;//分类id
	private String img;// logo图片
	private String title;// 话题板块.20字符
	private Integer ind;//排序.倒叙
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getInd() {
		return ind;
	}
	public void setInd(Integer ind) {
		this.ind = ind;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
