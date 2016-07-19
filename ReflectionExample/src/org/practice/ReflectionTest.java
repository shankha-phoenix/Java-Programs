/**
 * 
 */
package org.practice;

/**
 * Program : Class to test reflection
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ReflectionTest {

	private String s;
	
	public ReflectionTest() {
		s = "Sample Reflection";
	}
	
	public void method1()  {
        System.out.println("The string is " + s);
    }
	
	public void method2(int n)  {
        System.out.println("The number is " + n);
    }
	 
	private void method3() {
        System.out.println("Private method invoked");
    }
	
}
