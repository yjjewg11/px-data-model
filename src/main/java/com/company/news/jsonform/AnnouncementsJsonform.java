package com.company.news.jsonform;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class AnnouncementsJsonform extends AbstractJsonform {
	  private String create_user;//

	  private String start_timeStr;//开始时间
	  private String end_timeStr;//结束时间

	public String getStart_timeStr() {
		return start_timeStr;
	}
	public void setStart_timeStr(String start_timeStr) {
		this.start_timeStr = start_timeStr;
	}
	public String getEnd_timeStr() {
		return end_timeStr;
	}
	public void setEnd_timeStr(String end_timeStr) {
		this.end_timeStr = end_timeStr;
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
	private String create_useruuid;//
	  private String uuid;//
	  
	  public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	private String classuuids;//通知班级列表
	  
	  public String getClassuuids() {
		return classuuids;
	}
	public void setClassuuids(String classuuids) {
		this.classuuids = classuuids;
	}
	private Integer isimportant;//类型：'0:普通 1：重要',
	  
	  private String title;//坐标
	  
	  private String message;//电话
	  
	  private Integer type;//类型'0:普通通知 1:内部通知 2：班级通知',
	  
	  private String groupuuid;//机构  

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
	  

}
