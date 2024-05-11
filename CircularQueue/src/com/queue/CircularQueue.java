package com.queue;

import java.util.Arrays;

public class CircularQueue<T> implements QueueInterface<T>{
	private T[]queuedata;
	private static final int DEFAULT_SIZE= 10;
	private int front = 0;
	private int rear = 0;
	private int size = 0;
	
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	
	
	
	public CircularQueue(int size) {
		super();
		queuedata =(T[]) new Object [size] ;
//		front = 0;
//		rear = 0;
//		size = 0;
	}


	@Override
	public void addQ(T element) throws QueueFullException {
		if(isFull()) {
			throw new QueueFullException("Queue is full!!!");
		}
		queuedata[rear] =element;
		rear++;
		rear = rear % queuedata.length;
		size++;
	}


	@Override
	public T deleteQ() throws QueueEmptyException {
		if(isEmpty()) {
			throw new QueueEmptyException("Queue is Empty!!");
		}
		T element = queuedata[front];
		front++;
		front = front % queuedata.length;
		size--;
		      return (element);
		    
	}


	@Override
	public boolean isEmpty() {
		if(size  == 0) {
			return true;
		}
		return false;
	}


	@Override
	public boolean isFull() {
		if(size == queuedata.length ) {
			return true;
		}
		
		return false;
	}


	public void display() {
		int i = front;
		do {
			System.out.print("  "+queuedata[i] + " -> " );
			i++;
			i %= queuedata.length;
		}while(i != rear);
		System.out.println("end");
	}
	
	
	@Override
	public String toString() {
		return "CircularQueue [queuedata=" + Arrays.toString(queuedata) + ", front=" + front + ", rear=" + rear
				+ ", size=" + size + "]";
	}
	
	
	

}
