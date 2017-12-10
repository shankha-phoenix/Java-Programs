package org.demo.quicksort;

/**
 * Program : Quick Sort
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class QuickSort {

    public void sort(int[] arr, int low, int high) {

        if(low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi -1);
            sort(arr, pi +1, high);
        }

    }

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<= high-1; j++){
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        return i+1;
    }

    public void swap(int[] arr, int pos1, int pos2) {
        int num1 = arr[pos1];
        int num2 = arr[pos2];
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        arr[pos1] = num1;
        arr[pos2] = num2;
    }
}
