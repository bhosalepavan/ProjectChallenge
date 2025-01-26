package com.revision;

import java.util.Arrays;

public class Demo4 {
//find min and max array 
	public static void main(String[] args) {

    	int arr [] = {15,8,5,9,3,7};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("min : :"+arr[0]);
//		System.out.println("max : :"+arr[arr.length-1]);
//		
		
		int min  = arr[0];
		int max  = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min Element ::"+min);
		System.out.println("Max Element ::"+max);
	}

}
