package com.oa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(catalog="oa" , name="user")
public class User implements java.io.Serializable{
	private static final long serialVersionUID = 5127853981202454040L;
	private int Id;
	private String UserName;
	private String Password;
	private String SessionId;
	private String UserNo;//工号
	private String Name;
	private int Sex;//1:man 2:woman
	private String JobTitle;//职称
	private String JobLevel;
	private String DeptNO;//部门编号
	

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")  
    @GeneratedValue(generator = "generator") 
	@Column(name = "id")
	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
	@Column(name="userNo" , length=100)
	public String getUserNo() {
		return this.UserNo;
	}

	public void setUserNo(String userNo) {
		this.UserNo = userNo;
	}
	
	@Column(name="userName" , length=100)
	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}
	
	@Column(name="Sex" , length=30)
	public int getSex() {
		return this.Sex;
	}

	public void setSex(int sex) {
		this.Sex = sex;
	}
	
	@Column(name="JobTitle" , length=100)
	public String getJobTitle() {
		return this.JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.JobTitle = jobTitle;
	}
	
	@Column(name="JobLevel" , length=100)
	public String getJobLevel() {
		return this.JobLevel;
	}
	
	public void setJobLevel(String jobLevel) {
		this.JobLevel = jobLevel;
	}
	
	@Column(name="DeptNO" , length=100)
	public String getDeptNO() {
		return this.DeptNO;
	}

	public void setDeptNO(String deptNO) {
		this.DeptNO = deptNO;
	}
	
	@Column(name="Name" , length=100)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Column(name="Password" , length=300)
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	@Column(name="SessionId" , length=500)
	public String getSessionId() {
		return SessionId;
	}

	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	
	
}
