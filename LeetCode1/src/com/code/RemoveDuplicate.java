package com.code;

public class RemoveDuplicate {

	public int[] removeDuplicate(int[] nums,int n) {
		int []arr = new int[n];
		int j=0;

		for(int i=0; i<nums.length-1 ;i++) {

			if(nums[i] != nums[i+1]) {
				arr[j++] = nums[i];

			}
		}
		arr[j++] = nums[n-1];


		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}

		return arr;
	}


	public int[] removeEven(int []arr) {
		int oddcount = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] %2 !=0) { 
				oddcount++;
			}
		}
		int []result = new int[oddcount];
		int idx=0;
		for(int i =0; i<arr.length ; i++) {
			if(arr[i] %2 !=0) { 
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}

	public void print(int []arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
