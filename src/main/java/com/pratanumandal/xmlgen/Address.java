package com.pratanumandal.xmlgen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Author: Pratanu Mandal
 * Date: 31-05-2019
 */

@XmlType(propOrder={"houseNo", "street", "city", "state", "country", "pin"})
public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private String pin;
	
	public Address(String houseNo, String street, String city, String state, String country, String pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	@XmlElement
	public String getHouseNo() {
		return houseNo;
	}
	
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	@XmlElement
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	@XmlElement
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElement
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@XmlElement
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	@XmlElement
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
