package com.tkt_booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="phn_no")
	private String phnNo;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	
	public UserEntity() {
		super();
		
	}

	public UserEntity(int userId, String userName, String password, String phnNo, String email, String address,String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phnNo = phnNo;
		this.email = email;
		this.address = address;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	

}
