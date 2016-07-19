/**
 * 
 */
package org.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Program : 
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		
		ReflectionTest test = new ReflectionTest();
		
		Class cls = test.getClass();
		System.out.println("Class name : " +cls.getName());
		
		Constructor cons = cls.getConstructor();
		System.out.println("Constructor name : " +cons.getName());
		
		Method[] meth = cls.getMethods();
		
		for (Method method : meth) {
			System.out.println("Method Name : " +method.getName());
		}
		
		Method methodcall1 = cls.getDeclaredMethod("method2", int.class);

		methodcall1.invoke(test, 19);
		
		Field field = cls.getDeclaredField("s");
		
		field.setAccessible(true);
		
		field.set(test, "JAVA");
		
		Method methodcall2 = cls.getDeclaredMethod("method1");
		
		methodcall2.invoke(test);
	
		Method methodcall3 = cls.getDeclaredMethod("method3");
		
		methodcall3.setAccessible(true);
		
		methodcall3.invoke(test);
	}

}
