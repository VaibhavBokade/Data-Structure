package com.bracket.pro;

import java.util.Scanner;

public class wordCount {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		int count=countNowords(s);
		System.out.println("count"+count);
	}

	private static Integer countNowords(String s) {
		int count=0;
		if(s.charAt(0) != ' ') {
			count++;
		}
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) ==' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count;
	}
}
