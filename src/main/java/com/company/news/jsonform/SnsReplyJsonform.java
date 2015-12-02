package com.company.news.jsonform;

import java.sql.Timestamp;

/**
 * 话题(回复)回复
 * @author liumingquan
 *
 */
public class SnsReplyJsonform extends AbstractJsonform {
	
	private String topic_uuid;// 话题回复
	
	private String reply_uuid;//回复的回复.未null表示直接回复的话题.
	
	private String content;// HTML

	public String getTopic_uuid() {
		return topic_uuid;
	}

	public void setTopic_uuid(String topic_uuid) {
		this.topic_uuid = topic_uuid;
	}

	public String getReply_uuid() {
		return reply_uuid;
	}

	public void setReply_uuid(String reply_uuid) {
		this.reply_uuid = reply_uuid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


}
