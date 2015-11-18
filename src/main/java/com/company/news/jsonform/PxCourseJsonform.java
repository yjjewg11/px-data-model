package com.company.news.jsonform;




/**
 * 对外发布课程
 * @author liumingquan
 */
public class PxCourseJsonform extends AbstractJsonform {
	
	private String courseuuid;// 关联对外发布课程
	private String groupuuid;//培训机构uuid
	private String logo;//
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	private Integer type;// 类型.英语,舞蹈,美术
	
	private String subtype;//子类型,手动输入:比如拉丁舞.
	
	private String title;//标题(100字内)
	
	private String address;//上课地点.
	
	private String schedule;//课时设置:每次45分钟共20课次.
	
	private String context;//课程详细内容介绍.(html).
	
	private Double fees;//收费价格(可以不填写)
	
	private Double discountfees;//优惠价格(可以不填写)
	
	private String status;// 发布状态:0:发布.1:不发布.

	private Integer age_min;//有效年龄范围最小值（不能小于0）

	private Integer age_max;//有效年龄范围最大值
	
	public Integer getAge_min() {
		return age_min;
	}
	public void setAge_min(Integer age_min) {
		this.age_min = age_min;
	}
	public Integer getAge_max() {
		return age_max;
	}
	public void setAge_max(Integer age_max) {
		this.age_max = age_max;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Double getDiscountfees() {
		return discountfees;
	}
	public void setDiscountfees(Double discountfees) {
		this.discountfees = discountfees;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGroupuuid() {
		return groupuuid;
	}
	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}
	public String getCourseuuid() {
		return courseuuid;
	}
	public void setCourseuuid(String courseuuid) {
		this.courseuuid = courseuuid;
	}

}
