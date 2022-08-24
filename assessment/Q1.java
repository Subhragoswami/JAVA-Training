package com.josh.java.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q1 {
	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 4, 8, 10, 19, 20);
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		int length = 0;
		Integer sum = 0;
		for (int i = 0; i < num.size(); i++) {
			// getting total length of arrlist
			length++;
			// getting sum of arrlist
			sum = sum + num.get(i);
			if (num.get(i) % 2 == 1) {
				oddList.add(num.get(i));
			}
			if (num.get(i) % 2 == 0) {
				evenList.add(num.get(i));
			}
		}
		System.out.println("Odd List " + oddList);
		System.out.println("Even List " + evenList);
		System.out.println("Sum of values " + sum);
		System.out.println("length of List " + length);
	}
}
