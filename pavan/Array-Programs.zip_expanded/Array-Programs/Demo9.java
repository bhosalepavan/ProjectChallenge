package com.revision;

import java.util.Arrays;

public class Demo9 {

	public static void main(String[] args) {

		
//		int arr [] [] = new int [2] [2] ;
//		
//		arr [0][0] = 100 ;
//		arr [0][1] = 200;
//		arr[1][0]=300 ;
//		arr [1] [1] = 400 ;
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			for(int j = 0 ; j < arr.length; j++) {
//				//System.out.print(arr[i] [j]+" ");
//				System.out.print(" "+Arrays.toString(arr[i]));
//				System.out.println(" "+Arrays.toString(arr[j]));
//				
		//		int arr [] [] = {{100,200},{300,400}};
				
		//	}
	//	}

           int arr [] [] = {{100,200},{300,400}};
           for(int [] ar : arr) {
        	   System.out.println(Arrays.toString(ar));
           }

	}

}
