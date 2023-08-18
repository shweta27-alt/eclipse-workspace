package Getting_Started;
import java.util.*;

public class factorial_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
