package org.demo.insertionsort;

import java.util.Scanner;

/**
 * Program : Insertion Sort Demo
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class InsertionSortImplementation {

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

        InsertionSort ins = new InsertionSort();
        ins.sort(arr);

        System.out.println("Output Sorted Array : ");
        display(arr);

    }

    public static void display(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
