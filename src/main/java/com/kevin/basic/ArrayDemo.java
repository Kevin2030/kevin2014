package com.kevin.basic;

/**
 * Just For Array Test
 * 
 * @author Kai.Zhao
 * @date Nov. 26th, 2014
 * @since 1.0
 */
public class ArrayDemo {

	/**
	 * All arrays extends Object. So arrays belong to reference type  
	 * 
	 * @param args
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static void main(String[] args) {
		int[] a = {12,32,4};
		String[] b = {"12","32","4"};
		System.out.println(a.toString());
		System.out.println(b.toString());
		Object o = "12";
		System.out.println(o.toString());
	}
	
}

