package com.clovyy.management.tool.common;

import java.util.Date;

import com.clovyy.management.tool.dto.ResponseDTO;

public class CommonUtility {

	public static ResponseDTO getResponse(String statusCode,String message,String statusType) {
		return new ResponseDTO(statusCode,message,statusCode,new Date());
	}
}
