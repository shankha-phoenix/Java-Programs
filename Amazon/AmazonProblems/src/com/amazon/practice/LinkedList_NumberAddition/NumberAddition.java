package com.amazon.practice.LinkedList_NumberAddition;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class NumberAddition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        LinkedList<Node> list1 = new LinkedList<>();
        LinkedList<Node> list2 = new LinkedList<>();
        if(T>=1 && T<=100) {
            for (int t = 0; t < T; t++) {
                int N1 = scan.nextInt();
                for (int i = 0; i < N1; i++) {
                    list1.add(i,new Node(scan.nextInt()));
                }
                for (int i =0; i<N1; i++) {
                    if(i<N1-1)
                        list1.get(i).next = list1.get(i+1);
                    else
                        list1.get(i).next = null;
                }
                int N2 = scan.nextInt();
                for (int i = 0; i < N2; i++) {
                    list2.add(i, new Node(scan.nextInt()));
                }
                for (int i =0; i<N2; i++) {
                    if(i<N2-1)
                        list2.get(i).next = list2.get(i+1);
                    else
                        list2.get(i).next = null;
                }

                NumberAddition na = new NumberAddition();
                Node nodeSum = na.addTwoLists(list1.getFirst(), list2.getFirst());

            }
        }
    }

    public Node addTwoLists(Node first, Node second) {
        int pos1 = 0;
        BigInteger num1 = new BigInteger("0");
        BigInteger factor = new BigInteger("10");
        while(first != null) {
            num1 = num1.multiply(factor).add(BigInteger.valueOf(first.data));
            first = first.next;
            pos1++;
        }
        System.out.println("num1 : " +num1);
        int pos2 = 0;
        BigInteger num2 = new BigInteger("0");
        while(second!= null) {
            num2 = num2.multiply(factor).add(BigInteger.valueOf(second.data));
            second = second.next;
            pos2++;
        }
        System.out.println("num2 : " +num2);
        BigInteger sum = num1.add(num2);
        System.out.println("Total : " +sum);
        while(!sum.equals(BigInteger.valueOf(0))) {
            System.out.print(sum.remainder(factor));
            sum = sum.divide(factor);
        }

        return null;
    }
}
