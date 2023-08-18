package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Interate {
	public static void main(String[] args) {
		//create
		HashMap<String, Integer> hm = new HashMap<>();
		
		//Insert
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Canada",200);
		hm.put("paris", 50);
		System.out.println(hm);
		
		//Iterate
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String k: keys) {
			System.out.println("Key="+k+" , value="+hm.get(k));
		}

}
}
