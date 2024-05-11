package sort;

public class Tester {

	public static void main(String[] args) {
		int []arr = {3,6,9,5,2,8};
		int n = arr.length;
		MergeSort.divide(arr, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();

	}

}
