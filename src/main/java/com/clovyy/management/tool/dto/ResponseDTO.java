package com.clovyy.management.tool.dto;

import java.util.Date;

public class ResponseDTO {
	String statusCode;
	String message;
	String statusType;
	Date timeStamp;
	
	public ResponseDTO(String statusCode, String message, String statusType, Date timeStamp) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.statusType = statusType;
		this.timeStamp = timeStamp;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
