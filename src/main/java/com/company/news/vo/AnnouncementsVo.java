package com.company.news.vo;

import java.sql.Timestamp;


import com.company.news.query.PageQueryResult;



public class AnnouncementsVo{
	  private String uuid;//品牌名称
	  
	  private Timestamp create_time;//创建时间
	  
	  private String create_user;//品牌名称
	  
	  private String create_useruuid;//公司全称
	  
	  private Integer isimportant;//类型：'0:普通 1：重要',
	  
	  private String title;//坐标
	  
	  private String message;//电话
	  
	  private Integer type;//类型'0:普通通知 1:内部通知 2：班级通知',
	  
	  private String groupuuid;//坐标	 
	  

	  private String classuuids;
	  

	private PageQueryResult replyPage;// 回复第一页数据
	private DianzanListVO dianzan;// 点赞数据
	private String classnames;
	  
	  public String getClassuuids() {
		return classuuids;
	}
	public void setClassuuids(String classuuids) {
		this.classuuids = classuuids;
	}
	public String getClassnames() {
		return classnames;
	}
	public void setClassnames(String classnames) {
		this.classnames = classnames;
	}

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	
	  
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_useruuid() {
		return create_useruuid;
	}
	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}
	public Integer getIsimportant() {
		return isimportant;
	}
	public void setIsimportant(Integer isimportant) {
		this.isimportant = isimportant;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getGroupuuid() {
		return groupuuid;
	}
	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}
	public PageQueryResult getReplyPage() {
		return replyPage;
	}
	public void setReplyPage(PageQueryResult replyPage) {
		this.replyPage = replyPage;
	}
	public DianzanListVO getDianzan() {
		return dianzan;
	}
	public void setDianzan(DianzanListVO dianzan) {
		this.dianzan = dianzan;
	}
	  


}
