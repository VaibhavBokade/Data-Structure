package com.bracket.pro;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String [] args) {
		String str= "abcdab";
		System.out.println(longest(str));
	}

	private static String longest(String str) {
		HashSet<Character> set = new HashSet<>();
		String longestOverall = " ";
		String longestTillNow =" ";
		
		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(set.contains(c)) {
				
				longestTillNow=" ";
				set.clear();
			}
			set.add(c);
			longestTillNow += c;
			
			if(longestTillNow.length() > longestOverall.length()) {
				longestOverall = longestTillNow;
			}
		}
		return longestOverall;
	}
}
