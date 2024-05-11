package com.bracket.pro;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String str="vaibhav and chetan";
		System.out.println("Old String :" +str);
		System.out.println("new String :" +removeDuplicateChar(str));
	}

	private static String removeDuplicateChar(String str) {
		String newStr=" ";
		for(int i=0; i< str.length();i++) {
			char ch= str.charAt(i);
			if(newStr.indexOf(ch)==-1) {
				newStr +=ch;
			}
		}
		
		return newStr;
	}
}
