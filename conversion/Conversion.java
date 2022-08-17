package com.josh.java.conversion;

import java.util.Scanner;
/**
 * Class to Implement different types of conversions by using respective methods   .
 */
public class Conversion {
	public void intTostring(int value) {
		/*
		 * Using .valueOf() to convert the given value to String.
		 */
		String str = String.valueOf(value);
		System.out.println("The converted value is :  " + str);
	}

	public void intTodouble(int value) {
		double num = value;
		System.out.println("The converted value is : " + num);
	}

	public void intTolong(int value) {
		long num = value;
		System.out.println("The converted value is : " + num);
	}

	public void longTostring(long value) {
		String str = String.valueOf(value);
		System.out.println("The converted value is : " + str);
	}

	/*
	 * Type-casting.
	 */
	public void longToint(long value) {
		int num = (int) value;
		System.out.println("The converted value is : " + num);
	}

	public void charToint(char value) {
		int num = value;
		System.out.println("The converted value is : " + num);
	}

	public void charTostring(char value) {
		String str = Character.toString(value);
		System.out.println("The converted value is : " + str);
	}

	public void doubleToint(double value) {
		int num = (int) value;
		System.out.println("The converted value is : " + num);
	}

	public void floatTostring(float value) {
		String str = String.valueOf(value);
		System.out.println("The converted value is : " + str);
	}

	public void booleanTostring(boolean value) {
		String str = String.valueOf(value);
		System.out.println("The converted value is : " + str);
	}

	/*
	 * Using .parse to get the required primitive data type.
	 */
	public void stringtolong(String value) {
		long num = Long.parseLong(value);
		System.out.println("The converted value is : " + num);
	}

	public void stringtodouble(String value) {
		double num = Double.parseDouble(value);
		System.out.println("The converted value is : " + num);
	}

	public void stringtoboolean(String value) {
		boolean bvar = Boolean.parseBoolean(value);
		System.out.println("The converted value is : " + bvar);
	}

	public void intTochar(int value) {
		char charvar = (char) value;
		System.out.println("The converted value is : " + charvar);
	}

	public static void main(String[] args) {
		System.out.println("Select 1 for Integer --> String conversion!! ");
		System.out.println("Select 2 for Integer --> Double conversion!! ");
		System.out.println("Select 3 for Integer --> Long conversion!! ");
		System.out.println("Select 4 for Long --> String conversion!! ");
		System.out.println("Select 5 for Long --> Integer conversion!! ");
		System.out.println("Select 6 for Character --> Integer conversion!! ");
		System.out.println("Select 7 for Character --> String conversion!! ");
		System.out.println("Select 8 for Double --> Integer conversion!! ");
		System.out.println("Select 9 for Float --> String conversion!! ");
		System.out.println("Select 10 for Boolean --> String conversion!! ");
		System.out.println("Select 11 for String --> Long conversion!! ");
		System.out.println("Select 12 for String --> Double conversion!! ");
		System.out.println("Select 13 for String --> Boolean conversion!! ");
		System.out.println("Select 14 for Integer --> Character conversion!! ");

		System.out.println(" \n Select the Type of Conversion required: ");
		Scanner scanner = new Scanner(System.in);
		Conversion conversion = new Conversion();
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Value to be converted: ");
			int num1 = scanner.nextInt();
			conversion.intTostring(num1);
			break;
		case 2:
			System.out.println("Enter the Value to be converted: ");
			int num2 = scanner.nextInt();
			conversion.intTodouble(num2);
			break;
		case 3:
			System.out.println("Enter the Value to be converted: ");
			int num3 = scanner.nextInt();
			conversion.intTolong(num3);
			break;
		case 4:
			System.out.println("Enter the Value to be converted: ");
			int num4 = scanner.nextInt();
			conversion.longTostring(num4);
			break;
		case 5:
			System.out.println("Enter the Value to be converted: ");
			int num5 = scanner.nextInt();
			conversion.longToint(num5);
			break;
		case 6:
			System.out.println("Enter the Value to be converted: ");
			char chr1 = scanner.next().charAt(0);
			conversion.charToint(chr1);
			break;
		case 7:
			System.out.println("Enter the Value to be converted: ");
			char chr2 = scanner.next().charAt(0);
			conversion.charTostring(chr2);
			break;
		case 8:
			System.out.println("Enter the Value to be converted: ");
			double num8 = scanner.next().charAt(0);
			conversion.doubleToint(num8);
			break;
		case 9:
			System.out.println("Enter the Value to be converted: ");
			float num9 = scanner.next().charAt(0);
			conversion.floatTostring(num9);
			break;
		case 10:
			System.out.println("Enter the Value to be converted: ");
			boolean bvar1 = scanner.nextBoolean();
			conversion.booleanTostring(bvar1);
			break;
		case 11:
			System.out.println("Enter the Value to be converted: ");
			String str1 = scanner.next();
			conversion.stringtolong(str1);
			break;
		case 12:
			System.out.println("Enter the Value to be converted: ");
			String str2 = scanner.next();
			conversion.stringtodouble(str2);
			break;
		case 13:
			System.out.println("Enter the Value to be converted: ");
			String str3 = scanner.next();
			conversion.stringtoboolean(str3);
			break;
		case 14:
			System.out.println("Enter the Value to be converted: ");
			int num14 = scanner.nextInt();
			conversion.intTochar(num14);
			break;
		}
		scanner.close();
	}

}
