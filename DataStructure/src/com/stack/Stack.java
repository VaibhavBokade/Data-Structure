package com.stack;

import java.util.Arrays;

public class Stack<T> implements StackInterface <T>{
	private T[] stack;
	private int top = -1;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Stack( int size) {
		super();
		this.stack = (T[]) new Object[size];
		this.top = -1;
		this.size = size;
	}

	@Override
	public void push(T value) throws StackFullException{

		if(isFull()) {
			throw new StackFullException("Stack is full !!!!");
		}
		this.top += 1;
		this.stack[top] = value;
		System.out.println("Added successfully....");
	}

	@Override
	public void pop() throws StackEmptyException{

		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty !!!!");
		}
		this.stack[top] = null;
		this.top -= 1;
		System.out.println("Deleted successfully....");
	}

	@Override
	public boolean isFull() {
		if(top == this.size - 1)
		return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(top == -1)
			
		return true;
		return false;
	}
	
	public void reverseStack() throws StackEmptyException, StackFullException {
		if(!isEmpty()) {
			T data = stack[top];
			this.pop();
			reverseStack();
			insertAtBottom(data);
		}
	}
	
	public void insertAtBottom(T data) throws StackFullException, StackEmptyException {
		if(isEmpty()) {
			this.push(data);
		}
		else {
			T data1 = stack[top];
			this.pop();
			insertAtBottom(data);
			this.push(data1);
		}
	}

	@Override
	public String toString() {
		return "Stack [stack=" + Arrays.toString(stack) + ", top=" + top + ", size=" + size + "]";
	}
	
	

}
