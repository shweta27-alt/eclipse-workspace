package HashMap;

import java.util.HashMap;
import java.util.Set;

// given an array of size n, find all element that appears more than n/3 times
public class Majority_element {
	public static void main(String[] args) {
		int[] num= {1,3,2,5,1,3,1,5,1};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i],map.get(num[i])+1);
			}else {
				map.put(num[1], 1);
			}
		}
		
		
		Set<Integer> keySet = map.keySet();
		for(Integer key: keySet ){
			if(map.get(key)>num.length/3) {
				System.out.println(key);
			}
		}
	}

}
