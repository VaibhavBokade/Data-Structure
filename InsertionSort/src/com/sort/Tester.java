package com.sort;

public class Tester {

	public static void main(String[] args) {
		int[]arr = {8,4,5,1,9,2};
		System.out.println("Before Insertion Sort");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		InsertionSort.insertionSort(arr);
		System.out.println("\n After Insertion Sort");
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}

}
