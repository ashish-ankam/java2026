package com.upskill.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {
	
	
	public Student() {
		System.out.println("Zero parameterised Constructor for Hibernate");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", sAge=" + sAge + ", sCity=" + sCity + "]";
	}

	@Id
	@Column(name="SID")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	@Column(name="SNAME")
	private String sName;
	@Column(name="SAGE")
	private Integer sAge;
	@Column(name="SCITY")
	private String sCity;
}