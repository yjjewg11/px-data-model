package com.company.news.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageQueryResultOfCreateTime implements Serializable{
		//使用创建时间做分页显示,beforeTime 取 2016-01-15 13:13 之前的数据.按照创建时间排倒序
		 private String beforeTime;
		//使用创建时间做分页显示,beforeTime 取 2016-01-15 13:13 之后的数据.按照创建时间排正序
		 private String afterTime;
		public String getBeforeTime() {
			return beforeTime;
		}
		public void setBeforeTime(String beforeTime) {
			this.beforeTime = beforeTime;
		}
		public String getAfterTime() {
			return afterTime;
		}
		public void setAfterTime(String afterTime) {
			this.afterTime = afterTime;
		}
		public PageQueryResultOfCreateTime() {
			super();
		}
}
