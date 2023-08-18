package inheritancepractice;

public class car extends auto{
	
	private String SteeringWheel;
	private String Moonroof;
	
	public car(String brand, double cost,String SteeringWheel,String Moonroof) {
		super(brand, cost);
		// TODO Auto-generated constructor stub
		this.SteeringWheel=SteeringWheel;
		this.Moonroof=Moonroof;
		
	}

	public void movement() {
		
		System.out.println("hello im shweta");
		super.movement();
	}

	
}
