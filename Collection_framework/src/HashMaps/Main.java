package HashMaps;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Map <String,String> hm = new HashMap<>();

		hm.put("shweta","saindane");  //one key one value if same key occurs value gets replaced
		hm.remove("shweta"); //it returns the removed value

		for(String key: hm.keySet()){
			System.out.println(key +"-" + hm.get(key));
		}
		
		//for removing used .remove
		//for replacing used .replace(old,new)
		//
	}

}
