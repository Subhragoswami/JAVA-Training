package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a");
		int a = scn.nextInt();

		System.out.println("enter b");
		int b = scn.nextInt();

		System.out.println("enter n");
		int n = scn.nextInt();

		int sum = 0;
		for (int i = 0; i <= n - 1; i++) {
			sum = a;
			for (int j = 0; j <= i; j++) {
				sum = sum + ((int) Math.pow(2, j) * b);
			}
			System.out.println(sum + " ");
		}
	}
}
