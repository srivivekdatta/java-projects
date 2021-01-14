package com.learning.packt;

import java.util.Arrays;

public class Anagrams {

	public static boolean isAnagram(String str1, String str2) {

		char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

		if (chStr1.length != chStr2.length) {
			return false;
		}

		Arrays.sort(chStr1);
		Arrays.sort(chStr2);
		if (Arrays.equals(chStr1, chStr2)) {
			System.out.println("anagrams");
			return true;
		}
		;

		return false;

	}
}
