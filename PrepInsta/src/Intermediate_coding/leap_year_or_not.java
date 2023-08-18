package Intermediate_coding;

public class leap_year_or_not {
	public static void main(String[] args) {
		int year=2002;
		if(year%400==0) {
			System.out.println("Leap year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a Leap year");
		}
	}

}
