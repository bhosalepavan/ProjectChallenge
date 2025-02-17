package com.velocity;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 1. Creating and initializing an array
        int[] numbers = {3, 5, 7, 2, 8, 1, 4};

        // 2. Printing the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 3. Finding the length of the array
        System.out.println("Length of Array: " + numbers.length);

        // 4. Accessing elements by index
        System.out.println("Element at index 2: " + numbers[2]);  // Output: 7

        // 5. Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 6. Searching for an element in the array (binary search)
        int index = Arrays.binarySearch(numbers, 5);
        if (index >= 0) {
            System.out.println("Element 5 found at index: " + index);
        } else {
            System.out.println("Element 5 not found in the array.");
        }

        // 7. Filling an array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println("Array after filling with 0: " + Arrays.toString(numbers));

        // 8. Copying an array
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(newNumbers));

        // 9. Checking if two arrays are equal
        int[] anotherArray = {0, 0, 0, 0, 0, 0, 0};
        boolean areArraysEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Are the arrays equal? " + areArraysEqual);
        
    }


	}


