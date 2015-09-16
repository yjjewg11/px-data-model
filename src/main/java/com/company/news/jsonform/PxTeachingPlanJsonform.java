package com.company.news.jsonform;

import java.util.Date;

/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class PxTeachingPlanJsonform extends AbstractJsonform {

	private String plandateStr;// 时间.年月日,时分秒.

	private String context;// 课程详细内容.不限字数

	private String readyfor;// 需要学生准备的工具.不限字数

	private String classuuid;// 关联班级uuid(显示班级名)

	private String create_useruuid;

	private String duration;// 课程时长

	private String name;// 课程名称

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlandateStr() {
		return plandateStr;
	}

	public void setPlandateStr(String plandateStr) {
		this.plandateStr = plandateStr;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getReadyfor() {
		return readyfor;
	}

	public void setReadyfor(String readyfor) {
		this.readyfor = readyfor;
	}

	public String getClassuuid() {
		return classuuid;
	}

	public void setClassuuid(String classuuid) {
		this.classuuid = classuuid;
	}

	public String getCreate_useruuid() {
		return create_useruuid;
	}

	public void setCreate_useruuid(String create_useruuid) {
		this.create_useruuid = create_useruuid;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
