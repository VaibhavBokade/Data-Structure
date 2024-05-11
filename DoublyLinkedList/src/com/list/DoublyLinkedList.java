package com.list;

public class DoublyLinkedList implements ListInterface{
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList( ) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = 0;
	}

	@Override
	public void addFirst(int element) {
		Node newNode = new Node(element);
		if(head == null && tail == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
//		head.previous = newNode;
//		newNode.next = head;
//		head = newNode;
//		size++;
		Node curr = head;
		
		while (curr != null) {
			if (curr.data > element) {
				break;
			}
			curr = curr.next;
		}
		if (curr == head) {

				head.previous = newNode;
				newNode.next = head;
				head = newNode;

				return;
			}
		
		if (curr == null) {
				tail.next = newNode;
				newNode.previous = tail;
				tail = newNode;
				return;
			}
		
		
		
	}

	@Override
	public void addLast(int element) {
		Node newNode = new Node(element);
		if(head == null && tail == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
		size++;
		
	}

	@Override
	public void deleteFirst() {
		
		if(head == null && tail == null) {
			System.out.println("List is empty");
		}
		 Node temp = head;
		 head.next.previous= null;
		head = head.next;
		temp.next = null;
		size--;
		
	}

	@Override
	public void deleteLast() {
		Node temp = tail;
		if(head == null && tail == null) {
			System.out.println("Queue is empty");
		}
		tail = temp.previous;
		tail.next = null;
		
	}

	@Override
	public void printList() {
		Node currNode = new Node();
		if(head == null && tail == null) {
			System.out.println("List is empty...");
			return;
		}
		 currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data +" <-> " );
			currNode = currNode.next;
		}
		System.out.println("END");
		
	}
	
	public void revprintList() {
		Node currNode = new Node();
		if(head == null && tail == null) {
			System.out.println("List is empty...");
			return;
		}
		 currNode = tail;
		while(currNode != null) {
			System.out.print(currNode.data +" <-> " );
			currNode = currNode.previous;
		}
		System.out.println("END");
		
	}
	
}
