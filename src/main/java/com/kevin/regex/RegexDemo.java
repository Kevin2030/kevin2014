package com.kevin.regex;

import java.util.regex.Pattern;

public class RegexDemo {

	
	/**
	 * 匹配2个正整数
	 * 
	 * @param args
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static void main(String[] args) {
		String input = "08";
		String regex = "^[1-9]\\d{0,1}$";
		System.out.println(Pattern.matches(regex, input));
	}
}
