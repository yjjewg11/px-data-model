package com.company.news.vo;

import java.sql.Timestamp;


/**
 * 用户的时段设置表。
 * 用法一：关联课程。课程1对多个时段
 * 用法二：教练可授课时间段
 *
 */

public class TimeScheduleRelationVO extends AbstactVO {
 
  private Long id;//主键
  
  private Long create_userid;//创建用户id
  
  private Timestamp create_time;//创建时间
  
  private Integer type;//类型。1：关联课程时段。2：关联教练可授课时间段
  
  private Long relation_id;//关联对象id。与type配合使用确定关联对象。
  
  private Integer time_period;//[必填]时间周期设置。。1：表示每周。2：表示每月
  
  private String days;//[必填]根据周期设置与time_period有关，分隔符“,”。1：表示每周，时取值：1-7。2：表示每月时，取值1-31.样例：1，4，7
  
  private String start_time;//[必填]开始时间。格式24H：mm:SS,举例：14：00：00。
  
  private String end_time;//[必填]结束时间。格式24H：mm:SS,举例：17：00：00。
  
  private Integer total_time_length;//时长（单位分钟，自动计算），根据end_time-start_time计算。
  
  
  public Long getId() {
    // TODO Auto-generated method stub
    return id;
  }


  public Long getCreate_userid() {
    return create_userid;
  }


  public void setCreate_userid(Long create_userid) {
    this.create_userid = create_userid;
  }


  public Timestamp getCreate_time() {
    return create_time;
  }


  public void setCreate_time(Timestamp create_time) {
    this.create_time = create_time;
  }


  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public Long getRelation_id() {
    return relation_id;
  }


  public void setRelation_id(Long relation_id) {
    this.relation_id = relation_id;
  }


  public Integer getTime_period() {
    return time_period;
  }


  public void setTime_period(Integer time_period) {
    this.time_period = time_period;
  }




  public void setId(Long id) {
    this.id = id;
  }


  public Integer getTotal_time_length() {
    return total_time_length;
  }


  public void setTotal_time_length(Integer total_time_length) {
    this.total_time_length = total_time_length;
  }


  public String getStart_time() {
    return start_time;
  }


  public void setStart_time(String start_time) {
    this.start_time = start_time;
  }


  public String getEnd_time() {
    return end_time;
  }


  public void setEnd_time(String end_time) {
    this.end_time = end_time;
  }


  public String getDays() {
    return days;
  }


  public void setDays(String days) {
    this.days = days;
  }

}
