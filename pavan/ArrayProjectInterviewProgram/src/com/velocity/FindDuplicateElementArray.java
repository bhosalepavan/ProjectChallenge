package com.velocity;

import java.util.HashSet;

public class FindDuplicateElementArray {

	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 3, 8};

        // Create a HashSet to track unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and find duplicates
        for (int i = 0; i < arr.length; i++) {
            // If element is already in the set, it's a duplicate
            if (!set.add(arr[i])) {
                System.out.println("Duplicate found: " + arr[i]);
            }
}
}
}