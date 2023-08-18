package Arrays;
import java.util.Arrays;

public class second_smallest_second_largest_ele_array {
	public static void main(String[] args) {
		int[] a1 = {7,3,0,2,1,5};
		int[] a2 = {6,2,9,5,4,1};
		System.out.println("the second smallest element in a1: "+ sortsecondsmallest(a1));
		System.out.println("the second largest element in a2: " + sortsecondlargest(a2));
		
	}
  
	static int sortsecondsmallest(int[] a1) {
		Arrays.sort(a1);
		return a1[1]	;
	}
	
    static int sortsecondlargest(int[] a2) {
		Arrays.sort(a2);
		return a2[a2.length-2];
	}
}
