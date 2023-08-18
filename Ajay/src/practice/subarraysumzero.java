package practice;
import java.util.*;

public class subarraysumzero {
	public static void main(String[] args) {
		int[] arr = {2,3,1,-4,3,-2};
		System.out.println(sumarr(arr));
	}
	
	static boolean sumarr(int[] arr) {
		Set<Integer> map = new HashSet<Integer>();
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			if(sum == 0 || map.contains(sum) || arr[i]==0) {
				return true;
			}
			map.add(sum);
		}
		return false;
	}

}

