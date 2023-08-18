package Getting_Started;
import java.util.*;

public class armstrong_no_in_given_range {
	public static void main(String[] args) { 
	int n1,n2,last=0,total=0,n=0,rem=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter a first no");
	n1=s.nextInt();
	System.out.println("enter a second no");
	n2= s.nextInt();
	for(int i= n1; i<n2-1;i++){
	rem=n%10;
	last=last+(rem*rem*rem);
	n=n/10;
	}
	if(total==last){
	System.out.println(last);
	}
	}

}
