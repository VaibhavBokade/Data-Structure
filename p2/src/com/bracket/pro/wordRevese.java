package com.bracket.pro;

public class wordRevese {
	public static void main(String [] args) {
		String str= "Welcome to java world";
		String[] splitArr= str.split(" ");
		for(int i= splitArr.length-1; i>=0; i--) {
			System.out.println(splitArr[i]);
		}
		
	}
}
