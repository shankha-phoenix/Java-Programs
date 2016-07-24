/**
 * 
 */
package org.practice;

/**
 * Program : 
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class TripletonDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			Tripleton triple = Tripleton.getInstance();
			triple.display();
			
		}
	}

}
