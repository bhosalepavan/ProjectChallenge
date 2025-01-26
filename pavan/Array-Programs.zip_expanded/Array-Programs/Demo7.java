package com.revision;

public class Demo7 {

	public static void main(String[] args) {

	 int arr [] = {3,5,7,1,6,4,2};
	 int sum = 5 ;
	 for(int i = 0 ; i < arr.length;i++) {
		 for(int j = i+1 ; j < arr.length;j++) {
			 if(arr[i]+arr[j] == sum) {
				 System.out.println(arr[i]+"+"+arr[j]+"="+sum);
			 }
		 }
	 }
	}

}
