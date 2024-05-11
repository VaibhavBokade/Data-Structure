package com.list;

public class DoublyCircularList implements ListInterface{
	private Node head;
	private int size;

	public DoublyCircularList() {
		super();
	}

	public DoublyCircularList( int size) {
		super();
		this.head = head;
		this.size = 0;
	}

	@Override
	public void addFirst(int element) {
		Node newnode = new Node(element);
		if(head == null ) {
			//System.out.println("h");
			head = newnode;
			newnode.next = head;
			newnode.previous = head;

			return;
		}
		newnode.next = head;
		newnode.previous = head.previous;
		head.previous.next = newnode;
		head.previous = newnode;
		head = newnode;
		//		head.next = newnode;
		//		newnode.next = head.next.previous;
		//		newnode.previous = head;
		size++;
	}

	@Override
	public void addLast(int element) {
		Node newnode = new Node(element);
		if(head == null ) {
			//System.out.println("h");
			head = newnode;
			newnode.next = head;
			newnode.previous = head;

			return;
		}
		Node curr = head;
		while(curr.next != head)  {
			curr = curr.next;
		}
		Node last = curr;
		newnode.previous = last;
		newnode.next = head;
		last.next = newnode;

		head.previous = newnode;
		size++;

	}

	@Override
	public void delete( int index) {
		Node curr = head;
		if(index == 0) {
			curr = curr.next;
			curr.previous = head.previous;
			head.previous.next = curr;
			head = curr;
			size--;
		}

		for(int i=0; curr.next != head && i < index-1 ; i++) {
			curr = curr.next;
		}
		Node last = curr.next.next;
		last.previous = curr;
		curr.next = last;

	}

	public void addBetween(int element , int index) {
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;
		}
		Node newnode = new Node(element);
		newnode.next = temp.next;
		newnode.previous = temp;
		temp.next.previous = newnode;
		temp.next = newnode;

		size++;

	}

	@Override
	public void printList() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}

		Node node = head;
		do {
			System.out.print(node.data+" <-> ");
			node = node.next;
		}while(node != head);
		System.out.println("head");
	}

	@Override
	public void reverse() {
		if(head == null) {
			System.out.println("List is empty...");
			return;
		}
		Node node = head;
		do {
			System.out.print(node.previous.data+" <-> ");
			node = node.previous;
		}while(node != head);
		System.out.println("head");

	}

}
