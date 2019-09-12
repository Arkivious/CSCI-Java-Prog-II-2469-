//===================================
// Columbus State Community College
// CSCI 2469 - Autumn Semester 2019
// Assignment: Lab 2
// Programmer: Arkivious Fischer
//===================================

package edu.cscc.csci2469.lab2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Test the {@link edu.cscc.csci2469.lab2} class
 * @author Arkivious Fischer
 */

class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}
	/**
	 * Test that employee object is properly constructed
	 * with valid parameters   
	 */
	public void testConstructorWithValidParameters() {
		Employee employee = new Employee(1234, "Kibi",32000);
		assertEquals(1234,employee.getId());
		assertEquals("Kibi",employee.getName());
		assertEquals(32000,employee.getSalary());
	}
	
	/**
	 * Test that throws an exception if an invalid
	 * parameter is entered 
	 */
	
	@Test
	public void testConstructorWithInvalidParameters() {
		assertThrows(IllegalArgumentException.class,()->{
			new Employee(0,"Kibi",32000);
		});
	}
	/**
	 * This test checks the Id for an employee
	 */
	@Test
	public void testGetId() {
		Employee employee = new Employee(1234, "Kibi", 32000);
		assertEquals(1234, employee.getId());
	}
	/**
	 * This test checks the employee name
	 */
	@Test
	public void testGetName() {
		Employee employee = new Employee(1234, "Kibi", 32000);
		assertEquals("Kibi", employee.getName());
}	
	/**
	 * This test checks the employee salary 
	 */
	@Test
	public void testGetSalary() {
		Employee employee = new Employee(1234, "Kibi", 32000);
		assertEquals(32000, employee.getSalary());
}
	/**
	 * This test for if the incorrect Id is entered 
	 * and throws an exception
	 * @throws throw IllegalArguementException 
	 */
	@Test
	public void testGetIdMismatch() {
		assertThrows(IllegalArgumentException.class, ()->{
			Employee employee1 = new Employee(0,"Kibi",32000);
			assertEquals(1234, employee1.getId());
		});
	}
	/**
	 * This test throws an exception for when 
	 * there is a name mismatch 
	 * @throws IllegalArgumentException 
	 */
	@Test
	public void testGetNameMismatch() {
		assertThrows(IllegalArgumentException.class, ()->{
			Employee employee1 = new Employee(1234,"",32000);
			assertEquals("Kibi", employee1.getName());
		});
	}
	/**
	 * This test throws an exception when the 
	 * incorrect amount for salary is input
	 * @throws IllegalargumentException 
	 */
	@Test
	public void testGetSalaryMismatch() {
		assertThrows(IllegalArgumentException.class, ()->{
			Employee employee1 = new Employee(1234,"Kibi",0);
			assertEquals(32000, employee1.getSalary());
		});
	}
}
