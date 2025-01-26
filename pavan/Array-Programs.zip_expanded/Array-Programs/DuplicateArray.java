package com.revision;

public class DuplicateArray {

	public static void main(String[] args) {

		int arr[] = {15,8,15,12,13,14,98,17,98};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1 ; j <arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}
