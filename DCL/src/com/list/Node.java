package com.list;

//import DL.Node;

public class Node<T> {
	Node next;
	Node pre;
	T data;
	
	public Node() {
		super();
	}

	public Node( T data) {
		super();
		this.next = null;
		this.pre = null;
		this.data = data;
	}
	
	}

