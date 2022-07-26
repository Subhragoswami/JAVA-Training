package com.josh.java.oopsassigment;

class Person {
	String name;
	String address;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override // overriding method of object class
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}

class Student extends Person {
	String program;
	int year;
	double fee;

	Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "program=" + program + ", year=" + year + ", fee="
				+ fee + "]";
	}
}

class Staff extends Person {
	String school;
	double pay;

	Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [ name=" + name + ", address=" + address + ", school=" + school + ", pay=" + pay + " ]";
	}
}
