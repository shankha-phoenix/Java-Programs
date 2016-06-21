package org.practice.generic.meth;

/**
 * Program : GenericMethImplementation.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class GenericMethImplementation {

	static <T> void genericDisplay(T element) {
		
		System.out.println(element.getClass().getName() + " : " + element);
	}
	
	public static void main(String[] args) {
		
		genericDisplay(25);
		
		genericDisplay("Generic Method Implementation");

	}

}
