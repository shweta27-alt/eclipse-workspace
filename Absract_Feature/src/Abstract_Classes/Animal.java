package Abstract_Classes;

public abstract class Animal {
	public String Name;

	public Animal(String name) {
		Name = name;
	}
	
	public abstract void height();
	public abstract void lifeSpan();

	public String getName() {
		return Name;
	}
	
	
	

}
