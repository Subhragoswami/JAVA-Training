package com.josh.java.assignment.oop.q1;

import lombok.Data;

@Data
public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int credit(int amount) {
		balance = balance + amount;// balance credited
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount;// balance debited
		} else {
			System.out.println("Ammount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account name, int amount) {
		if (amount <= balance) {
			name.balance = name.balance + amount;// balance transfered to the person
			balance = balance - amount;
		}
		return balance;
	}

	@Override // overriding method of object class
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
