package org.practice.generic.cl;

/**
 * Program : GenericClass.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class GenericClass<T> {
	
	T obj;
	
	GenericClass(T obj) {
		this.obj = obj;
	}
	
	public T getObject(){
		return this.obj;
	}

}
