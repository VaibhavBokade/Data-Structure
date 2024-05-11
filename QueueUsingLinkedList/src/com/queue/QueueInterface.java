package com.queue;

public interface QueueInterface {
	void enqueue(int element);
	void dequeue();
	int peek();
	//boolean isFull();
	boolean isEmpty();
	void display();


}
