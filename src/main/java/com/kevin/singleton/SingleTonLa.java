package com.kevin.singleton;

public class SingleTonLa {

	private static SingleTonLa instance = new SingleTonLa();

	private SingleTonLa() {
	}

	public static SingleTonLa getInstance() {
		return instance;
	}

	public void getMessage() {
		System.out.println("Hello " + getClass().getName());
	}
}
