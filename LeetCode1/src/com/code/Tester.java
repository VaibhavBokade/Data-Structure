package com.code;

public class Tester {

	public static void main(String[] args) {
		RemoveDuplicate r = new RemoveDuplicate();
		int []nums = {1,1,2,3,4,4,5,6,7};
		int n = nums.length;
		//int []nums = {3,2,4,7,10,6,5};
		
		int[] ss = r.removeDuplicate(nums,n);
		r.print(ss);
		int[] res= r.removeEven(nums);
		r.print(res);
	}

}
