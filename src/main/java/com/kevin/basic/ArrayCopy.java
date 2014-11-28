package com.kevin.basic;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 24, 56 };
		for (int temp : arr) {
			System.out.print(temp + "\t");
		}

		System.out.println();

		int[] newArr = Arrays.copyOf(arr, arr.length - 1);
		for (int temp : newArr) {
			
			System.out.print(temp + "\t");
		}
		
	}
}
