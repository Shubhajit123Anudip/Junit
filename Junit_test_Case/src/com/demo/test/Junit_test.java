package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.demo.main.Junit_demo1;

public class Junit_test {
@Test //annotation 
public void max() {
	assertEquals(8,Junit_demo1.findMax(new int[] {1,3,4,2,8}));
	assertEquals(-1,Junit_demo1.findMax(new int[] {-12,-1,-3,-4,-2}));
}
}
