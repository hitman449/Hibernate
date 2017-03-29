package com.pratyush.entity;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="UserDetails")
public class UserDetails {

	@Id @GeneratedValue
	private int userId;
	@Column(name="password")
	private String password;
	@Column(name="joinedDate")
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Lob
	private Date joinedDate;
	@Column(name="desciption")
	private String desciption;
	@Column(name="address")
	private String address;
	@javax.persistence.Transient
	private String valueNotInserted;
	
	public String getValueNotInserted() {
		return valueNotInserted;
	}
	public void setValueNotInserted(String valueNotInserted) {
		this.valueNotInserted = valueNotInserted;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
