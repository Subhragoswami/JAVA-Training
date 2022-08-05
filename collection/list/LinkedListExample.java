package com.josh.java.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// A LinkedList containing Stock Prices of a company for the last 6 days
		LinkedList<Double> stockPrices = new LinkedList<>();

		stockPrices.add((double) 45);
		stockPrices.add((double) 51);
		stockPrices.add(36.25);
		stockPrices.add(68.25);

		// Getting the first element in the LinkedList using getFirst()
		
		Double firstElement = stockPrices.getFirst();
		System.out.println("Initial Stock Price : " + firstElement);

		// Getting the last element in the LinkedList using getLast()
		Double lastElement = stockPrices.getFirst();
		System.out.println("Current Stock Price : " + lastElement);

		// Getting the element at a given position in the LinkedList
		Double stockPriceOn3rdDay = stockPrices.get(2);
		System.out.println("Stock Price on 3rd Day : " + stockPriceOn3rdDay);
	}


}
