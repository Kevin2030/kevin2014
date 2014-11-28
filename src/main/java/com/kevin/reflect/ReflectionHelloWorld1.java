package com.kevin.reflect;

import java.lang.reflect.Method;

/**
 * Invoke method on unknown object
 * 
 * @author Kai.Zhao
 * @date Sept. 18th, 2014
 * @since 1.0
 */
public class ReflectionHelloWorld1 {

	public static void main(String[] args) {
		Foo foo = new Foo();
		Method method;
		try {
			method = foo.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(foo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
