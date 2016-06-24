/**
 * 
 */
package org.practice;

/**
 * Program : ShapeFactory.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		
		if(shapeType == null)
			return null;
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new SquareImpl();
		else if(shapeType.equalsIgnoreCase("CIRCLE")) 
			return new CircleImpl();
	
		
		return null;
		
	}

}
