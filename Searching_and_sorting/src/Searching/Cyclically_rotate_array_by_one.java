package Searching;
import java.util.*;
public class Cyclically_rotate_array_by_one {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		 int x=arr[arr.length-1];
	        for(int i=arr.length-1;i>0;i--){
	            arr[i]=arr[i-1];
	            
	        }
	        
	        arr[0]=x;
	        System.out.println(Arrays.toString(arr));
	}
}
