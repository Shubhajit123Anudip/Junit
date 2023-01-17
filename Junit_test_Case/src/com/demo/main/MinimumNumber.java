package com.demo.main;

public class MinimumNumber {
 public static int findMin(int[] arr,int total){ 
     int temp;
	 for(int i=0;i<total;i++) {
		 for(int j=i+1;j<total;j++) {
			 if(arr[i]>arr[j]) {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
			
	 }
	 return arr[0];
 }
}
