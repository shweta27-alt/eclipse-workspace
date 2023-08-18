package RecursionAlpha;

public class sum_of_n_natural_no {
	public static void main(String[] args) {
		int n=5;
		System.out.println(sum(n));
	}
	
	public static int sum(int n) {
		if(n==0)
			return 1;
		int fm= sum(n-1);
		int fn = n+sum(n-1);
		return fn;
	}


}
