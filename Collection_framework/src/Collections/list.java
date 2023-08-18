package Collections;
import java.util.*;

public class list {
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList.add(1);
		newList.add(4);
		newList.add(3);
		newList.add(5);
		newList.add(6);
		newList.add(7);
		newList.add(8);
		newList.add(9);
		newList.add(3,4);
		
		
		List<Integer> subList = new ArrayList<>();
		subList.add(3);
		subList.add(4);
		subList.add(5);
		
//		int ind = Collections.indexOfSubList(newList, subList);
//		System.out.println("the index is:"+ind);
		
		List<String> names = new ArrayList<>();
		names.add("apple");	
		names.add("banana");
		names.add("orange");
		names.add("cows");	
		
		Collections.sort(names, Collections.reverseOrder());
		
		
		//binary search
//		int search = Collections.binarySearch(newList,1);
//		System.out.println(search);
//;		
		Iterator IT =names.listIterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
		//max and min
//		int max = Collections.max(newList);
//		System.out.println("the max value is:" + max);
//		
//		int min = Collections.min(newList);
//		System.out.println("the max value is:" + min);
		
		
		
		
		
	}

}
