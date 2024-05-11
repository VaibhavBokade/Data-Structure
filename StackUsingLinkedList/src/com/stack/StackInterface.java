package com.stack;

public interface StackInterface<T> {
	void push(T element)throws StackException;
	void pop() throws StackException;
	Object peek();
	boolean isFull(); 
	boolean isEmpty();
	void display();

}
