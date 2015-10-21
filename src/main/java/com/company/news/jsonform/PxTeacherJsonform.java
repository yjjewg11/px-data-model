package com.company.news.jsonform;







/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class PxTeacherJsonform extends AbstractJsonform {
	private String img;// 显示图片id
	private String groupuuid;// (继承user)电话号码。
	
	private String useruuid;// 关联用户uuid
		
	private String name;// 姓名
	
	private String content;// html内容介绍
	
	private Integer ct_stars;// 有效值,0-50.5星评价后计算平均值.(默认值30).
	
	private String summary;// 简介,100字内.
	
	private String teach_course;// 教授课程
	
	private Integer status;// 是否公开发布.1:未发布.0:发布.同课程发布.

	public String getGroupuuid() {
		return groupuuid;
	}

	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}

	public String getUseruuid() {
		return useruuid;
	}

	public void setUseruuid(String useruuid) {
		this.useruuid = useruuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCt_stars() {
		return ct_stars;
	}

	public void setCt_stars(Integer ct_stars) {
		this.ct_stars = ct_stars;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTeach_course() {
		return teach_course;
	}

	public void setTeach_course(String teach_course) {
		this.teach_course = teach_course;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}
