package com.abhi.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "First_name")
	private String firstname;
	
	@Column(name = "Last_name")
	private String lastname;
	
	@Column(name = "Employee_Id")
	private String employeeId;
	
	@Column(name = "Join_date")
	private Date sdate;
	
	@Column(name = "Reporting_Manger")
	private String reportingmanager;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Blood_Group")
	private String bloodgroup;
	
	@Column(name = "Address")
	private String adress;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstname, String lastname, String employeeId, Date sdate, String reportingmanager,
			String gender, String bloodgroup, String adress) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.employeeId = employeeId;
		this.sdate = sdate;
		this.reportingmanager = reportingmanager;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.adress = adress;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public String getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	

}
