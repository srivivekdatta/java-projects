package com.learning.packt;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaptest {

	public static void hasmaptest() {
		Map<Character, Integer> newmap = new HashMap<>();
		
		String s = "aaaaabbbbbbbbbcccc";
		char[] ch = s.toCharArray();
		int count =0;
		
		for (char c: ch) {
			if(newmap.containsKey(c)) {
				newmap.put(c, ++count);
				System.out.println( "if " +newmap.toString());
			} else {
				count =0;
				newmap.put(c, ++count);
				System.out.println( "else " +newmap.toString());
			}
			
			
		}
		System.out.println( "count " +newmap.entrySet());
		
		int maxvalue = Collections.max(newmap.values()); // returns max value of integer from map
		for (Entry<Character, Integer> entry :newmap.entrySet()) {
			if(entry.getValue() == maxvalue)
				System.out.println(entry.getKey());
		}
		
		
		
	}
	
}
