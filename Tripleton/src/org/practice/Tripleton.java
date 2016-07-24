/**
 * 
 */
package org.practice;

/**
 * Program : 
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
class Tripleton {
	
	private static volatile Tripleton _instance;
	
	private static volatile int _count = 0;
	
	private Tripleton() {
		
	}
	
	public static Tripleton getInstance() {
		
		if(_count < 3) {
			synchronized(Tripleton.class) {
				if(_count < 3) {
					_instance = new Tripleton();
					_count ++;
				}
			}
		}
		
		return _instance;
	}
	
	public void display() {
		System.out.println("From Tripleton " + _instance);
	}

}
