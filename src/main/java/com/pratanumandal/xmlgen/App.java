package com.pratanumandal.xmlgen;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Author: Pratanu Mandal
 * Date: 31-05-2019
 */

public class App 
{
    public static void main(String[] args) {
    	
    	Employees employees = new Employees();
    	
    	employees.addEmployee(new Employee("E1", "Pratanu", "Mandal", new Address("1", "ABC Street", "XYZ City", "PQR State", "India", "xxxxxx")));
    	employees.addEmployee(new Employee("E2", "Kartik", "Tiwari", new Address("2", "MNO Street", "BCD City", "JKL State", "India", "xxxxxx")));
    	
    	String xml = objectToXML(employees);
    	
    	System.out.println(xml);
    	
    }
    
    public static String objectToXML(Employees root) {
    	
        try {
            // create JAXB context
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
             
            // create marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            // format XML string
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            // save XML string to sw
            StringWriter sw = new StringWriter();
             
            // write XML to StringWriter
            jaxbMarshaller.marshal(root, sw);
             
            // return XML Content
            return sw.toString();
 
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
