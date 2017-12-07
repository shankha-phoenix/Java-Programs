/**
 * 
 */
package org.demo.bubblesort;

import java.util.Scanner;

/**
 * Program : Bubble Sort Demo
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class BubbleSortDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of numbers to be sorted : ");

		int count = scan.nextInt();
		int[] myArray = new int[count];
		int i = 0;

		System.out.println("Input Numbers : ");
		while(count > 0) {
			myArray[i] = scan.nextInt();
			i++;
			count --;
		}

		BubbleSort bs = new BubbleSort();
		
		bs.bubbleSort(myArray);

	}

}
