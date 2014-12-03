package com.kevin.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon singleTon = SingleTon.getInstance();
		singleTon.getMessage();

		SingleTonEnum singleTonEnum = SingleTonEnum.INSTANCE;
		singleTonEnum.getMessage();

		SingleTonLa singleTonLa = SingleTonLa.getInstance();
		singleTonLa.getMessage();

	}

}
