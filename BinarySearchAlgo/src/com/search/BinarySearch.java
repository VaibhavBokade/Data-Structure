package com.search;

public class BinarySearch {
	
	public static boolean binarySearch(int []arr, int key) {
		int left = 1;
		int right = arr.length;
		int mid =0;
		
		while(left <= right) {
			 mid = (left + right) / 2;
			
			if(key == arr[mid]) {
				return true;
			}
			
			if(key < arr[mid]) {
				right = mid - 1;
			}
			else 
			if(key > arr[mid]) {
				left = mid + 1;
			}
			
		}
		return false;
		
		
		
	}

}
