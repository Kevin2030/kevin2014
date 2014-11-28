package com.kevin.lang;

public class NativeDemo {

	public static void main(String[] args) {
		new NativeDemo().display();
	}
	
	public native void display();
	
	static {
		System.out.println("Hello World");
	}
}
