package com.amazon.practice.ReverseLinkedList;

public class LinkedList {

    protected Node start;
    protected Node end;
    public int size;

    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null);
        size ++;

        if(start == null){
            start = nptr;
            end = start;
        } else {
            end.setNext(nptr);
            end = nptr;
        }

    }

    public Node reverseAtPos(Node node, int k) {

        if(start == null) {
            System.out.println("invalid list");
            return null;

        } else {
            Node previous = null;
            Node current = node;
            Node next = null;

            int count = 0;
            while(current != null && count < k) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                count ++;
            }

            if(next != null)
                start.next = reverseAtPos(next,k);

            return previous;

        }
    }

    public void display() {
        Node temp = start;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
