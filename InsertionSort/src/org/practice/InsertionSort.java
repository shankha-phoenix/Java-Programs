/**
 * 
 */
package org.practice;

/**
 * Program : 
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {12, 11, 13, 5, 6};
		 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
        
        System.out.println("Sorted Array : ");
        for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	void sort(int[] arr) {
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		
	}

}
