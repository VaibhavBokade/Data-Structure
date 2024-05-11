package com.tester;

import com.queue.CircularQueue;

public class CircularQueueTester {

	public static void main(String[] args) {
		try {
		CircularQueue queue = new CircularQueue();
		queue.addQ("Arjun");
		queue.addQ("Namdev");
		
		queue.addQ("Vaibhav");
		queue.addQ("Chetan");
		queue.addQ("Sumedh");
		
		
		queue.display();
		queue.deleteQ();
		//queue.display();
		queue.deleteQ();
		queue.deleteQ();
		queue.deleteQ();
		queue.deleteQ();
		//queue.deleteQ();
		//queue.display();
		queue.addQ(44);
		queue.display();
		
		}catch(Exception e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
