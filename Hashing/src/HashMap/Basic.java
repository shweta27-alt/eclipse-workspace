package HashMap;
import java.util.*;

public class Basic {
	public static void main(String[] args) {
		//create
		HashMap<String, Integer> hm = new HashMap<>();
		
		//Insert
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Canada",200);
		hm.put("paris", 50);
		System.out.println(hm);
		
		//get
		int pop = hm.get("India");
		System.out.println(pop);
		
		//ContainsKey
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("UK"));
		
		//Remove
		System.out.println(hm.remove("China"));
		System.out.println(hm);
	
		//size
		System.out.println(hm.size());
		
		//Isempty
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
