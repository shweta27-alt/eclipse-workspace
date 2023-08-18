package practice;

public class runtime {
	public static void main(String[] args) {
		animal d1 = new Deer();
		d1.eat();
	}

}

class animal {
	void eat(){
		System.out.println("meowww");
	}
}


class Deer extends animal{
	void eat() {
		System.out.println("bhuu bhuuu");
	}
}