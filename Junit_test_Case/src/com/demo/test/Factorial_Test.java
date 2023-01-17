package com.demo.test;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.demo.main.Factorial;

public class Factorial_Test {
	@Test //annotation specifics that method is the test method
	public void fact() {
		//assertTrue(Factorial.findfact(5));
		assertEquals(120,Factorial.findfact(5));
	}
}
