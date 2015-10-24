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
//	
//	private Integer ct_stars;// 有效值,0-50.5星评价后计算平均值.(默认值30).
	
	private String summary;// 简介,100字内.
	
	private String course_title;// 教授课程
	private Integer type;// 类型.英语,舞蹈,美术.(同课程分类)
	
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


	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	
	
}
