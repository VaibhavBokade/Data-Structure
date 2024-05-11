package com.stack;

public class LinkedList<T> implements StackInterface<T>{
	private Node top;
	private int count;
	private int size;
	
	public LinkedList() {
		super();
	}

	public LinkedList( int size) {
		super();
		this.top = null;
		this.count = size;
	}



	@Override
	public void push(T element) throws StackException{
		if(isFull()) {
			throw new StackException("Stack is full...");
		}
		Node temp = new Node(element);
		temp.next = top;
		top= temp;
		count++;
		
	}



	@Override
	public void pop() throws StackException{
		if(isEmpty()) {
		
		throw new StackException("Stack is Empty...");
		}
		if(top == null) {
			System.out.println("Stack is null");
		}
		top = top.next;
		count--;
	}



	@Override
	public Object peek() {
		if (!isEmpty()) {
            return (Object) top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
		
		
	}



	@Override
	public boolean isFull()  {
		if(count == size) {
			return true;
		}
		return false;
	}



	@Override
	public boolean isEmpty()  {
		if(top == null) {
			return true;
		}
		return false;
	}



	@Override
	public void display() {
		if(top == null) {
			System.out.println("Stack is empty");
		}
		else {
			Node temp = top;
			while(temp != null) {
				System.out.print(temp.data +" -> ");
				temp = temp.next;
			}
			System.out.println("End");
		}
		
	}

	@Override
	public String toString() {
		return "LinkedList [top=" + top + ", size=" + count + "]";
	}
	
	
	
	
}
