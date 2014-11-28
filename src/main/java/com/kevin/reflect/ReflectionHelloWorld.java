package com.kevin.reflect;

/**
 * Get class name from object
 * 
 * @author Kai.Zhao
 * @date Nov. 18th, 2014
 * @since 1.0
 */
public class ReflectionHelloWorld {
	
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.getClass().getName());
	}
}

class Foo {
	public void print() {
		System.out.println("abc");
	}
}
