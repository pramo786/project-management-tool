package com.clovyy.management.tool.dto;

public class UserDTO {
	String userId;
	String password;
	String firstName;
	String lastName;
	String contactNum;
	String email;
	String primarySkill;
	String seccondarySkill;	
	String experince;
	String userRole;
	
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	public String getSeccondarySkill() {
		return seccondarySkill;
	}
	public void setSeccondarySkill(String seccondarySkill) {
		this.seccondarySkill = seccondarySkill;
	}
	public String getExperince() {
		return experince;
	}
	public void setExperince(String experince) {
		this.experince = experince;
	}
	
	
}
