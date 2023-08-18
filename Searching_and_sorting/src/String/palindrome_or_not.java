package String;
import java.util.*;

public class palindrome_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String n= sc.next();
		String org = n;
		int len = n.length();
		String rev = "";
		
		for(int i =len-1; i>=0;i-- ) {
			rev = rev+ n.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
