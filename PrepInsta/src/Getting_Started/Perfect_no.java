package Getting_Started;
// divisior chi sum is equal to actual no
public class Perfect_no {
	public static void main(String[] args) {
		int num = 28, sum=0, i=1;
		while(i< num) {
			if(num%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==num)
			System.out.println(num+" is perfect no");
		else
			System.out.println(num+" is not perfect no");
		
	}

}
