package Getting_Started;

// 145 = 1!+4!+5!

public class String_number {
	public static void main(String[] args) {
		int num = 145;
		if(detectstrong(num))
			System.out.println(num+" is strong");
		else
			System.out.println(num+ " is not strong no");
	}
	
	static int facto(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	static boolean detectstrong(int num) {
		int digit,sum=0;
		int temp = num;
		boolean flag = false;
		
		while(temp!=0) {
			digit = temp%10;
			sum = sum+facto(digit);
			temp/=10;
		}
		if(sum==num)
			flag=true;
		else
			flag=false;
		
		return flag;
		
	}

}
