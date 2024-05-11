package com.bracket.pro;

import java.util.Stack;

public class bracket_pro {
	public static void main(String args[]) {
		String str= "{()}{";
		Stack <Character>st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(st.isEmpty()) {
				st.push(ch);
			}
			else if(ch =='{' || ch =='(' || ch =='[') {
				st.push(ch);
			}
			else if(ch == '}' && st.peek()=='{') {
				st.pop();
			}
			else if(ch == ']' && st.peek() =='[') {
				st.pop();
			}
			else if(ch== ')' && st.peek() == '(') {
				st.pop();
			}
			
		}
			if(st.empty()) {
				System.out.println("well formed");
			}
			else {
				System.out.println("not well formed");
			}
		
		
	}
}
