package LInkedHashSet;
import java.util.*;

public class Main {
	//value asta fkt
	public static void main(String[] args) {
		LinkedHashSet<String> value = new LinkedHashSet<String>();
		
		value.add("head");
		value.add("fuck");
		value.add("off");
		value.add("happy");
		
		Iterator<String> it = value.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
