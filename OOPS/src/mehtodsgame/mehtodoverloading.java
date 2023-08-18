package mehtodsgame;


public class mehtodoverloading {
	
	void move(int a) {
		System.out.println("number1:" + a);
	}
	
	void move(int a, int b) {
		System.out.println("number1: "+a + " number2:"+ b);
	}
	
	public static void main(String[] args) {
		mehtodoverloading obj = new mehtodoverloading();
		obj.move(4);
		obj.move(5,2);
	}

}
