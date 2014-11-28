package com.kevin.reflect;


/**
 * Create object from Class instance
 * 
 * @author Kai.Zhao
 * @date Sept. 18th, 2014
 * @since 1.0
 */
public class ReflectionHelloWorld2 {

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.zqgame.activity.test.interview.reflect.Foo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Foo f = null;
		try {
			f = (Foo) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		f.print();
	}

}
