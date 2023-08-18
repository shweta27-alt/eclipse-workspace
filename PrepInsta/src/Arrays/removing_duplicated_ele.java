package Arrays;
import java.util.*;

public class removing_duplicated_ele {
	public static void main(String[] args) {
		int[] arr= {10,30,20,30,29,30,25,70,35};
		int n = arr.length;
		Set hashset = new HashSet();
		for(int i=0;i<n;i++) {
			hashset.add(arr[i]);
			
		}
		
		System.out.println(hashset);
	}

}
