package com.sort;

public class Tester {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90};
		//Sorting.sorting(arr);
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println("\n "+Sorting.sorting(arr));

	}

}
