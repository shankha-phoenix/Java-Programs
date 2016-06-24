/**
 * 
 */
package org.practice;

/**
 * Program : ProxyFactoryImpl.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ProxyFactoryImpl {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("abc.jpg");
		
		//RealImage loaded and displayed
		image.display();
		
		System.out.println("Display again..");
		
		//Image displayed from proxyImage
		image.display();

	}

}
