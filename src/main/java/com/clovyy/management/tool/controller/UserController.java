package com.clovyy.management.tool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clovyy.management.tool.dto.UserDTO;

@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public String createUser(@RequestBody UserDTO userDTO){
		logger.info("USER Info {}",userDTO);
    return "success";    
	}
}
