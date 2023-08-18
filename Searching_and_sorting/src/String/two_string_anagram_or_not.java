package String;
import java.util.*;

public class two_string_anagram_or_not {
	public static void main(String[] args) {
		String str1 = "CAT";
		String str2 = "ACT";
		System.out.println(checkanagram(str1, str2));
	}
	public static String SortString(String str) {
		char c[] = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static boolean checkanagram(String str1, String str2) {
		// first here we check length
		if(str1.length()!= str2.length())
			return false;
	
		str1 = SortString(str1);
		str2 = SortString(str2);
		
		// here we are checking are their charters are equal or not
		for(int i = 0 ; i< str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i))
				return false;
			
		}
		return true;
	}

}
