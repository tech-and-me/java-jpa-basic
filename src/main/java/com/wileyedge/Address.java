package com.wileyedge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Embeddable
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="zip", nullable=false)
	private String zip;
	
	public Address() {}
	
	
	public Address(String city, String zip) {
		super();
		this.city = city;
		this.zip = zip;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
