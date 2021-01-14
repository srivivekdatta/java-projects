package com.learning.packt;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
	public static void sortArrayByLength(String[] strs, String direction) {
		  if (direction.equals("ASC")) {
		    Arrays.sort(strs, Comparator.comparingInt(String::length));
		  } else {
		    Arrays.sort(strs, 
		      Comparator.comparingInt(String::length).reversed());
		  }
		  System.out.println(strs.toString());
		
		}
}
