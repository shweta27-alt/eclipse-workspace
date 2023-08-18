package Getting_Started;

public class automorphic_number {
	public static void main(String[] args) {
		int n= 5;
		int sq = n*n;
		if(isautomorphic(n)==1) {
			System.out.println(n+ " is the no " + sq+" is automorphic");
		}else {
			System.out.println("not automorphic no");
		}
	}
		
		static int isautomorphic(int n) {
			int square = n*n;
			while(n!=0) {
				if(n%10 != square%10) {
					return 0;
				}
				
				n/=10;
				square/=10;
			}
			return 1;
		}

}
