package com.dataStructure;

public interface QueueInterface {
	void add(int ele) throws QueueException;
	int remove() throws QueueException;
	boolean isFull();
	boolean isEmpty();

}
