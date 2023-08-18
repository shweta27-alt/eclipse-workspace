package Basic_to_adv_concept;
import java.util.*;

public class Factorical {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no: ");
//		int n=sc.nextInt();
//		int fact=1;
//		for(int i=1;i <= n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n) {
		if(n>1)
			return n* factorial(n-1);
		else 
			return 1;
	}
}
