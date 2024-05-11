package com.bracket.pro;

public class VowalConsoantCount {
	public static void main(String [] args) {
		String str= "Vaibhav";
		countVowels(str);
	}

	private static void countVowels(String str) {
		int consonantCount = 0;
		int vowelCount = 0;
		
		for(int i=0; i< str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				++vowelCount;
			}
			else {
				++consonantCount;
			}
		}
		System.out.println("Vowel count : " + vowelCount);
		System.out.println("Consonant count : " +consonantCount);
		
		
	}

	private static boolean isVowel(char ch) {
			ch=Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch== 'I' || ch=='O' || ch=='U');
	}
}
