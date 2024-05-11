package com.list;

import java.util.Stack;

public class LList implements ListInterface{
	Node head;
	int count;

	public LList() {
		super();
	}

	public LList(Node head, int count) {
		super();
		this.head = head;
		this.count = count;
	}

	@Override
	public void addFirst(int ele) {
		Node newnode = new Node(ele);
		if(head == null) {
			head = newnode;
			return;
		}

		newnode.next = head;
		head = newnode;
		count++;

	}

	@Override
	public void addLast(int ele) {
		Node newnode = new Node(ele);
		if(head == null) {
			head = newnode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newnode;
		count++;
	}

	@Override
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
		count--;
	}

	@Override
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		count--;

	}

	@Override
	public void addSorted(int ele) {
		Node newnode = new Node(ele);
		if(head == null) {
			head = newnode;
			return;
		}
		Node curr = head;
		Node pre = null;
		while(curr != null) {
			if(curr.data > ele) {
				break;
			}
			pre = curr;
			curr = curr.next;
		}
		if(curr == head) {
			newnode.next = head;
			head = newnode;
			return;
		}
		if(curr == null) {
			pre.next = newnode;
			return;
		}
		if(pre.data < ele && curr.data > ele) {
			newnode.next = curr;
			pre.next = newnode;
			return;
		}


	}

	@Override
	public void print() {
		if(head == null) {
			System.out.println("List is null");
			return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data +" -> ");
			curr = curr.next;
		}
		System.out.println("end");

	}

	@Override
	public boolean palindrome(Node head) {
		Node curr = head;
		boolean ispali = true;
		Stack<Integer> stack = new Stack();
		while(curr != null) {
			stack.push(curr.data);
			curr = curr.next;
		}
		while(head != null) {
			int i = stack.pop();
			if(head.data == i) {
				ispali = true;
			}
			else {
				ispali = false;
				break;
			}
			head = head.next;
		}
		return ispali;
	}

	@Override
	public void reverse() {
		Node curr = head;
		Node pre = null;
		Node next = null;

		while(curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		head = pre;

	}

	public void removeduplicate() {
		Node curr = head.next;
		Node pre = head;

		while(curr != null) {
			if( pre.data == curr.data) {
				pre.next = curr.next;
				curr = curr.next;
			}
			else {
				pre = curr;
				curr = curr.next;
			}
		}
	}

	public void deleteBetween(int ele) {
		if(head == null) {
			System.out.println("List is empty");
			return;

		}
		Node curr = head;
		Node pre = null;
		
		if(head.data == ele) {
			head = head.next;
			return;
		}
		while(curr != null) {
			if(curr.data == ele) {
				pre.next = curr.next;
				curr.next = null;
				return;
			}
			pre = curr;
			curr = curr.next;
		}
		
	}
	
	
	
}
