package swapfynd;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;

public class most_occuring_character {
	public static void main(String[] args) {
		
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter no");
	   String n = sc.nextLine();
	   HashMap<Character,Integer> in = new HashMap<>();
	   
	   for(int i=0;i<n.length();i++) {
		   char ch = n.charAt(i);
		   if(in.containsKey(ch)) {
			   int of=in.get(ch);
			   int nf= of+1;
			   in.put(ch, nf);	   
		   }else {
			   in.put(ch, 1);
		   }
	   }
	   
	   char mfc = n.charAt(0);
	   for(Character Key: in.keySet()) {
		   if(in.get(Key)>in.get(mfc)) {
			   mfc=Key;
		   }
	   }
	   System.out.println(mfc);
	}

}
