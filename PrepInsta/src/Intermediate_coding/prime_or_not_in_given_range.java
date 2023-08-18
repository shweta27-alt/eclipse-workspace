package Intermediate_coding;

import java.util.Scanner;

public class prime_or_not_in_given_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first range:");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second range:");
		int n2 = sc.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}

	 static boolean isprime(int n) {
		if(n<=1)
			return false;
		
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		
		for(int i=3;i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}

}
