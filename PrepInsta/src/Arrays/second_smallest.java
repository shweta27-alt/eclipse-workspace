package Arrays;

import java.util.Arrays;

public class second_smallest {
	public static void main(String[] args) {
		int[] arr = {12, 56, 45, 34,30};
		int smallest = arr[0];
	
		for(int i=1;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		
		 int sec_smallest = Integer.MAX_VALUE;
		 
		 for (int i=0; i < arr.length; i++){
	         if(arr[i] != smallest && arr[i] < sec_smallest)
	           sec_smallest = arr[i];
	     }
		
		System.out.println("second min ele"+sec_smallest );
	}

}
