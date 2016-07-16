package org.practice;

import java.util.Stack;

/**
 * Program : Queue using Stack
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class QueueUsingStack {

	Stack<Integer> q1 = new Stack<Integer>();
	Stack<Integer> q2 = new Stack<Integer>();
	
	public void pop() {
		
		while(q1.size() > 1) {
			q2.add(q1.pop());
		}
		
		System.out.println("Item Poped : " +q1.pop());
		
		while(!q2.isEmpty()) {
			q1.add(q2.pop());
		}
	}
	
	public void push(int value) {
		q1.add(value);
		System.out.println("Item pushed : " +value);
	}
	
	public static void main(String[] args) {
		
		QueueUsingStack qs = new QueueUsingStack();
		qs.push(5);
		qs.push(4);
		qs.push(3);
		qs.push(2);
		qs.push(1);
		
		qs.pop();
		qs.push(6);
		qs.pop();
		qs.pop();
		qs.pop();

	}

}
