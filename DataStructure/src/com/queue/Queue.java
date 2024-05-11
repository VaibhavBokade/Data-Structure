package com.queue;

import java.util.Arrays;

public class Queue<T> implements QueueInterface<T> {

	private T[]queue;
	private static final int NUM = 10;
	private int size;
	private int front = -1;
	private int rear = -1;

	public Queue( ) {
		this(NUM);
	}


	@SuppressWarnings("unchecked")
	public Queue( int size) {
		super();
		this.queue = (T[]) new Object[size];
		this.size = size;
		this.front = -1;
		this.rear = -1;
	}


	@Override
	public void add(T value) throws QueueFullxception {

		if(isFull()) {
			throw new QueueFullxception("Queue is full");
		}
		else {
			if(rear == -1)
				front++;
			rear++;
			this.queue[rear] = value;
			System.out.println("Added successfully....");
		}
	}


	@Override
	public void delete() throws QueueEmptyException{

		if(isEmpty()) {
			throw new QueueEmptyException("Queue is Empty");
		}
		this.queue[front] = null;
		front++;
		System.out.println("Deleted successfully....");
	}


	@Override
	public boolean isFull() {
		if(rear == this.size - 1)
			return true;
		return false;
	}


	@Override
	public boolean isEmpty() {
		if(front > rear)
			return true;
		return false;
	}


	@Override
	public String toString() {
		return "Queue [queue=" + Arrays.toString(queue) + ", size=" + size + ", front=" + front + ", rear=" + rear
				+ "]";
	}




}