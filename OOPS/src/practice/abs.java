package practice;

public class abs {
	public static void main(String[] args) {
		horse h = new horse();
		h.eat();
		h.walk();
		
		mammal m = new mammal();
		m.eat();
		m.walk();
	}

}


abstract class annimal{
	void eat() {
		System.out.println("eatinggggggggggggggggg");
		}
	
	abstract void walk();
}

class mammal extends annimal{
	void walk() {
		System.out.println("yes mammal is walking");
	}
}

class horse extends annimal{
	void walk() {
		System.out.println("horse is walkinggg");
	}
}
