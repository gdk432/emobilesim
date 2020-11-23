package com.emobile.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;
/**
 * @author Mithun Bhadra
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;
	
	@NotEmpty(message = "firstName not be empty")
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty(message = "lastName not be empty")
	@Column(name = "last_name")
	private String lastName;
	
	@NotEmpty(message = "loginName not be empty")
	@Column(name = "loginName")
	private String  loginName;
	
	@NotEmpty(message = "password not be empty")
	@Column(name = "password")
	private String password;
	
	@NotEmpty(message = "userPhoneNo not be empty")
	@Column(name = "user_phone_no")
	private String userPhoneNo;
	
	@Email
	@Column(name = "email")
	private String email;
	
	@NotEmpty(message = "role not be empty")
	@Column(name = "role")
	private String  role;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
