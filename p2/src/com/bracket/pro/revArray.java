package com.bracket.pro;

public class revArray {
	public static void main(String [] args) {
		int arr[] = {2,4,6,8,10,12};
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		reverse(arr);
		
		for(int j =0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	public static void reverse(int [] arr) {
		int i=0;
		int j= arr.length-1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
