/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTestFailures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mflacy
 */
public class MainTest {
	
	public MainTest() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of main method, of class Main.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		Main.main(args);
	}
	
}
