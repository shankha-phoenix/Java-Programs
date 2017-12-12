package org.demo.heapsort;

import java.util.Scanner;

/**
 * Program : Heap Sort Demo
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class HeapSortImplementation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of numbers to be sorted : ");

        int count = scan.nextInt();
        int[] arr = new int[count];
        int i = 0;

        System.out.println("Input Numbers : ");
        while(count > 0) {
            arr[i] = scan.nextInt();
            i++;
            count --;
        }

        HeapSort hsi = new HeapSort();

        System.out.println("Input Array : ");
        display(arr);
        System.out.println();

        hsi.sort(arr);

        System.out.println("Output Sorted Array : ");
        display(arr);

    }

    public static void display(int arr[]) {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
