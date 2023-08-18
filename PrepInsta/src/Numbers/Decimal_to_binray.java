package Numbers;

public class Decimal_to_binray {
	public static void main(String[] args) {
		bintodec(8);
	}
	
	public static void bintodec(int n) {
		int bin=0;
		int pow=0;
		while(n>0) {
			int res=n%2;
			bin = bin + (res*(int)Math.pow(10, pow));
			pow++;
			n=n/2;
			 
		}
		System.out.println(bin);
	}

}
