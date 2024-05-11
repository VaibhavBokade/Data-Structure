package com.stack;

public interface StackInterface <T>{
	void push(T value) throws StackFullException;
	void pop() throws StackEmptyException;
	boolean isFull();
	boolean isEmpty();
	
	

}
