package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.MinimumNumber;


public class MinimumNumberTest {
	@Test
	public void max() {
		assertEquals(8,MinimumNumber.findMin(new int[] {1,3,4,2,8},5));
		assertEquals(-12,MinimumNumber.findMin(new int[] {-12,-1,-3,-4,-2},5));
	}
}
