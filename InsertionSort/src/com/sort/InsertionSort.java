package com.sort;

public class InsertionSort {

	public static void insertionSort(int []arr) {
		int i,j,temp;

		for(i=1; i<arr.length; i++) {
			temp = arr[i];
			j = i-1;
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;

		}
	}

}
