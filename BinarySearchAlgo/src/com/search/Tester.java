package com.search;

public class Tester {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int key = 70;
		if(BinarySearch.binarySearch(arr, key)) 
		System.out.println("key is found in array  "  );
		else
			if(false)
			System.out.println("key is not found in aray.....");
		
	}

}
