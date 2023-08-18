package inheritance_part_1;

public class Automobile {
	private double topSpeed;
	private String BrandName;
	private String YearOfManufacture;
	private String Cost;
	private double Durability;
	public Automobile(double topSpeed, String brandName, String yearOfManufacture, String cost, double durability) {
	//	super();
		this.topSpeed = topSpeed;
		BrandName = brandName;
		YearOfManufacture = yearOfManufacture;
		Cost = cost;
		Durability = durability;
	}
	
	public void movement() {
		System.out.println("this is method under automobile");
	}
}
