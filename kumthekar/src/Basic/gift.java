package Basic;
import java.util.*;

public class gift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int gift= sc.nextInt();
		int p1=sc.nextInt();
		int p2= sc.nextInt();
		
		if(Math.abs(gift-p1)<= Math.abs(gift-p2)) {
			System.out.println("the gift is given to p1");
		}else {
			System.out.println("the gift is given to p2");
		}
		
	}

}
