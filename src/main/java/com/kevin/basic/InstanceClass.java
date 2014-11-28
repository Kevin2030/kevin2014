package com.kevin.basic;

public class InstanceClass {

	public static void main(String[] args) throws Exception {
		/*Way One*/
		A a = new A();
		a.say();

		/*Way Two*/
		A a1 = (A) Class.forName("com.kevin.basic.A").newInstance();
		a1.say();

	}

}

class A {
	public void say() {
		System.out.println("Hi");
	}
}