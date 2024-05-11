package com.list;

public class DCL<T> implements DCLInterface<T>{
	Node<T> head;
	int size;
	
	public DCL() {
		super();
	}

	public DCL(Node<T> head, int size) {
		super();
		this.head = head;
		this.size = size;
	}

	@Override
	public void addFrist(T ele) {
		Node<T> newnode = new Node<>(ele);
		if(head == null) {
			head = newnode;
			newnode.next = head;
			newnode.pre = head;
			return;
		}
		
		newnode.next = head;
		newnode.pre = head.pre;
		head.pre.next = newnode;
		head.pre = newnode;
		head = newnode;
		size++;
		
	}

	@Override
	public void addLast(T ele) {
		Node<T> newnode = new Node<T>(ele);
		if(head == null) {
			head = newnode;
			newnode.next = head;
			newnode.pre = head;
			return;
		}
		Node<T> curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		
		newnode.pre = curr;
		newnode.next = head;
		head.pre = newnode;
		curr.next = newnode;
		size++;
		
	}

	@Override
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		
		//head.pre = head.next;
		head.pre.next = head.next;
		head.next.pre = head.pre;
		head = head.next;
		size--;
		
		if(head == head) {
			head = null;
		}
		
	}

	@Override
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node<T> curr = head;
		while(curr.next.next != head) {
			curr = curr.next;
		}
		curr.next = head;
		head.pre = curr;
		size--;
		
		
	}

	@Override
	public void print() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node curr = head;
		do {
			System.out.println(curr.data +" <->");
			curr = curr.next;
			
		}while(curr != head);
		
	}
	
	public void reverse() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node curr = head;
		do {
			System.out.println(curr.pre.data +" <->");
			curr = curr.next;
			
		}while(curr != head);
		
	}
	
	

}
