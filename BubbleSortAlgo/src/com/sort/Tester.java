package com.sort;

public class Tester {

	public static void main(String[] args) {
		int []arr = {9,14,3,2,43,11,58,22};
		System.out.println("Before Bubble Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        BubbleSort.selectionSort(arr);
         
        System.out.println("After Bubble Sort");  
        for(int i:arr){  
            System.out.print(i+" "); 

	}
	}

}
