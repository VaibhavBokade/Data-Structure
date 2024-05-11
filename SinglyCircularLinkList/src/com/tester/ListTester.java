package com.tester;

import com.list.CircularLinkList;

public class ListTester {

	public static void main(String[] args) {
		CircularLinkList list = new CircularLinkList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		list.printList();
		list.addInBetween(35, 3);
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteInBetween(3);
		list.printList();
	}

}
