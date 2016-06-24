/**
 * 
 */
package org.practice;

/**
 * Program : AbsFactoryPatternImpl.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class AbsFactoryPatternImpl {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		
		Shape shape1 = shapeFactory.getShape("Square");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Circle");
		shape2.draw();
		
	}

}
