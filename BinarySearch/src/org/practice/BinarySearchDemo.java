/**
 * 
 */
package org.practice;

/**
 * Program : Binary Search Demo
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		int[] myArray = {1,5,3,8,45,3,6,95,6};
		int key = 5;
		
		bs.binarySearch(myArray, key);
	}

}
