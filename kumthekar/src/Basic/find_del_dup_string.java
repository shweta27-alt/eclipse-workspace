package Basic;

import java.util.HashMap;
import java.util.HashSet;

public class find_del_dup_string {
	public static void main(String[] args) {
		String str = "shwetasaindane";
        deldup(str);
	}
	
	static void deldup(String str) {
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for(Character ch : set) {
			System.out.print(ch);
		}
	}

}