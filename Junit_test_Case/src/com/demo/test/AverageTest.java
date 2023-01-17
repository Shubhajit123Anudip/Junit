package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AverageTest {
	@Test
 public void Aveg(){
	 assertEquals(4,com.demo.main.Average.findAveg(new int[]{1,2,3,5,7,6},6));
 }
}
