package com.amazon.practice.KLargestElements;

import java.util.Scanner;

public class KLargestElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        if(T>=1 && T<=100) {

            int[] C = null;
            int[] output = null;
            int N = scan.nextInt();
            int K = scan.nextInt();
            if (N >= 1 && N <= 100 && K <= N) {
                C = new int[N];
                output = new int[K];
                for (int j = 0; j < N; j++) {
                    C[j] = scan.nextInt();
                }
            }

            for (int i = 0; i < K; i++) {
                int max = 0;
                for (int j = 0; j < C.length; j++) {
                    if (max < C[j]) {
                        int count = 0;
                        for (int k = 0; k < output.length; k++) {
                            if (C[j] == output[k])
                                count++;
                        }
                        if (count == 0)
                            max = C[j];
                    }
                }
                output[i] = max;
            }

            for (int i = 0; i < K; i++) {
                System.out.println(output[i]);
            }

        }
    }
}

