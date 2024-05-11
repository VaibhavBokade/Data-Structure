package com.queue;

public class Tester {

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println("AFTER DELETING ALL");
		queue.display();
		queue.enqueue(50);
		queue.display();
		System.out.println();
		
		//System.out.println(queue.peek());
	}

}
