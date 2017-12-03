package com.amazon.practice.SpecialStack;

public class SpecialStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    private long min;

    public SpecialStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int data) {
        if(!isFull())
            stackArray[++top] = data;
    }

    public long pop(){
        if(!isEmpty())
            return stackArray[top--];
        else
            return -1;
    }

    public long getMin() {
        if(!isEmpty()) {
            min = pop();
        }
        while(!isEmpty()){
            long temp = pop();
            if(min>temp)
                min = temp;
        }
        return min;
    }
}
