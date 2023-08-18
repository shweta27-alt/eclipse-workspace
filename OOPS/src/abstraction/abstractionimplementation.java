package abstraction;

abstract class bike{
	bike(){
		System.out.println("bike is created");
	}
	
	abstract void run();
	
	void geared(){
		System.out.println("gear changed");
	}
}


class honda extends bike{
	void run() {
		System.out.println("running safely");
	}
}

public class abstractionimplementation {
	public static void main(String[] args) {
		bike obj = new honda();
		obj.run();
		obj.geared();
	}

}
