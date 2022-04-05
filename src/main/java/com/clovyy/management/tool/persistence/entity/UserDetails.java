package com.clovyy.management.tool.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="projectdb", name="user_details")
public class UserDetails {

	@Id
	@Column(name="USER_ID")
	String userId;
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="FIRST_NAME")
	String firstName;
	
	@Column (name="LAST_NAME")
	String lastName;
	
	@Column(name="CONTACT_NUM")
	String contactNum;
	
	
	String email;
	
}
