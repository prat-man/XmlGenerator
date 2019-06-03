package com.pratanumandal.xmlgen;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Author: Pratanu Mandal
 * Date: 31-05-2019
 */

@XmlRootElement
public class Employees {
	
	private ArrayList<Employee> empList;
	
	public Employees() {
		super();
		this.empList = new ArrayList<>();
	}

	@XmlElement(name="employee")
	public ArrayList<Employee> getEmployees() {
		return empList;
	}

	public void addEmployee(Employee employee) {
		this.empList.add(employee);
	}
	
}
