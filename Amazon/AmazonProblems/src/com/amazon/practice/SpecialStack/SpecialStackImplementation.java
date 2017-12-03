package com.amazon.practice.SpecialStack;

import java.util.Scanner;

public class SpecialStackImplementation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        if(T>=1 && T<=100) {
            int N[] = new int[T];
            //long[][] elements = new long[T][];
            for (int i = 0; i < T; i++) {
                N[i] = scan.nextInt();
                SpecialStack ss = new SpecialStack(N[i]);
                for (int j = 0; j < N[i]; j++) {
                    ss.push(scan.nextInt());
                }
                System.out.println("Minimum element : " + ss.getMin());
            }
        }
    }
}
