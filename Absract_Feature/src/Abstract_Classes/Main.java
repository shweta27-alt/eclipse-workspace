package Abstract_Classes;

public class Main {
	public static void main(String[] args) {
	Elephant ele = new Elephant("tom");
	ele.height();
	ele.lifeSpan();
	
	//before making bird class abstract
    Sparrow bird = new Sparrow("hello");
	bird.height();
	bird.lifeSpan();
	bird.fly();
	
	//Sparrow bird = new Sparrow("hello")
    // bird.height();
	//bird.lifeSpan();
	
	Emu emu = new Emu("harry");
	emu.getName();
	emu.lifeSpan();
	
	
	}
}
