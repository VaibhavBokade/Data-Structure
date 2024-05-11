package com.stackTester;

import java.util.Scanner;

import com.stack.Stack;

public class StackTester {
	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter size");
		int size = sc.nextInt();
		Stack<Integer> stackList = new Stack<Integer>(size);
		int choice;
		
		do {
			System.out.println("*****Menu****");
			System.out.println("1. add element in stack"
					+ "\n 2. delete element from stack"
					+ "\n 3. print stack"
					+ "\n 4. exit");
			
			System.out.println("Enter your choice.....");
			
			choice = sc.nextInt();
			 try {
				 
				 switch (choice) {
				 
				 case 1:
					 System.out.println("Enter value");
					 int value = sc.nextInt();
					 stackList.push(value);
					 break;
					 
				 case 2:
					 stackList.pop();
					 break;
					 
				 case 3:
					 System.out.println(stackList);
					 break;
					 
				 case 4:
					 System.out.println(0);
					 break;
					
				 case 5:
					 stackList.reverseStack();
					 break;
				 }
				 
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			
		}while(choice != 0);
	}

}
}
