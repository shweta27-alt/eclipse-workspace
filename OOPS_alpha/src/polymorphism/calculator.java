package polymorphism;

//compile time polymorphism
//function overloading

public class calculator {
	int sum(int a, int b) {
		return a+b;
	}
	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		calculator cal = new calculator();
		System.out.println(cal.sum(1,2));
		System.out.println(cal.sum(1,2,3));
		 
	}

}

