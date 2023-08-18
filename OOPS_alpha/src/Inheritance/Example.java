package Inheritance;

public class Example {
	public static void main(String[] args) {
		fish fi = new fish();
		fi.eat();
	}

}

class animals{
	String color;
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}

class fish extends animals{
	String fins;
	
	void swim() {
		System.out.println("swims");
	}
}
