package com.sort;

public class SelectionSort {
	public static void selectionSort(int []arr) {
		int i,j,temp,min;

		for(i=0; i< arr.length-1 ; i++) {
			min=i;
			for(j= i+1 ; j<arr.length ; j++) {
				if(arr[j] < arr[min]) 
					min=j;
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

	}

}
