package RecursionAlpha;

public class fibonacci {
	public static void main(String[] args) {
		int n=15;
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n==1 || n==0)
			return n;
		
		int fn1 = fib(n-1);
		int fn2 = fib(n-2);
		int fn = fn1+fn2;
		return fn;
	}


}
