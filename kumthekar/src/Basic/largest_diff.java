package Basic;

import java.util.Arrays;

public class largest_diff {
	public static void main(String[] args) {
		int[] arr = { 5,2,8,12,68,35,57};
		int max = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		    max = arr[arr.length-1]-arr[0];
		}
		System.out.println(max);
		
//		int max = 0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j = i;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					max = Math.max(max,arr[j]-arr[i]);
//					
//				}
//				
//			}
//		}
//		System.out.println(max);
//		
	}

}
