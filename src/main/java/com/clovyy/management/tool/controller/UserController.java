package com.clovyy.management.tool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clovyy.management.tool.dto.ResponseDTO;
import com.clovyy.management.tool.dto.UserDTO;
import com.clovyy.management.tool.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IUserService userService;	
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO> createUser(@RequestBody UserDTO userDTO){		
		ResponseDTO responseDto= userService.createUser(userDTO);	
        return ResponseEntity.ok(responseDto) ;    
	}
}
