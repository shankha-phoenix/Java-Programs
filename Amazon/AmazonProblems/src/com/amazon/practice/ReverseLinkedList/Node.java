package com.amazon.practice.ReverseLinkedList;

public class Node {

    protected int data;
    protected Node next;

    public Node(){
        data = 0;
        next = null;
    }

    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
