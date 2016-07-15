package org.practice;

/**
 * Program : Override example
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class TestOverride {

	public static void main(String[] args) {
		BaseClass a = new BaseClass();
		BaseClass b = new Subclass();
		
		a.display();
		b.display();
	}

}
