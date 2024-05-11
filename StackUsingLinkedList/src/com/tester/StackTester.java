package com.tester;

import com.stack.LinkedList;

public class StackTester {

	public static void main(String[] args) {
		try {
		LinkedList list = new LinkedList(5);
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.display();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.display();
		list.push(44);
		list.display();
		//System.out.println(list.peek());
		
		}catch(Exception e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
