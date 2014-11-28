package com.kevin.reflect;

import java.lang.reflect.Constructor;

/**
 * Get constructor and create instance
 * 
 * @author Kai.Zhao
 * @date Sept. 18th, 2014
 * @since 1.0
 */
public class ReflectionHelloWorld3 {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.zqgame.activity.test.interview.reflect.FooBar");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// create instance of "Foobar"
		FooBar f1 = null;
		FooBar f2 = null;

		// get all construstors
		Constructor<?>[] cons = c.getConstructors();

		try {
			f1 = (FooBar) cons[0].newInstance();
			f2 = (FooBar) cons[1].newInstance("abc");
		} catch (Exception e) {
			e.printStackTrace();
		}

		f1.print();
		f2.print();
	}

}

class FooBar {
	String s;

	public FooBar() {

	}

	public FooBar(String s) {
		this.s = s;
	}

	public void print() {
		System.out.println(s);
	}
}
