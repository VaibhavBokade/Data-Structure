package com.queue;

public interface QueueInterface<T> {
	void addQ(T element) throws QueueFullException;
	T deleteQ() throws QueueEmptyException;
	boolean isEmpty();
	boolean isFull();

}
