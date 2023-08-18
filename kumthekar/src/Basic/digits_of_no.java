package Basic;

public class digits_of_no {
	public static void main(String[] args) {
		int num=187;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			System.out.print(rem+" ");
			num = num/10;
			
		}
		
	}

}
