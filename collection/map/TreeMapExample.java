package com.josh.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	 public static void main(String[] args) {
	        // TreeMap with keys sorted by ignoring case
	       TreeMap<String, String> fileExtensions = new TreeMap<>(); 

	        fileExtensions.put("PYTHON", ".py");
	        fileExtensions.put("c++", ".cpp");
	        fileExtensions.put("KOTLIN", ".kt");
	        fileExtensions.put("Golang", ".go");
	        // The keys will be sorted 
	        System.out.println(fileExtensions);
	        //---Iterate by using advanced for loop---

	        
			for (Map.Entry<String, String> entry : fileExtensions.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();

				System.out.println(key + ": " + value);
			}

	     
	    }

}
