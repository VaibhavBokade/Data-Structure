package com.ListTester;

import com.list.DoublyCircularList;

public class ListTester {

	public static void main(String[] args) {
		DoublyCircularList list = new DoublyCircularList();
		list.addFirst(10);
		list.addFirst(40);
		list.addFirst(90);
		list.addFirst(50);
		list.addFirst(20);
		list.printList();
		list.reverse();
		list.addLast(45);
		list.printList();
		//list.reverse();
		//list.delete(5);
		list.printList();
		//list.reverse();
		list.addBetween(44, 3);
		list.printList();
		list.reverse();
		
		
	}

}
