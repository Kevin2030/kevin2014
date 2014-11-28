package com.kevin.algorithm;

import java.math.BigDecimal;

public class Operators {

	public static void main(String[] args) {
		BigDecimal one = new BigDecimal(2.3564d);
		BigDecimal two = new BigDecimal(98.256d);
		System.out.println(one.divide(two, BigDecimal.ROUND_CEILING));
	}

}
