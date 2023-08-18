package Arrays;
import java.util.*;

public class sort_half_assending_half_decending_in_java {
	public static void main(String[] args) {
		int[] arr = {1, 90, 34, 89, 7, 9};
		Arrays.sort(arr);
		int n= arr.length;
		printarr(arr,n);
	}
	
	static void printarr(int[] arr, int n) {
		
		int temp =0;
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n/2;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
			
			for(int j=n/2;j<n-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
