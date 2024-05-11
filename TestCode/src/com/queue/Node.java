package com.queue;

public class Node<Movie> {
	Node<Movie> next;
	Node<Movie> pre;
	Movie data;

	public Node() {
		super();
	}

	public  Node(Movie data) {
		super();
		this.next = null;
		this.data = data;
		this.pre = null;
	}



}
