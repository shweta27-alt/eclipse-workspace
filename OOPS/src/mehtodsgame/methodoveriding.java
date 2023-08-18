package mehtodsgame;

class bike{
	public void rule() {
		System.out.println("helooo");
	}
}

class splender extends bike{
	public void rule() {
		System.out.println("I'm splender");
	}
}

public class methodoveriding {
	
	public static void main(String[] args) {
		bike b = new splender();
		b.rule();
	}

}
