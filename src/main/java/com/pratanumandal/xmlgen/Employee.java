package com.pratanumandal.xmlgen;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Author: Pratanu Mandal
 * Date: 31-05-2019
 */

@XmlType(propOrder={"fName", "lName", "address"})
public class Employee {
	
	private String empId;
	private String fName;
	private String lName;
	private Address address;
	
	public Employee(String empId, String fName, String lName, Address address) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}

	@XmlAttribute
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@XmlElement
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	@XmlElement
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@XmlElement
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
