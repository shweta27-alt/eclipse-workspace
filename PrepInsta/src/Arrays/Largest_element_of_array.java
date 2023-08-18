package Arrays;
import java.util.*;

public class Largest_element_of_array {
	public static void main(String[] args) {
		int arr[]= {12,13,1,10,34,10};
		
		//1st method
//		Arrays.sort(arr);
//		int n=0;
//		for(int i=0;i<arr.length;i++) {
//			n=arr[arr.length-1];
//		}
//		System.out.println("largest element is:"+ n);
		
		// 2nd method
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}
