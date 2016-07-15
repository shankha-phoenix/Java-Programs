package org.practice;

/**
 * Program : Merge two arrays without Duplicates
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class MergeWithoutDuplicates {

	public static void main(String[] args) {
		
		int[] inputArrayOne = new int[]{1, 3, 3, 7, 1, 8, 9, 5, 9, 9, 10, 2, 1};
		int[] inputArrayTwo = new int[]{2, 5, 9, 4, 2, 5, 6, 7, 6, 10, 15, 1, 5};
		
		int[] mergedArray = new int[inputArrayOne.length + inputArrayTwo.length];
		
		
		int count = 0;
		
		for (int i : inputArrayOne) {
			mergedArray[count] = i;
			count ++;
		}
		
		for (int i : inputArrayTwo) {
			mergedArray[count] = i;
			count ++;
		}
		
		System.out.println("Merged Array : ");
		for (int i : mergedArray) {
			System.out.print(i);
		}
		
		for(int i=0; i<mergedArray.length; i++) {
			for(int j=i; j<mergedArray.length; j++) {
				if(mergedArray[i] > mergedArray[j]) {
					int temp = mergedArray[i];
					mergedArray[i] = mergedArray[j];
					mergedArray[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted Merged Array : ");
		for (int i : mergedArray) {
			System.out.print(i);
		}
		
		int currentItem = mergedArray[0];
		boolean found = false;
		
		System.out.println();
		System.out.println("Array without Duplicates : ");
		for (int i : mergedArray) {
			if(currentItem == i && !found) {
				found = true;
			} else if(currentItem != i){
				System.out.print(currentItem);
				currentItem = i;
			}
		}
		System.out.print(currentItem);
	}

}
