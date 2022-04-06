package com.clovyy.management.tool.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.Gone;

import com.clovyy.management.tool.common.CommonUtility;
import com.clovyy.management.tool.common.GlobalConstants;
import com.clovyy.management.tool.dto.ResponseDTO;
import com.clovyy.management.tool.dto.UserDTO;
import com.clovyy.management.tool.persistence.entity.UserDetails;
import com.clovyy.management.tool.persistence.repo.UserDetailsRepo;
import com.clovyy.management.tool.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	
	@Override
	public ResponseDTO createUser(UserDTO userDTO) {
		UserDetails userDetails = this.getUserDetails(userDTO);
		ResponseDTO response;
		UserDetails user = userDetailsRepo.findById(userDTO.getUserId()).orElse(null);
		if(user == null ) {
		userDetailsRepo.save(userDetails);
		 response = CommonUtility.getResponse( GlobalConstants.STATUS_CODE_SUCCESS, "User Created Success Fully", GlobalConstants.STATUS_TYPE_SUCCESS);
		}else {
			 response = CommonUtility.getResponse( GlobalConstants.STATUS_CODE_WARN, "UserId is already taken, please Try with diffrent user Id", GlobalConstants.STATUS_TYPE_WARN);
		}
		return response;
	}

	private UserDetails getUserDetails(UserDTO userDTO) {
	UserDetails userDetails = new UserDetails();
	userDetails.setContactNum(userDTO.getContactNum());
	userDetails.setUserId(userDTO.getUserId());
	userDetails.setPassword(userDTO.getPassword());
	userDetails.setEmail(userDTO.getEmail());
	userDetails.setFirstName(userDTO.getFirstName());
	userDetails.setLastName(userDTO.getLastName());
	userDetails.setPrimarySkill(userDTO.getPrimarySkill());
	userDetails.setSeccondarySkill(userDTO.getSeccondarySkill());
	userDetails.setCreatedBy("Test User");
	userDetails.setCreatedOn(new Date());
	userDetails.setExperience(userDTO.getExperince());	
	return userDetails;
	}

}
