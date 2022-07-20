package com.example.EmployeesCrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Employees")
public class Employees {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String employeename;
    private String designation;
    private String username;
    private int password;
    private String email;
    private int rollid;
    
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	public Employees(Long id, String employeename, String designation, String username, int password, String email,
			int rollid) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.designation = designation;
		this.username = username;
		this.password = password;
		this.email = email;
		this.rollid = rollid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollid() {
		return rollid;
	}
	public void setRollid(int rollid) {
		this.rollid = rollid;
	}

		
}

	
