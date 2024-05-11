package com.list;

public class CircularLinkList implements ListInterface{
	private Node head;
	private Node tail;
	private int size;
	
	
	
	public CircularLinkList() {
		super();
	}



	public CircularLinkList( int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = 0;
	}



	@Override
	public void addFirst(int element) {
		Node newnode = new Node(element); 
		if(head == null) {
			head = newnode;
			tail = newnode;
			return;
		}
		tail.next = newnode;
		newnode.next = head;
		head = newnode;
		size++;
		
	}



	@Override
	public void addInBetween(int element, int index) {
		Node newnode = new Node(element); 
		if(head == null) {
			head = newnode;
			tail = newnode;
			return;
		}
		Node temp = head;
		for(int i=1; i < index-1 ; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		
		size++;
		
	}



	@Override
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty....");
			return;
		}
		head = head.next;
		tail.next = head;
		size--;
		
	}

	@Override
	public void printList() {
		if(head == null) {
			System.out.println("List is empty....");
			return;
		}
		Node currnode = head;
		do {
			System.out.print(currnode.data +" -> ");
			currnode = currnode.next;
		}while(currnode != head);
		System.out.println("head");
		
	}



	@Override
	public void deleteInBetween(int index) {
		if(head == null) {
			System.out.println("List is empty....");
			return;
		}
		if(index == 0) {
			deleteFirst();
			return;
		}
		
		Node temp = head;
		for(int i= 0; temp !=null && i < index -1 ; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
	}
	
	

}
