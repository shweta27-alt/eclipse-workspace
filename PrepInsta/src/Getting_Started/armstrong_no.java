package Getting_Started;
import java.util.*;

public class armstrong_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		int num = n;
		int temp = 0,total = 0;
		while(num !=0) {
			temp=num%10;
			total = total+temp*temp*temp;
			num=num/10;
		}
		if(total==n) {
			System.out.println(n+ " is an armstrong no");
		}else {
			System.out.println(n+ " is not an armstrong no");
		}
	}
}
