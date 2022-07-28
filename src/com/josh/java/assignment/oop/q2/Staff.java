package com.josh.java.assignment.oop.q2;

import lombok.Data;

@Data
public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [ name=" + getName() + ", address=" + getAddress() + ", school=" + school + ", pay=" + pay + " ]";
	}
}
