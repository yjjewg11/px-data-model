package com.company.news.jsonform;



/**
 * 用户注册，body传入json数据转对象。
 * 
 * @author Administrator
 * 
 */
public class GroupRegJsonform extends UserRegJsonform {
	private String uuid;
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private String brand_name;// 品牌名称
	private String company_name;// 公司全称
	private String address;// 地址
	private String map_point;// 坐标
	private String link_tel;// 电话
	private Integer type;// 机构类型
	private String description;//  


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brandName) {
		brand_name = brandName;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String companyName) {
		company_name = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMap_point() {
		return map_point;
	}

	public void setMap_point(String mapPoint) {
		map_point = mapPoint;
	}

	public String getLink_tel() {
		return link_tel;
	}

	public void setLink_tel(String linkTel) {
		link_tel = linkTel;
	}



}
