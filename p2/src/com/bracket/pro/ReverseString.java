package com.bracket.pro;

public class ReverseString {
		public static void main (String[] args) {
			String str= "Vickey";
			String rev=" ";
			
			char a[] =str.toCharArray();
			int len = a.length;
			for(int i=len-1; i>=0; i--) {
				rev=rev+a[i];
				
			}
			System.out.println("Reverse array is"+rev);
		}
}
