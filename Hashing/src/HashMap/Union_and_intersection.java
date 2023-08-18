package HashMap;

import java.util.HashSet;

public class Union_and_intersection {
	public static void main(String[] args) {
		int[] arr1 = {6,4,3};
		int[] arr2 = {2,5,4,8,9};
		
		HashSet<Integer> set = new HashSet<>();
		//union
		for(int i=0;i<arr1.length;i++) {
			set.add(i);
		}
		
		for(int i=0;i<arr2.length;i++) {
			set.add(i);
		}
		
		System.out.println("Union= "+set.size());
		for(int i=0;i<set.size();i++) {
			System.out.println("Union= "+ set);
		}
		
		//Intersection
		set.clear();
		for(int i=0;i<arr1.length;i++) {
			set.add(i);
		}
		int count=0;
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) {
				count++;
				set.remove(arr2[i]);
			}
		}
		
		System.out.println("Intersection="+ count);
	}

}
