/**
 * 
 */
package org.practice;

/**
 * Program : String Passed As Reference
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class StringAsReference {

	public static void main(String[] args) {
		String x = new String("ab");
		change(x);
		System.out.println(x);
	}
	
	public static String change(String x) {
		x = "cd";
		return x;
	}
}
