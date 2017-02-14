package com.oa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(catalog="oa" , name="oaUser")
public class OaUser implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2435117716539273829L;
	private int Id;
	private String UserId;
	private String UserName;
	private String Password;
	private String WorkId;
	

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")  
    @GeneratedValue(generator = "generator") 
	@Column(name = "Id")
	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
	@Column(name="UserId" , length=300)
	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	@Column(name="WorkId" , length=300)
	public String getWorkId() {
		return WorkId;
	}

	public void setWorkId(String workId) {
		WorkId = workId;
	}

	@Column(name="UserName" , length=100)
	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}
	
	@Column(name="Password" , length=300)
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
