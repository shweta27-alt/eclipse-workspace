package Getting_Started;
import java.util.*;

public class palindrome {
	public static void mian(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the no");
		int n = sc.nextInt();
		int org=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(rev==org) {
			System.out.println("no is palindrome");
		}else {
			System.out.println("no is not a palindrome no");
		}
	}

}
