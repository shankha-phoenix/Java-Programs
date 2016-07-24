/**
 * 
 */
package org.practice;

/**
 * Program : Binary Search
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class BinarySearch {
	
	public void binarySearch(int[] myArray, int key) {
		
		for(int i=0; i<myArray.length; i++) {
			if(key == myArray[i]) {
				System.out.println("Key found at : " + i);
				break;
			} else {
				System.out.println("Key not found");
			}
		}
	}
}
