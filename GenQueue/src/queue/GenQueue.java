package queue;

import java.util.Arrays;

public class GenQueue<T> implements Interface<T>{ 
	private T[] queuedata;
	private int front = 0;
	private int rear = 0;
	private static final int Num = 20;
	private int size = 0;
	
	public GenQueue() {
		this(Num);
	}

	public GenQueue(int size) {
		super();
		this.queuedata = (T[])new Object[size];
		this.front = 0;
		this.rear = 0;
		this.size = size;
	}

	@Override
	public void enqueue(T ele) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queuedata[rear] = ele;
		rear++;
		
	}

	@Override
	public T dequeue() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
		return null;
	}
	T item = queuedata[0];
	
	for(int i= 1; i< queuedata.length; i++) {
		queuedata[i-1] = queuedata[i];
	}
	rear--;
		return item;
	}

	@Override
	public boolean isFull() {
		if(rear == size - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(rear == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=0; i<=rear; i++) {
			System.out.print(" "+queuedata[i]+" -> ");
		}
		
	}

	@Override
	public String toString() {
		return "GenQueue [queuedata=" + Arrays.toString(queuedata) + ", front=" + front + ", rear=" + rear + ", size="
				+ size + "]";
	}
	
	
	
	
	
}
