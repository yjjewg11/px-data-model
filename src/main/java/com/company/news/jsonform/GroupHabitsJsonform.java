package com.company.news.jsonform;






/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class GroupHabitsJsonform extends AbstractJsonform {
	  private String groupuuid;//分类名
	  private String k;//值
	  private String v;//100字内
	public String getGroupuuid() {
		return groupuuid;
	}
	public void setGroupuuid(String groupuuid) {
		this.groupuuid = groupuuid;
	}
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}


	
}
