package String;
import java.util.*;

public class print_all_subsequence_of_string {
	 static List<String> al = new ArrayList<>();
	 
	 public static void main(String[] args) {
		 String s = "abcde";
		 findsubsequence(s," ");
		 System.out.println(al);
	 }
	 
	 private static void findsubsequence(String s, String ans) {
		 if(s.length()== 0) {
			 al.add(ans);
			 return;
		 }
		 findsubsequence(s.substring(1), ans + s.charAt(0));
		 
		 findsubsequence(s.substring(1), ans);
	 }
	}


