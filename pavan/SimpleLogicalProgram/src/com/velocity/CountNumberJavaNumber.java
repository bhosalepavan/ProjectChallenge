package com.velocity;

public class CountNumberJavaNumber {
	
	public static void main(String[] args) {
		
		int num =1234;
		
		int count=0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
		System.out.println("count the number java program "+count);
		
		
	}

}
