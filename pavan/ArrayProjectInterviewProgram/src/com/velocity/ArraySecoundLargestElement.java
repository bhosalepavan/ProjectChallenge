package com.velocity;

public class ArraySecoundLargestElement {

	public static void main(String[] args) {
		int size , temp;
		int arr[] = {10,20,30,40,50};
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++){
       for (int j = 0; j < arr.length - i - 1; j++) {

		if(arr[i] < arr[j+1]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		}
		System.out.println("the maximum element number"+ arr[2]);
	}
}
