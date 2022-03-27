package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,2,8,9,6};
		int n=arr.length;
		
		System.out.println("Bubble Sorting\n");
		System.out.println("Before sorting");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sorting");

		for(int k:arr) {
			System.out.print(k+" ");
		}
				
	}

}
