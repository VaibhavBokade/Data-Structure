package com.bracket.pro;

import java.util.Scanner;

public class EnterInSpecifidPosition {
	public static void main(String [] args) {
		int arr[] =new int[5];
		System.out.println("Enter the element: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i < arr.length-1; i++) {
			arr[i] =sc.nextInt();
		}
		
		System.out.println("Before insert: ");
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.println("\n"+"Enter location: ");
		int location = sc.nextInt();
		
		System.out.println("\n"+" Enter value: ");
		int val = sc.nextInt();
		
		for(int i=arr.length-1; i>location; i--) {
			arr[i] = arr[i-1];
		}
		arr[location] =val;
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	
	
		
		
		
		
		
	}


