package com.kevin.basic;

/**
 * Test For Switch
 * 
 * @author Kai.Zhao
 * @date Nov. 26th, 2014
 * @since 1.0
 */
public class SwitchDemo {

	private static final int JANUARY = 1;
	private static final int FEBRUARY = 2;
	private static final int MARCH = 3;
	private static final int APRIL = 4;
	private static final int MAY = 5;
	private static final int JUNE = 6;
	private static final int JULY = 7;
	private static final int AUGUST = 8;
	private static final int SEPTEMBER = 9;
	private static final int OCTOBER = 10;
	private static final int NOVEMBER = 11;
	private static final int DECEMBER = 12;

	/*suppose type : byte short int char Enum*/
	public static void main(String[] args) {
		int month = 12;
		switch (month) {
		case JANUARY:
			System.out.println("JANUARY");
			break;
		case FEBRUARY:
			System.out.println("FEBRUARY");
			break;
		case MARCH:
			System.out.println("MARCH");
			break;
		case APRIL:
			System.out.println("APRIL");
			break;
		case MAY:
			System.out.println("MAY");
			break;
		case JUNE:
			System.out.println("JUNE");
			break;
		case JULY:
			System.out.println("JULY");
			break;
		case AUGUST:
			System.out.println("AUGUST");
			break;
		case SEPTEMBER:
			System.out.println("SEPTEMBER");
			break;
		case OCTOBER:
			System.out.println("OCTOBER");
			break;
		case NOVEMBER:
			System.out.println("NOVEMBER");
			break;
		case DECEMBER:
			System.out.println("DECEMBER");
			break;
		default:
			System.out.println("Wrong Month Number");
			break;
		}
	}

}
