package com.queueTester;

import java.util.Scanner;

import com.queue.Queue;


public class queueTester {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter size");
			int size = sc.nextInt();
			Queue<Integer> queueList = new Queue<Integer>(size);
			int choice;
			
			do {
				System.out.println("*****Menu****");
				System.out.println("1. add element in Queue"
						+ "\n 2. delete element from Queue"
						+ "\n 3. print Queue"
						+ "\n 4. exit");
				
				System.out.println("Enter your choice.....");
				
				choice = sc.nextInt();
				
				try {
					switch(choice) {
					
					case 1:
						System.out.println("enter value");
						int value = sc.nextInt();
						queueList.add(value);
						
						break;
						
					case 2:
						queueList.delete();
						break;
						
					case 3:
						System.out.println(queueList);
						break;
						
					case 4:
						System.out.println(0);
						break;

					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}while(choice != 0);
		}
	}

}
