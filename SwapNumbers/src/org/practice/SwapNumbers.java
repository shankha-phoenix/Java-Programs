package org.practice;

/**
 * Program : Swap Numbers without using third variable
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10,
			b = 5;
		System.out.println("Before swap :" + " a : " + a + " & b : " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap :" + " a : " + a + " & b : " + b);

	}

}
