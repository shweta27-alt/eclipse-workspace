package Polymorphism;

public class compile {
	
	void show(int n1) {
		System.out.println("number1: "+ n1);
	}
	
	void show(int n1,int n2) {
		System.out.println("number1: "+ n1 + " number 2 :"+ n2);
	}
	
	
	public static void main(String[] args) {
		compile obj = new compile ();
		obj.show(2);
		obj.show(3,5);
	}

}
