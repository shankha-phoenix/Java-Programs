package com.amazon.practice.ReverseLinkedList;

import java.util.Scanner;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList llst = new LinkedList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Length of LinkedList : ");
        int length = scan.nextInt();

        System.out.println("Insert elements in LinkedList : ");
        for(int i =0; i<length; i++) {
            llst.insertAtEnd(scan.nextInt());
        }

        System.out.println("Enter position of reversal : ");
        int k = scan.nextInt();

        llst.start = llst.reverseAtPos(llst.start, k);

        System.out.println("Reverse Linked List in groups : ");
        llst.display();

    }
}
