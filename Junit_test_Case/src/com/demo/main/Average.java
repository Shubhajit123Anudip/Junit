package com.demo.main;

public class Average {
 public static int findAveg(int[] first,int n1) {
	 int sum=first[0];
	 n1=first.length;
	 for(int i=0;i<n1;i++)
		 sum+=first[i];
	   return sum/n1;
 }
}
