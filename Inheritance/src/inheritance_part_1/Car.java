package inheritance_part_1;

public class Car extends Automobile{
	@Override
	public void movement() {
		System.out.println("here we overridden method automobile");
		super.movement();
		
	}

	private String SteeringWheel;
	private String Moonroof;
	private String BatterySize;
	private String Headlamps;
	private String GroundClearance;
	
	public Car(double topSpeed, String brandName, String yearOfManufacture,
			String cost, double durability,String SteeringWheel,String Moonroof,
			String BatterySize,String Headlamps,String GroundClearance) {
		super(topSpeed,brandName,yearOfManufacture,cost, durability);
		
		this.SteeringWheel= SteeringWheel;
		this.Moonroof = Moonroof;
		this.BatterySize = BatterySize;
		this.Headlamps = Headlamps;
		this.GroundClearance = GroundClearance;
		
	}
	
}
