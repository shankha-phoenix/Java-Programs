package org.practice;

import java.util.Arrays;

/**
 * Program : Remove duplicates without SET using Arrays.sort()
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class RemoveDuplicatesUsingSort {

	
	public static void main(String[] args) {
		
		int[] inputArray = new int[]{1, 3, 3, 7, 1, 8, 9, 5, 9, 9, 10, 2, 1};
		int currentItem = inputArray[0];
		boolean found = false;
		
		Arrays.sort(inputArray);
		
		for (int i : inputArray) {
			if(currentItem == i && !found) {
				found = true;
			} else if(currentItem != i) {
				System.out.println(currentItem);
				currentItem = i;
			}
		}
		System.out.println(currentItem);
	}

}
