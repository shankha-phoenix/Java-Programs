/**
 * 
 */
package org.practice;

/**
 * Program : FactoryPatternImpl.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class FactoryPatternImpl {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("CIRCLE");
		shape2.draw();
		
	}

}
