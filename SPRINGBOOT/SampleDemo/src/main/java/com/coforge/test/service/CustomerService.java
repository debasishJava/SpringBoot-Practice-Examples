package com.coforge.test.service;

import java.util.Date;
import java.util.List;

public class CustomerService {

	List list;
	String country;
	String name;
	Date dob;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
