package Abstract_Classes;

public abstract class Bird extends Animal{
	public Bird(String name) {
		super(name);
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		
		System.out.println("less height");
		
	}

	@Override
	public void lifeSpan() {
		// TODO Auto-generated method stub
		System.out.println("no lifeSpan");
		
	}
	
	
	public void fly() {
	System.out.println("sparrow fly");

}
}
