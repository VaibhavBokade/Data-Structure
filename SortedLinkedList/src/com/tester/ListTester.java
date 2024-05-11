package com.tester;

import com.list.LinkedList;

public class ListTester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
//		list.insert(10);
//		list.insert(15);
//		list.insert(20);
//		list.insert(8);
//		list.insert(5);
//		list.insert(0);
//		list.insert(40);
		list.addFirst(40);
		list.addFirst(10);
		list.addFirst(15);
		list.addFirst(20);
		list.addFirst(8);
		list.addFirst(5);
		list.addFirst(0);
		//list.addFirst(40);
		list.printList();
		System.out.println("");
		list.sortList();
		list.printList();

	}

}
