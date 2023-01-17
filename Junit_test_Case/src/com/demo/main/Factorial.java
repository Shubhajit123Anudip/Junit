package com.demo.main;

public class Factorial {
  public static boolean findfact(int num) {
	if(num==0)
	return false;
	int f=1;
	while(num!=0) {
		f=f*num;
		num--;
	}
	 return true;
	 }
  }
