package com.josh.java.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
        LinkedHashMap<String, String> husbandWifeMapping = new LinkedHashMap<>();

        husbandWifeMapping.put("Rajeev", "Nisha");
        husbandWifeMapping.put("Krishna", "Riya");
        husbandWifeMapping.put("Sahil", "Preeti");
        husbandWifeMapping.put("Bharat", "Girish");

        System.out.println("husbandWifeMapping : " + husbandWifeMapping);

        // Remove a key from the LinkedHashMap
        String wife = husbandWifeMapping.remove("JKrishna");
        System.out.println("Removed Krishna and his wife " + wife + " from the mapping. New husbandWifeMapping : " + husbandWifeMapping);

        // Remove a key from the LinkedHashMap only if it is mapped to the given value
        boolean isRemoved = husbandWifeMapping.remove("Krishna", "Riya");
        System.out.println("Did John get removed from the mapping? : " + isRemoved);
    }

}
