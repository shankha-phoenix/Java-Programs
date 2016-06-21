package org.practice;

/**
 * Program : Double Locked Singleton
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class Singleton {

	private volatile static Singleton _instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(_instance == null) {
			synchronized(Singleton.class) {
				if(_instance == null) {
					_instance = new Singleton();
				}
			}
		}
		
		return _instance;
	}
	
	public void display() {
		
		System.out.println("Hello from Singleton..");
		
	}
}
