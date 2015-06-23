package com.company.news.jsonform;

import java.sql.Timestamp;





/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class TeachingPlanJsonform extends AbstractJsonform {
	  
	  private String create_useruuid;//机构ID
	  
	  private String classuuid;//早餐
	  
	  private String plandateStr;//早餐
	  
	  private String afternoon;//早餐
	  
	  private String morning;//早餐

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}

	public String getClassuuid() {
		return classuuid;
	}

	public void setClassuuid(String classuuid) {
		this.classuuid = classuuid;
	}

	public String getPlandateStr() {
		return plandateStr;
	}

	public void setPlandateStr(String plandateStr) {
		this.plandateStr = plandateStr;
	}

	public String getAfternoon() {
		return afternoon;
	}

	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}

	public String getMorning() {
		return morning;
	}

	public void setMorning(String morning) {
		this.morning = morning;
	}
	  

}
