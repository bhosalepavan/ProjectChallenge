package com.revision;

public class Demo5 {
// reverse array
	public static void main(String[] args) {

		int arr [] = {15,8,5,3,9,7};
		int temp = 0 ;
		for(int i = 0 ; i < arr.length/2 ; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp ;
		}
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}

}
