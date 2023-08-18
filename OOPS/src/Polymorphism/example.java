package Polymorphism;

class bike{
	void run() {
		System.out.println("running");
	}
}


class splender extends bike{
	void run() {
		System.out.println("running again and again");
	}
}

public class example {
	public static void main(String[] args) {
		bike b = new splender();
		b.run();
		
	}
	
}

















