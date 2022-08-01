package com.josh.java.exceptionhandling;

import java.util.Scanner;


package com.josh.java.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int firstnum = scanner.nextInt();
		int secondnum = scanner.nextInt();
		int temp = 0;
		int[] arr = new int[4];

		try {
			temp = firstnum / secondnum;
			arr[7] = temp;
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Index is more than size.");
		} finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("enter age to enter");
		int age = scanner.nextInt();

		if (age < 18) {
			AgeNotAlllowedException a = new AgeNotAlllowedException("you are not allowed to enter");
			throw a;
		} else {
			System.out.println("you are allowed to enter");
		}
		scanner.close();
	}
}
