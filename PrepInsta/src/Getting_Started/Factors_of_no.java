package Getting_Started;
import java.util.*;

public class Factors_of_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		int num=0;
		int m=0;
		for(int i = 1;i<=n;i++) {
		    if(n%i==0) {
			System.out.println(i);
		    }
		}
	}

}
