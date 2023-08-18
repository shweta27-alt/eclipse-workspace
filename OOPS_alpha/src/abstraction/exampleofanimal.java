package abstraction;

public class exampleofanimal {
	public static void main(String[] args) {
		horse h = new horse();
		h.eats();
		h.walk();
		
		deer d = new deer();
		d.eats();
		d.walk();
	}

}

abstract class animal{
	void eats() {
		System.out.println("eatingggg");
	}
	
	abstract void walk();
}


class horse extends animal{
	void walk() {
		System.out.println("horse is walking");
	}
}


class deer extends animal{
	void walk() {
		System.out.println("deer is walking");
	}
}