package com.company.news.vo.statistics;

/**
 * 静态统计VO 
 * @author Administrator
 *
 */
public abstract class AbstractStatisticsVo {
	//图标主标题
	private String title_text;
	//图表副标题
	private String title_subtext;
	//图表 维度数据
	private String legend_data;	
	
	
	public String getLegend_data() {
		return legend_data;
	}
	public void setLegend_data(String legend_data) {
		this.legend_data = legend_data;
	}
	public String getTitle_text() {
		return title_text;
	}
	public void setTitle_text(String title_text) {
		this.title_text = title_text;
	}
	public String getTitle_subtext() {
		return title_subtext;
	}
	public void setTitle_subtext(String title_subtext) {
		this.title_subtext = title_subtext;
	}

}
