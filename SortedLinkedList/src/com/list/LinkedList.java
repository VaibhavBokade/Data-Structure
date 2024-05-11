package com.list;

public class LinkedList implements ListInterface{
	private Node head;
	private int size;
	private Node tail;
	
	public LinkedList() {
		super();
	}

	public LinkedList( int size) {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public void insert(int element) {
		Node newNode = new Node(element);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public void addFirst(int element) {
		Node node = new Node(element);
		if(head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
		size++;
	}
	
	public void sortList() {
		Node temp = head;
		Node index = null;
		int element;
		
		if(head == null) {  
            return;  
        }  
		else {
			while(temp != null) {
				index = temp.next;
				
				while(index != null) {
					if(temp.data > index.data) {
						element = temp.data;
						temp.data = index.data;
						index.data = element;
					}
					index = index.next;
				}
				temp = temp.next;
			}
		}	
		
	}

	@Override
	public void printList() {
		if(head == null) {
			System.out.println("List is null");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.println("end");
	}
	
	
	

}
