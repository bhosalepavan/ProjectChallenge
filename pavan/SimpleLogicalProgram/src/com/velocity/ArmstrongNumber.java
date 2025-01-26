package com.velocity;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		System.err.println("Enter any number");
//		
//		int num = 0 , rem , c=0 , arm = 0;
//		num=c;
//		while(num > 0) {
//			
//			rem = num%10;
//			arm=(rem*rem*rem)+arm;
//			num=num/10;
//			
//		}
//		
//		if(c==arm) 
//			
//		System.err.println(c+"armstrong is number ");
//		else
//			System.err.println(c+"armstrog is not number ");
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int remainder;
        int result = 0;
        
        // Calculate the number of digits
        int n = String.valueOf(number).length();
        
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();

	}

}
