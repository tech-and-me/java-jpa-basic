package com.wileyedge;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "empl")
public class Employee {

	@Id
	private int id;

	@Column(name = "firstname")
	private String fname;

	@Column(name = "lastname")
	private String lname;
	
	/*
	 * @Embedded
	 * 
	 * @AttributeOverrides( {
	 * 
	 * @AttributeOverride(name="city", column=@Column(name="emp_city")),
	 * 
	 * @AttributeOverride(name="zip",column=@Column(name="emp_zip")) })
	 */
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn private Address addr;
	 */
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Address addr;
	
	
	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	

	/*
	 * public Employee(int id, String fname, String lname, Address addr) { super();
	 * this.id = id; this.fname = fname; this.lname = lname; this.addr = addr; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}


}
