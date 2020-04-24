package com.gk.model;

import java.util.Date;

public class ExceptionResponse {

	private String message;
	private int code;
	private String url;
	private Date time;
	
	public ExceptionResponse(String message, int code, String url, Date time) {
		super();
		this.message = message;
		this.code = code;
		this.url = url;
		this.time = time;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
