package com.abhi.spingBoot.execption;

import java.util.Date;

public class ErrorDetails {

	
	private Date dateStamp;
	private String msg;
	private String details;
	
	
	
	public ErrorDetails(Date dateStamp, String msg, String details) {
		super();
		this.dateStamp = dateStamp;
		this.msg = msg;
		this.details = details;
	}
	public Date getDateStamp() {
		return dateStamp;
	}
	public void setDateStamp(Date dateStamp) {
		this.dateStamp = dateStamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
