package com.josh.java.assignment.oops.main;

import java.util.Scanner;

import com.josh.java.assignment.oops.q1.Account;
import com.josh.java.assignment.oops.q2.Person;
import com.josh.java.assignment.oops.q2.Staff;
import com.josh.java.assignment.oops.q2.Student;
public class Driver {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("1. Account");
		System.out.println("2. Person");
		System.out.print("Enter number to execute:");
		int input = scn.nextInt();
		switch (input) {
		case 1:
			Person p = new Staff("Subhra", "West Bengal", "KKI", 543638);
			System.out.println(p);
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
