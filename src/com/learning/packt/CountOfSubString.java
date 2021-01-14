package com.learning.packt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfSubString {

		public static int countStringInString(String string, String toFind) {

			  int position = 0;
			  int count = 0;
			  int n = toFind.length();
			  System.out.println(n);

			  while ((position = string.indexOf(toFind, position)) != -1) {
			    position = position + n;
			    System.out.println(position);
			    System.out.println(count);
			    count++;
			    System.out.println(count);
			  }

			  return count;
			}
}
