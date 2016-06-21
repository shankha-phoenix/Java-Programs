package org.practice;

/**
 * Program : Singleton implementation
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class SingletonImplementation {

	public static void main(String[] args) {
		
		Singleton singObj = Singleton.getInstance();
		singObj.display();
			
	}

}
