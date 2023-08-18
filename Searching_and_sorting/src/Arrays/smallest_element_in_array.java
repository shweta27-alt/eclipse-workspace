package Arrays;
import java.util.*;

public class smallest_element_in_array {
	public static void main(String[] args) {
		int[] a1 = {7,3,0,2,1,5};
		int[] a2 = {6,2,9,5,4,1};
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println("the smallest element in a1: "+ sort(a1));
		System.out.println("the smallest element in a2: " + sort(a2));
	}
	
	static int sort(int[] a) {
		Arrays.sort(a);
		return a[0];
		
	} 
}
