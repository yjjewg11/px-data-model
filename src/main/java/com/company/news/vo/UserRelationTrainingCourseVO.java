package com.company.news.vo;

import java.sql.Timestamp;


/**
 * 用户的时段设置表。
 * 用法一：关联课程。课程1对多个时段
 * 用法二：教练可授课时间段
 *
 */

public class UserRelationTrainingCourseVO extends AbstactVO {

    private Long id;//主键
    
    private Long user_id;//关联普通用户id
    
    private Long course_id;//关联课程id
    
    private Long time_schedule_id;//关联课程时段id
    
    private Timestamp course_time;//课程上课时间　
    
    private Timestamp create_time;//关联时间　　　　
    
    private Integer status;//订单状态：2：已接单，3：待支付，4支付完成，4：课程完成,5:关闭。
    
    private Timestamp receiving_order_time;//接单时间
    
    private Timestamp pay_time;//支付时间
    
    private Timestamp complete_time;//关闭时间
    
    private Integer  appraise_level;//评价级别。必填。1-5星。默认5星。
    
    private String  appraise_context;//评价内容。[最大300字数]可以不填写。
    
    private Timestamp  appraise_time;//时间。

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getTime_schedule_id() {
        return time_schedule_id;
    }

    public void setTime_schedule_id(Long time_schedule_id) {
        this.time_schedule_id = time_schedule_id;
    }

    public Timestamp getCourse_time() {
        return course_time;
    }

    public void setCourse_time(Timestamp course_time) {
        this.course_time = course_time;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getReceiving_order_time() {
        return receiving_order_time;
    }

    public void setReceiving_order_time(Timestamp receiving_order_time) {
        this.receiving_order_time = receiving_order_time;
    }

    public Timestamp getPay_time() {
        return pay_time;
    }

    public void setPay_time(Timestamp pay_time) {
        this.pay_time = pay_time;
    }

    public Timestamp getComplete_time() {
        return complete_time;
    }

    public void setComplete_time(Timestamp complete_time) {
        this.complete_time = complete_time;
    }

    public Integer getAppraise_level() {
        return appraise_level;
    }

    public void setAppraise_level(Integer appraise_level) {
        this.appraise_level = appraise_level;
    }

    public String getAppraise_context() {
        return appraise_context;
    }

    public void setAppraise_context(String appraise_context) {
        this.appraise_context = appraise_context;
    }

    public Timestamp getAppraise_time() {
        return appraise_time;
    }

    public void setAppraise_time(Timestamp appraise_time) {
        this.appraise_time = appraise_time;
    }
}
