package com.dataStructure;

import java.util.Arrays;

public class Queue implements QueueInterface{
	private int []queueData;
	private int rear =0;
	private static final int NUM = 10;
	private int size = 0;
	
	public Queue() {
		this(NUM);
	}
	
	public Queue(int size) {
		super();
		this.queueData = new int[size];
		this.rear = 0;
		this.size = 0;
	}
	
	
	@Override
	public void add(int ele) throws QueueException{
		if(isFull()) {
			throw new QueueException("Queue is full....");
		}
		queueData[rear] = ele;
		rear++;
		
	}
	
	@Override
	public int remove() throws QueueException {
		if(isEmpty()) {
			throw new QueueException("Queue is empty....");
		}
		int item = queueData[0];
		for(int i=1; i< queueData.length ; i++) {
			queueData[i-1] = queueData[i];	
		}
		rear--;
		return item;
	}
	@Override
	public boolean isFull() {
		if(rear == queueData.length-1)
			return true;
		return false;
	}
	@Override
	public boolean isEmpty() {
		if(rear == 0)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Queue [queueData=" + Arrays.toString(queueData) + ", rear=" + rear + ", size=" + size + "]";
	}
	
}
