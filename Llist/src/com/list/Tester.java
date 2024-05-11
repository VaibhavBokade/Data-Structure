package com.list;

public class Tester {

	public static void main(String[] args) {
		LList list = new LList();
//		list.addFirst(10);
//		list.addFirst(90);
//		list.addFirst(30);
//		list.addFirst(120);
//		list.addFirst(50);
//		list.addFirst(60);
//		list.addLast(100);
//		list.print();
		//list.deleteFirst();
		list.addSorted(10);
		list.addSorted(90);
		list.addSorted(30);
		list.addSorted(120);
		list.addSorted(50);
		list.addSorted(60);
		list.addSorted(100);
		list.addSorted(100);
		list.addSorted(100);
		list.removeduplicate();
		list.print();
		list.deleteBetween(60);
		list.print();
		
		System.out.println(list.palindrome(list.head));
		list.reverse();
		list.print();
		

	}

}
