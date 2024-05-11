package com.queue;

public interface QueueInterface<T> {
	
	void add(T value) throws QueueFullxception;
	void delete() throws QueueEmptyException;
	boolean isFull();
	boolean isEmpty();
	
}
