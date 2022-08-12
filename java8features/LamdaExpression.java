package com.josh.java.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Using Lambda function to iterate through the list.
 */
public class LamdaExpression {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Sharda");
		list.add("Girish");
		list.add("Bharat");
		list.add("Subhra");
		list.forEach((names) -> System.out.println(names));
	}
}
