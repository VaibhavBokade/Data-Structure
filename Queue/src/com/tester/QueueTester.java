package com.tester;

import com.dataStructure.Queue;

public class QueueTester {

	public static void main(String[] args) {
		try {
		Queue queue = new Queue();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue);
		
		queue.remove();
		queue.remove();
		queue.remove();
		
		System.out.println(queue);
		queue.add(100);
		System.out.println(queue);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
