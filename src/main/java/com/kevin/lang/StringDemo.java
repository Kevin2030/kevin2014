package com.kevin.lang;

/**
 * String Method and Theory
 *  
 * @author Kai.Zhao
 * @date Nov. 24th, 2014
 * @since 1.0
 */
public class StringDemo {

	public static void main(String[] args) {
		String str = "I am a java developer";
		str.charAt(2);
		str.split(" ");
		str.substring(1);
		str.concat("am");
		str.replace("a", "c");
		str.toLowerCase();
		str.toUpperCase();
		testStringBufferAndStringBuilder();
	}

	public static void testStringBufferAndStringBuilder() {
		int N = 5555555;
		StringBuffer buffer = new StringBuffer();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			buffer.append("");
		}
		System.out.println(System.currentTimeMillis() - begin);

		StringBuilder builder = new StringBuilder();
		begin = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			builder.append("");
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

}
