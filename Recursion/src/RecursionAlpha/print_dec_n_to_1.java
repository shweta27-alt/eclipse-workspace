package RecursionAlpha;

public class print_dec_n_to_1 {
	public static void main(String[] args) {
		int n=10;
		printDec(n);
	}
	
	public static void printDec(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.print(n+" ");
		printDec(n-1);
	}

}
