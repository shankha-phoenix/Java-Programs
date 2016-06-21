/**
 * 
 */
package org.practice.generic.cl;

/**
 * Program : MultiGenericClass.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class MultiGenericClass<T, U> {
	
	T obj1;
	U obj2;
	
	public MultiGenericClass(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void display() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}
