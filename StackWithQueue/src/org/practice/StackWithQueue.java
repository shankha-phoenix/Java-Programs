package org.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program : Stack using Queue
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class StackWithQueue {

	Queue<Integer> s1 = new LinkedList<Integer>();
	Queue<Integer> s2 = new LinkedList<Integer>();
	
	public void pop() {
		
		while(s1.size() > 1) {
			s2.add(s1.poll());
		}
		
		System.out.println("Item poped : " +s1.poll());
		
		while(!s2.isEmpty()) {
			s1.add(s2.poll());
		}
	}
	
	public void push(int value) {
		s1.add(value);
		System.out.println("Item pushed : " +value);
	}
	
	public static void main(String[] args) {
		StackWithQueue sq = new StackWithQueue();
		sq.push(5);
		sq.push(4);
		sq.push(3);
		sq.push(2);
		sq.push(1);
		
		sq.pop();
		sq.push(6);
		sq.pop();
		sq.pop();
		sq.pop();


	}

}
