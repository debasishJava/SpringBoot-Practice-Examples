package com.coforge.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Column("cname")
	String name;
	@Column("cob")
	String countryOfBirth;
	@Column("date")
	Date date;
	@Id
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer(String name, String countryOfBirth, Date date,int id) {
		super();
		this.name = name;
		this.countryOfBirth = countryOfBirth;
		this.date = date;
		this.id=id;
	}
	
	
}
