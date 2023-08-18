package Basic;

import java.util.Arrays;

/*
 
Given digits print the min and max no formed from it.
Eg [4, 2, 8, 9] ==> min = 2489 max = 9842

 */

public class min_max_no_formed {
	public static void main(String[] args) {
		int[] a = {4, 2, 8, 9};
		int min=0;
		int max=0;
		Arrays.sort(a);
		System.out.print("Min:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		System.out.print("Max:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		
	}
}
