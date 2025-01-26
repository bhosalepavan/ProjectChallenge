package com.revision;

import java.util.Arrays;

public class Demo6 {//asecending decsending sorting of number

	public static void main(String[] args) {

		int arr [] = {5,8,2,6,9,3};
		
//		for(int i = 0 ; i < arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		for(int x :arr) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(arr));
		
		int temp = 0 ;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
