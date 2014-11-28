package com.kevin.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 1.5+ autoboxing and unboxing<br>
 * Autoboxing is the automatic conversion that the Java compiler makes
 * between the primitive types and their corresponding object wrapper classes.
 * For example, converting an int to an Integer, a double to a Double, and so on.
 * If the conversion goes the other way, this is called unboxing.
 * 
 * @author Kai.Zhao
 * @date Nov. 26th, 2014
 * @since 1.0
 */
public class BoxingDemo {

	public static void main(String[] args) {

		// Here is the simplest example of autoboxing:
		Character c = 'c';

		System.out.println(c);

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i < 50; i += 2)
			li.add(i);

		
		
	}
}
