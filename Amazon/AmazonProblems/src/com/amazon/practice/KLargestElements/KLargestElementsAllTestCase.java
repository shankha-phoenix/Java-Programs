package com.amazon.practice.KLargestElements;

import java.util.Scanner;

public class KLargestElementsAllTestCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        if(T>=1 && T<=100) {
            int[][] C = new int[T][];
            int[][] output = new int[T][];
            int[] N = new int[T];
            int[] K = new int[T];
            for (int testcase=0; testcase<T; testcase++) {
                N[testcase] = scan.nextInt();
                K[testcase] = scan.nextInt();
                if (N[testcase] >= 1 && N[testcase] <= 100 && K[testcase] <= N[testcase]) {
                    C[testcase] = new int[N[testcase]];
                    output[testcase] = new int[K[testcase]];
                    for (int j = 0; j < N[testcase]; j++) {
                        C[testcase][j] = scan.nextInt();
                    }
                }
            }

            for(int testcase = 0; testcase<T; testcase++) {
                int[] pos = new int[K[testcase]];
                for (int i = 0; i < K[testcase]; i++) {
                    int max = 0;
                    int temp = 0;
                    for (int j = 0; j < C[testcase].length; j++) {
                        if (max <= C[testcase][j]) {
                            int count = 0;
                            for (int k = 0; k < output[testcase].length; k++) {
                                if (C[testcase][j] == output[testcase][k] && pos[k] == j)
                                    count++;
                            }
                            if (count == 0) {
                                max = C[testcase][j];
                                temp = j;
                            }
                        }
                    }
                    output[testcase][i] = max;
                    pos[i] = temp;
                }
            }

            for(int testcase=0; testcase<T; testcase++){
                for (int i = 0; i < K[testcase]; i++) {
                    System.out.print(output[testcase][i] + " ");
                }
                System.out.println();
            }
        }

    }
}
