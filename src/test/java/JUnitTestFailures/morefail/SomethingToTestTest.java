/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTestFailures.morefail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mflacy
 */
public class SomethingToTestTest {
	
	public SomethingToTestTest() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of doSomething method, of class SomethingToTest.
	 */
	@Test
	public void testDoSomething() {
		System.out.println("doSomething");
		SomethingToTest instance = new SomethingToTest();
		instance.doSomething();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of doSomethingElse method, of class SomethingToTest.
	 */
	@Test
	public void testDoSomethingElse() {
		System.out.println("doSomethingElse");
		Integer input = null;
		SomethingToTest instance = new SomethingToTest();
		Integer expResult = null;
		Integer result = instance.doSomethingElse(input);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
