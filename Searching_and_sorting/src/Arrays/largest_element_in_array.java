package Arrays;
import java.util.*;

public class largest_element_in_array {
	public static void main(String[] args) {
		int[] a1 = {7,3,0,2,1,5};
		int[] a2 = {6,2,9,5,4,1};
		System.out.println("the largest element in a1: "+ sort(a1));
		System.out.println("the largest element in a2: " + sort(a2));
	}
	// 1st approach
//	static int sort(int[] a) {
//		Arrays.sort(a);
//		return a[a.length-1];
//	}
	 
	
	
//	2nd approach
	static int sort(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

}
