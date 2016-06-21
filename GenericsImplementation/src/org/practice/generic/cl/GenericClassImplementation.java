package org.practice.generic.cl;

/**
 * Program : GenericClassImplementation.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class GenericClassImplementation {

	public static void main(String[] args) {
	
		GenericClass<Integer> myObj = new GenericClass<Integer>(25);
		System.out.println(myObj.getObject());
		
		GenericClass<String> myStrngObj = new GenericClass<String>("My Generic Class Implementation..");
		System.out.println(myStrngObj.getObject());

		MultiGenericClass<Integer, String> myMultiObj = new MultiGenericClass<Integer, String>
																	(25, "My multi Generic Implementation.. ");
		myMultiObj.display();
	}

}
