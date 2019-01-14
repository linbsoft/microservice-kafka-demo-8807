package com.linbsoft.microservicekafkademo8807;

import java.util.Date;

import lombok.Data;

@Data
public class Message {
    private Long id;//id
    private String msg; //消息
    private Date sendTime; //发送时间
	public void setId(Long i) {
		this.id=i;
	}
	public Long getId() {
	return this.id;
	}
	public void setMsg(String string) {
		this.msg=string;
	}
	public String getMsg() {
		return this.msg;
	}
	public void setSendTime(Date date) {
		this.sendTime=date;
	}
	public Date getSendTime() {
		return  this.sendTime;
	}	 
}
