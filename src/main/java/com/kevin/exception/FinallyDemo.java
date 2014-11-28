package com.kevin.exception;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println(getAge(true));
		System.out.println(getAge(false));
	}

	@SuppressWarnings("finally")
	public static int getAge(boolean add) {
		try {
			if (add)
				throw new Exception("add Exception");
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 3;
		} finally {
			return 2;
		}
	}

}
