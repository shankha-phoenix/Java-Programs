package org.practice;

/**
 * Program : StaticBinding.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class StaticBinding {

	public static class superclass
    {
        static void print()
        {
            System.out.println("print in superclass.");
        }
    }
	
    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("print in subclass.");
        }
    }
    
	public static void main(String[] args) {
		superclass A = new superclass();
		superclass B = new subclass();
        A.print();
        B.print();
        
	}

}
