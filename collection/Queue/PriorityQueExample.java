package com.josh.java.collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueExample {
	public static void main(String[] args) {
		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

		// Add items to a Priority Queue (ENQUEUE)
		namePriorityQueue.add("RAhul");
		namePriorityQueue.add("Riya");
		namePriorityQueue.add("NAbo");
		namePriorityQueue.add("Anisha");

		// Remove items from the Priority Queue (DEQUEUE)
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}
	}
}
