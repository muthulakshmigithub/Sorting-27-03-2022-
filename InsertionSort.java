package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	
	public static int[] insertionsort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			
			int j=1;
			while((j>0) && (arr[j-1]>arr[j])) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
			
		}
		return arr;
	}
	public static void main(String[]args) {
		 
		int arr[]= new int[]{8,9,6,5,2,3};
		arr=insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
