package com.Tester;

import com.list.Node;
import com.list.SinglyList;

public class Tester {

	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		
		list.addFirst("11");
		list.addFirst("100");
		list.addFirst("100");
		list.addFirst("100");
//		//list.printList();
		list.addFirst("33");
		list.addFirst("44");
//		list.addFirst("44");
//		list.addFirst("55");
//		list.addFirst("66");
//		list.addLast("100");
//		list.addLast("100");
//		list.addLast("100");
//		list.addLast("44");
//		list.addLast("44");
//		list.addLast("200");
		list.printList();
//		list.deleteFirst();
		//list.printList();
		
//		list.deleteLast();
//		list.printList();
		//list.deleteBetween(3);
		//list.printList();
		//list.reverseList();
		
	 //list.reverseList();
		//System.out.println("AFTER REVERSE");
		//list.printList();
	//list.reverseList());
		list.removeduplicate();
		list.printList();
	}

}
