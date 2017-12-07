/**
 * 
 */
package org.demo.bubblesort;

/**
 * Program : Bubble Sort
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class BubbleSort {
	
	public void bubbleSort(int[] myArray) {
		
		for(int i=0; i<myArray.length; i++) {
			for(int j=i+1; j<myArray.length; j++) {
				if(myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		System.out.println("Output Sorted Array : ");
		for (int i : myArray) {
			System.out.print(i + " ");
		}
	}
	
}
