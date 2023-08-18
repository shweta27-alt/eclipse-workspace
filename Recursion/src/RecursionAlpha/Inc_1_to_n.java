package RecursionAlpha;

public class Inc_1_to_n {
	public static void main(String[] args) {
		printInc(10);
	}
	
	public static void printInc(int n) {
		if(n==1) {
			System.out.println(n+" ");
			return;
		}
		
		printInc(n-1);
		System.out.println(n+" ");
	}

}
