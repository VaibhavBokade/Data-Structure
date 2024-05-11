package com.sort;

public class Tester {

	public static void main(String[] args) {
		//SelectionSort s = new SelectionSort();
		int []arr = {30,20,60,50,10,40};
		System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        SelectionSort.selectionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  

	}
	}
}

