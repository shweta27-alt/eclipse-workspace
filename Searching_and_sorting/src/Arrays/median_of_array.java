package Arrays;
import java.util.*;

public class median_of_array {
	public static void main(String[] args) {
		int[] arr = {2,4,1,3,5};
		Arrays.sort(arr);
		int n= arr.length;
		if(n%2==0) {
			int num1=(n/2)-1;
			int num2 = (n/2);
			System.out.println((double)(arr[num1]+arr[num2])/2);
		}
		else {
			System.out.println(arr[n/2]);
		}
	}

}
