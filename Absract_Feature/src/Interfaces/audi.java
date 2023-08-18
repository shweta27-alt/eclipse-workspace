package Interfaces;

public class audi implements ICar{
	
	private String yearOfBuilt;
	private boolean engineon = false;
	

	public audi(String yearOfBuilt, boolean engineon) {
		this.yearOfBuilt = yearOfBuilt;
		this.engineon = engineon;
	}

	@Override
	public void noOfWheels() {
		System.out.println("It has 4 wheels and a stepknee, of the brand MRF");
		
	}

	@Override
	public void engineOnorOff() {
		if(engineon == true) {
		System.out.println("the engine is now on");
		} else {
			System.out.println("the engine if off");
		}
		
	}

	@Override
	public void seatQuality() {
		System.out.println("it has black seat");
		
		
	}

	@Override
	public void steeringWheel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fuelTankSize() {
		// TODO Auto-generated method stub
		
	}

}