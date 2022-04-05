package com.clovyy.management.tool.service;

import com.clovyy.management.tool.dto.ResponseDTO;
import com.clovyy.management.tool.dto.UserDTO;

public interface IUserService {
	
	public ResponseDTO createUser(UserDTO userDTO); 

}
