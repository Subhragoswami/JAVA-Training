package com.josh.java.assignment.oop.main;

import java.util.Scanner;
import com.josh.java.assignment.oop.q1.*;
import com.josh.java.assignment.oop.q2.*;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Account");
		System.out.println("2. Person");
		System.out.print("Enter number to execute:");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			Person person = new Staff("Subhra", "West Bengal", "KKI", 543638);
			System.out.println(person);
			break;
		case 2:
			Account ac = new Account("647", "Subhra", 5000);
			Account a = new Account("648", "Sharda");
			ac.credit(3000);
			System.out.println(ac.toString());
			ac.transferTo(a, 5000);
			System.out.println(a.toString());
			System.out.println(ac.toString());
		}
	}
}
