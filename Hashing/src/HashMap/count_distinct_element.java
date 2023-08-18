package HashMap;

import java.util.HashSet;

public class count_distinct_element {
	public static void main(String[] args) {
		int[] a= {4,5,1,4,5,6,7,2,8,95,4,32,};
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		System.out.println(set.size());
	}

}
