package com.kevin.algorithm;

import java.util.Scanner;

public class Mn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0, n = 0, c = 0;
		System.out.println("请输入m:");
		while (scanner.hasNext()) {
			try {
				if (c == 0) {
					m = Integer.parseInt(scanner.next());
				}
				if (c == 1) {
					n = Integer.parseInt(scanner.next());
				}
			} catch (Exception e) {
				System.out.println("请输入数字");
				continue;
			}
			c++;
			if (c == 1) {
				System.out.println("请输入n:");
			}
			if (c == 2) {
				break;
			}

		}
		System.out.println("m=" + m + " n=" + n + " result=" + Math.pow(m, n));
	}

}
