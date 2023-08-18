package Basic;
import java.util.*;

public class Smallest_diff {
	public static void main(String[] args) {
		int[] arr = { 5,2,8,12,68,35,57};
		Arrays.sort(arr); 
		int min=arr[1]-arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					min = Math.min(min, arr[j]-arr[i]);
				}
			}
		}
		System.out.println(min);
	}
}
