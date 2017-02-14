package com.oa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(catalog="oa" , name="deptMessage")
public class DeptMessage implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -574628689471784574L;
	private int id;
	private String deptNo;
	private String deptName;
	private String deptAllName;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")  
    @GeneratedValue(generator = "generator") 
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="deptNo" , length=100)
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	@Column(name="deptName" , length=300)
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Column(name="deptAllName" , length=500)
	public String getDeptAllName() {
		return deptAllName;
	}
	public void setDeptAllName(String deptAllName) {
		this.deptAllName = deptAllName;
	}
	
	
}
