package com.array.pro;

public class ElementSum {
	
	public static int[] addition(int[] arr, int sum) {
		for(int i=0; i<arr.length ; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	public static void main(String [] args) {
		int sum= 5;
		int [] arr= {2,3,4};
		int [] ans = addition(arr, sum);
		
		for(int i=0;i<ans.length;i++) {
		System.out.println("index are : " +ans[i]);
		}
		
		
	}

}
