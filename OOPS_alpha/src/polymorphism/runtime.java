package polymorphism;
// runtime polymorphism
// when we call the child class object it will print child class
public class runtime {
	public static void main(String[] args) {
		Deer dp = new Deer();
		dp.eat();
	}

}

class animal{
	void eat() {
		System.out.println("eats anything");
	}
}

class Deer extends animal{
	void eat() {
		System.out.println("eats grass");
	}
}