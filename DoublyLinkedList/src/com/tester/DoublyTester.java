package com.tester;

import com.list.DoublyLinkedList;

public class DoublyTester {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addFirst(90);
		list.addFirst(120);
		list.addFirst(60);
		list.addFirst(20);
		list.addFirst(1300);
		list.printList();
		list.revprintList();
		list.addLast(100);
		list.addLast(10);
		//list.addLast("300");
		list.printList();
		list.revprintList();
		list.deleteFirst();
		list.printList();
		list.revprintList();
		list.deleteLast();
		list.printList();
//		list.deleteLast();
//		list.deleteLast();
//		list.deleteLast();
//		list.printList();
	}

}
