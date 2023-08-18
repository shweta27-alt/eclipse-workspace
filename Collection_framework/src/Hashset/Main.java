package Hashset;
import java.util.*;

public class Main {
	public static void main(String[] aegs) {
		Set<String> value = new HashSet<String>();
		value.add("djgshf");
		value.add("mona");
		value.add("hello");
		value.add("yes");
		System.out.println(value);
		
		// if you add dublicate element then it will show same list only
		// for removing
		value.remove("hello");
		System.out.println(value);
		
		
		Iterator<String> i = value.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	  
		Set<Integer> value1 = new HashSet<Integer>();
		value1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
		System.out.println(value1);
		
		Set<Integer> value2 = new HashSet<Integer>();
		value2.addAll(Arrays.asList(new Integer[] {8,9,0,5,6,7}));
		
		Set<Integer> intersection = new HashSet<Integer>(value1);
		intersection.retainAll(value2);
		System.out.println(intersection);
		
		Set<Integer> union = new HashSet<Integer>(value1);
		union.addAll(value2);
		System.out.println(union);
		
		Set<Integer> difference= new HashSet<Integer>(value1);
		difference.removeAll(value2);
		System.out.println(difference);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
