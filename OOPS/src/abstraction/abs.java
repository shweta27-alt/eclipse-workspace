package abstraction;

abstract class bikey{
	bikey() {
		System.out.println("bike is created");
	}
	
	abstract void run();
	
	void speed() {
		System.out.println("speed is high");
	}
	
}


class hunda extends bikey{
	void run() {
		System.out.println("Im running");
	}
}

public class abs {
	public static void main(String[] args) {
		bikey obj = new hunda();
		obj.run();
		obj.speed();
	}

}
