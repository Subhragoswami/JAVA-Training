package com.josh.java.java8features;

import java.util.StringJoiner;

public class StringJoin {
	public static void main(String[] args) {
		StringJoiner str1 = new StringJoiner("->");

		str1.add(" Chairman");
		str1.add(" V.P");
		str1.add(" Board ");
		str1.add(" Chief ");

		int len = str1.length();
		System.out.println(str1);
		System.out.println("Length of the string: " + len);
	}
}
