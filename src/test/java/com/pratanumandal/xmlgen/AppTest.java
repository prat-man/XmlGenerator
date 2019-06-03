package com.pratanumandal.xmlgen;

import java.io.IOException;
import java.net.URL;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Author: Pratanu Mandal
 * Date: 03-06-2019
 * 
 * Unit test for XmlGenerator
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test to see that it actually works
     * @throws IOException 
     */
    public void testApp() throws IOException
    {
    	Employees employees = new Employees();
    	
    	employees.addEmployee(new Employee("E1", "Pratanu", "Mandal", new Address("1", "ABC Street", "XYZ City", "PQR State", "India", "xxxxxx")));
    	employees.addEmployee(new Employee("E2", "Kartik", "Tiwari", new Address("2", "MNO Street", "BCD City", "JKL State", "India", "xxxxxx")));
    	
    	String actual = App.objectToXML(employees);
    	actual = actual.replaceAll("\\r\\n|\\r|\\n", "");

    	URL url = Resources.getResource("test.xml");
    	String expected = Resources.toString(url, Charsets.UTF_8);
    	expected = expected.replaceAll("\\r\\n|\\r|\\n", "");
    	
    	assertEquals(expected, actual);
    }
}
