package Basic_to_adv_concept;

public class Power {
	public static void main(String[] args) {
		System.out.println(pow(5,2));
	}
	
	public static int  pow(int x,int n) {
		if(n!=0)
			return x*pow(x,n-1);
		else
			return 1;
	}

}
