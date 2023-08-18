package Basic_to_adv_concept;

public class Fibonacci_series {
	public static void mian(String[] args) {
		System.out.println();
	}
	
	public static void fibo(int n,int Fno,int Sno) {
		for(int i=0;i<=n;i++) {
		int Tno=Fno+Sno;
		Fno=Sno;
		Sno=Tno;
		}
		
	
	}

}
