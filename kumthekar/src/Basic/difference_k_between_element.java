package Basic;

import java.util.Arrays;
//diff between successive term is k 
public class difference_k_between_element {
	public static void main(String[] args) {
		int[] arr = {2,8,5,2,10,13,18,15};
		int k=3;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]-arr[i+1]==k|| arr[i+1]-arr[i]==k) {
				System.out.println(arr[i]+","+ arr[i+1]);
			}
		}
	}

}
