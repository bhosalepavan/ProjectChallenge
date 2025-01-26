package com.revision;

public class Demo2 {

	public static void main(String[] args) {

		int arr [] = {101,102,103,104,105};
		arr[0] = 100;  // update value
		arr[1] = 200 ;
		
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
