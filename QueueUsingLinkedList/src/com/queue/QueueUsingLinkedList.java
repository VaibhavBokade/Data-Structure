package com.queue;

public class QueueUsingLinkedList implements QueueInterface{
	private Node front;
	private Node rear;
	private int size;
	
	public QueueUsingLinkedList() {
		super();
	}

	public QueueUsingLinkedList( int size) {
		super();
		this.front = null;
		this.rear = null;
		this.size = size;
	}

	@Override
	public void enqueue(int element) {
		Node newnode = new Node(element);
//		if(isFull()) {
//			System.out.println("Queue is full...");
//		}
		if(isEmpty()) {
			rear = front = newnode;
			return;
		}
		else {
			rear.next = newnode;
			rear = newnode;
		}
		size++;
		
		
	}

	@Override
	public void dequeue() {
		if(isEmpty()) {
		System.out.println("Queue is empty...");	
		}
		front = front.next;
		
		size--;
		if(front == null) {
			rear = null;
		}
	}

	@Override
	public int peek() {
		if(!isEmpty()) {
			return front.data;
		}
		return 0;
	}

//	@Override
//	public boolean isFull() {
//		if(rear != null && front != null) {
//			return true;
//		}
//		return false;
//	}

	@Override
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		if(rear == null && front == null) {
			System.out.println("queue is empty");
			return;
		}
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data +" ->");
			temp = temp.next;
		}
		//System.out.println("End");
	}
	
	

}
