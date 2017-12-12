package org.demo.heapsort;

/**
 * Program : Heap Sort
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class HeapSort {

    public void sort(int[] arr) {

        int length = arr.length;

        for(int i=length/2 - 1; i>=0; i--) {
            heapify(arr, length, i);
        }

        for(int i= length-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void heapify(int[] arr, int length, int i){

        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < length && arr[left] > arr[largest])
            largest = left;

        if(right < length && arr[right] > arr[largest])
            largest = right;

        if(largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, length, largest);
        }
    }
}
