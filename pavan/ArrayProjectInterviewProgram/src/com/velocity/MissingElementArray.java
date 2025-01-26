package com.velocity;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,6};
		int sum1 = 0;
		
		for(int i =0; i<arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.println("sum of the element array "+ sum1);
	    int sum2 = 0;
	    for(int i = 1; i<=6; i++) {
	    	sum2 = sum2 +i;
	    }
	    System.out.println("sum of range the element array "+sum1);
	    System.out.println("Missing number element array "+(sum2 - sum1));
	}
}
