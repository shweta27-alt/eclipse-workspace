package Sorting;

public class selection_sort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main (String[] args) {
		int[] arr = {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++) {
			//consider first element as smallest
			int smallest=i;
			for(int j= i+1 ; j<arr.length;j++) {
				//if that first element is greater than the other element
				if(arr[smallest]> arr[j]) {
					//then we make other element as smalllest
					smallest=j;
				}
			}
			//now we will swap them
		   int temp = arr[smallest];
		   arr[smallest]= arr[i];
		   arr[i]=temp;
		}
		
		printArray(arr);
	}
}
