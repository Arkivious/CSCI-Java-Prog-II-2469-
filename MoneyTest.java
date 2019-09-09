//===================================
// Columbus State Community College
// CSCI 2469 - Autumn Semester 2019
// Assignment: Exercise 2
// Programmer: Arkivious Fischer
//===================================

package edu.cscc.csci2469.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Test the {@link edu.cscc.csci2469.examples.Money}class
 * @author Arkivious Fischer
 *
 */
class MoneyTest {
	
	@Before
	public void setUp()throws Exception{
	}
	/**
	 * Test that Money object is properly constructed
	 * with valid parameters 
	 */
	@Test
	public void testConstructorWithValidParameters() {
		Money money = new Money(100, "USD");
		assertEquals(100,money.getAmount());
		assertEquals("USD",money.getCurrency());
	}
	/**
	 * Test that throws an exception if an invalid
	 * parameter is entered 
	 */
	@Test
	public void testConstructorWithInvalidParameters() {
		assertThrows(IllegalArgumentException.class,()->{
			new Money(100,"USD");//If you change a value to an invalid parameter then the test will be a success
		});
	}
	/**
	 * This test check for the amount
	 */
	
	@Test
	public void testGetAmount() {
		Money money = new Money(100, "USD");
		assertEquals(100, money.getAmount());
	}
	/**
	 * This test checks for the currency
	 */

	@Test
	public void testGetCurrency() {
		Money money = new Money(100, "USD");
		assertEquals("USD", money.getCurrency());
		
	}
	/**
	 * This test is used to check if the
	 * the values are the sum of eachother
	 */

	@Test
	public void testAddMatch() {
		Money money1 = new Money(100, "USD");
		Money money2 = new Money(100, "USD");
		Money money3 = money1.add(money2);
		assertEquals(200,money3.getAmount());
	}
	/**
	 * This method is used to test if an incorrect
	 * operator is used.
	 * @throws IllegalsArgumentException
	 */
	@Test
	public void testAddMismatch() {
		assertThrows(IllegalArgumentException.class, ()->{
			Money money1 = new Money(100, "USD");
			Money money2 = new Money(200, "EUR");
			money1.add(money2);
		});
	}
	/**
	 * This method test if the correct 
	 * operator is used  when subtracting 
	 * objects.
	 */

	@Test
	public void testSubtractMatch() {
		Money money1 = new Money(100, "USD");
		Money money2 = new Money(100, "USD");
		Money money3 = money1.subtract(money2);
		assertEquals(0, money3.getAmount());
	}
	/**
	 * This method test if the incorrect 
	 * operator is used  when subtracting 
	 * objects.
	 * @throws IllegalargumentException 
	 */
	@Test
	public void testSubtractMisMatch() {
		assertThrows(IllegalArgumentException.class,()->{
			Money money1 = new Money(100, "USD");
			Money money2 = new Money(200,"AUD");
			money1.subtract(money2);
		});
	}

}
