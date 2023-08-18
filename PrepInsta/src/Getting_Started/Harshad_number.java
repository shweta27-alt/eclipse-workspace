package Getting_Started;

public class Harshad_number {
	public static void main(String[] args) {
		int n = 47;
		int result =0;
		while(n!=0) {
			int last = n%10;
			result = result+ last;
			n=n/10;
		}
		
		if(n%result ==0) {
			System.out.println("harshad no");
		}else {
			System.out.println(" is not harshad no");
		}
	}

}
