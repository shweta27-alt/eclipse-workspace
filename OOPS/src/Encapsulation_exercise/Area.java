package Encapsulation_exercise;

public class Area {
	private double radius;
	private double constant;
	
	public Area(double radius, double constant) {
		this.radius = radius;
		this.constant = constant;
	}
	
	public void areaofcircle(double area) {
		System.out.println(radius*radius* Math.PI);
	}
	
}
