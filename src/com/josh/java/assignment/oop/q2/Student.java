package com.josh.java.assignment.oop.q2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student extends Person {
	private String program;
	private int year;
	private double fee;

}
