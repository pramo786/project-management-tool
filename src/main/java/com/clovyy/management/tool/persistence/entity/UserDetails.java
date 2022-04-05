package com.clovyy.management.tool.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "projectdb", name = "user_details")
public class UserDetails {

	@Id
	@Column(name = "USER_ID")
	String userId;

	@Column(name = "PASSWORD")
	String password;

	@Column(name = "FIRST_NAME")
	String firstName;

	@Column(name = "LAST_NAME")
	String lastName;

	@Column(name = "CONTACT_NUM")
	String contactNum;

	@Column(name = "EMAIL")
	String email;

	@Column(name = "PRIMARY_SKILL")
	String primarySkill;

	@Column(name = "SECCONDARY_SKILL")
	String seccondarySkill;

	@Column(name = "RAITING")
	String raiting;

	@Column(name = "EXPERIENCE")
	String experience;

	@Column(name = "CREATED_BY")
	String createdBy;

	@Column(name = "CREATED_ON")
	Date createdOn;

	@Column(name = "UPDATED_BY")
	String updatedBy;

	@Column(name = "UPDATED_ON")
	Date updatedOn;

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

	public String getRaiting() {
		return raiting;
	}

	public void setRaiting(String raiting) {
		this.raiting = raiting;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	
	

}
