package Getting_Started;
import java.util.*;

public class power_of_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base no");
		int n = sc.nextInt();
		System.out.println("enter the expo no");
		int num=sc.nextInt();
		int m= (int) Math.pow(n, num);
		System.out.println(m);
	}

}
