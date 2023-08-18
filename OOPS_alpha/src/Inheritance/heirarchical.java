package Inheritance;

public class heirarchical {
	public static void main(String[] args) {
		birds parrot = new birds();
		birds.eat();
		
		fishe rohu = new fishe();
		fishe.breathe();
		
	}

}

class animal{
	String color;
	
	static void eat() {
		System.out.println("eats");
	}
	
	static void breathe() {
		System.out.println("breathes");
	}
}



class fishe extends animal{
	String fins;
	
	void swim() {
		System.out.println("swims");
	}
}



class mammals extends animal{
	
	void walks() {
		System.out.println("walkinggggg");
	}
}



class birds extends animal{
	
	void fly() {
		System.out.println("flying");
	}
}