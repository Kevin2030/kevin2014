package com.kevin.singleton;

import java.io.Serializable;

public enum SingleTonEnum implements Serializable {

	INSTANCE;

	private SingleTonEnum() {
	}

	public void getMessage() {
		System.out.println("Hello " + getClass().getName());
	}

}
