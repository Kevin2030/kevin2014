package com.kevin.algorithm;

public class Odd {

	public static void main(String[] args) {
		int sum = 0;
		boolean isOdd = false;
		t1: for (int i = 0; i < 100; i++) {
			if (i == 2) {
				sum += i;
				System.out.print(i + "\t");
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue t1;
				} else {
					isOdd = true;
				}
			}
			if (isOdd) {
				System.out.print(i + "\t");
				sum += i;
				isOdd = false;
			}
		}
		System.out.println();
		System.out.println("Odd sum : " + sum);
		getOdd();
	}

	public static void getOdd() {
		int sum = 0;
		for (int i = 1; i < 100; i = i + 2) {
			System.out.print(i + "\t");
			sum += i;
		}
		System.out.println();
		System.out.println(sum);
	}

}
