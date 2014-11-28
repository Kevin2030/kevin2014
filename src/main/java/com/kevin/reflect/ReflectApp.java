package com.kevin.reflect;

import java.lang.reflect.Method;

public class ReflectApp {

	public static void main(String[] args) {
		//no paramater
		Class<?> noparams[] = {};

		//String parameter
		Class<?>[] paramString = new Class[1];
		paramString[0] = String.class;

		//int parameter
		Class<?>[] paramInt = new Class[1];
		paramInt[0] = Integer.TYPE;

		Method method;

		try {
			//load the AppTest at runtime
			Class<?> cls = Class.forName("com.kevin.reflect.App");
			App app = (App) cls.newInstance();

			//call the printIt method
			method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(app);

			//call the printItString method, pass a String param 
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(app, new String("mkyong"));

			//call the printItInt method, pass a int param
			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(app, 123);

			//call the setCounter method, pass a int param
			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(app, 999);

			//call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(app);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class App {
	private int counter;

	public void printIt() {
		System.out.println("printIt() no param");
	}

	public void printItString(String temp) {
		System.out.println("printIt() with param String : " + temp);
	}

	public void printItInt(int temp) {
		System.out.println("printIt() with param int : " + temp);
	}

	public void setCounter(int counter) {
		this.counter = counter;
		System.out.println("setCounter() set counter to : " + counter);
	}

	public void printCounter() {
		System.out.println("printCounter() : " + this.counter);
	}
}
