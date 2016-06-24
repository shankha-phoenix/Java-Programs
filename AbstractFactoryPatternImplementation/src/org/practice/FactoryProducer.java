/**
 * 
 */
package org.practice;

/**
 * Program : FactoryProducer.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		
		return null;
		
	}

}
