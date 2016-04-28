package com.company.news.jsonform;








/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class KDMovieJsonform extends AbstractJsonform {
	
	private String mp3;// 背景音乐.256字符
	
	private String title;// 家庭照片集合.128字符.XX的家
	
	private String template_key;// 模版key
	
	private String herald;// 封面.60字符()
	
	private Long photo_count=0l;// 照片计数
	
	private Integer status=0;//类型'0:发布,1:未发布.2:屏蔽',
	
	private String photo_uuids;// 关联照片的uuid.不限制字符

	public String getMp3() {
		return mp3;
	}

	public void setMp3(String mp3) {
		this.mp3 = mp3;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPhoto_count() {
		return photo_count;
	}

	public void setPhoto_count(Long photo_count) {
		this.photo_count = photo_count;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhoto_uuids() {
		return photo_uuids;
	}

	public void setPhoto_uuids(String photo_uuids) {
		this.photo_uuids = photo_uuids;
	}

	public String getHerald() {
		return herald;
	}

	public void setHerald(String herald) {
		this.herald = herald;
	}

	public String getTemplate_key() {
		return template_key;
	}

	public void setTemplate_key(String template_key) {
		this.template_key = template_key;
	}

}
