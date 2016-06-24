/**
 * 
 */
package org.practice;

/**
 * Program : ShapeFactory.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType == null)
			return null;
		else if(shapeType.equalsIgnoreCase("Square"))
			return new SquareImpl();
		else if(shapeType.equalsIgnoreCase("Circle"))
			return new CircleImpl();
		
		return null;
	}

}
