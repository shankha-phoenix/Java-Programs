/**
 * 
 */
package org.practice;

/**
 * Program : Remove duplicates without SET using own sort
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class RemoveDuplicates {


	public static void main(String[] args) {
		
		int[] inputArray = new int[]{1, 3, 3, 7, 1, 8, 9, 5, 9, 9, 10, 2, 1};
		int currentItem = inputArray[0];
		
		boolean found = false;
		
		for(int i = 0; i < inputArray.length; i++) {
			for (int j = i; j < inputArray.length; j++) {
				if(inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array : ");
		for (int i : inputArray) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("Array without Duplicates : ");
		
		for (int i : inputArray) {
			if(currentItem == i && !found) {
				found = true;
			} else if(currentItem != i) {
				System.out.print(currentItem);
				currentItem = i;
			}
		}
		System.out.print(currentItem);
	}
	
}
