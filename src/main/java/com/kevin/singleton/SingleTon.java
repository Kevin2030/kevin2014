package com.kevin.singleton;

public class SingleTon {

	private SingleTon() {
	}

	private static SingleTon instance;

	public static SingleTon getInstance() {
		if (instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}

	public void getMessage() {
		System.out.println("Hello " + getClass().getName());
	}

}
