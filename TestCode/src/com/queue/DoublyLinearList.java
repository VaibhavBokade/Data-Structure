package com.queue;

import java.util.Stack;

public class DoublyLinearList<Movie> implements Queue<Movie>{
	 Node<Movie> head;

	int size;

	public DoublyLinearList() {
		super();
	}

	public DoublyLinearList( int size) {
		super();
		this.head = null;
		this.size = 0;
	}



	@Override
	public void push(Movie ele)  {
		Node newnode = new Node(ele);
		if(isEmpty()) {
			head = newnode;
			size++;
			return;
		}

		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newnode;
		newnode.pre = curr;
		size++;

	}

	@Override
	public Movie pop() throws QueueEmptyException {
		if(isEmpty()) {
			throw new QueueEmptyException("Queue is empty....");
		}
		System.out.println("\n");
		head = head.next;
		head.pre = null;
		size--;

		return null;
	}

	@Override
	public Movie peek() {
		if(!isEmpty())
			return head.data;
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" <->");
			temp = temp.next;
		}
	}

	public DoublyLinearList reverse() {
		Node temp = head;
		Stack<Movie> stack = new Stack<>();
		while(temp != null) {
			stack.push((Movie)temp.data);
			temp = temp.next;
		}
		DoublyLinearList revList = new DoublyLinearList();
		while(!stack.isEmpty()) {
			revList.push(stack.pop());
		}
		return revList;
	}


}
