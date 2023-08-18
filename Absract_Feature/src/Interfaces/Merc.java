package Interfaces;

public class Merc implements ICar{
	
	private String yearOfBuilt;
	private boolean engineon = false;
	

	public Merc(String yearOfBuilt, boolean engineon) {
		this.yearOfBuilt = yearOfBuilt;
		this.engineon = engineon;
	}

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engineOnorOff() {
		if(engineon == true) {
			System.out.println("the engine is now on for Merc");
			} else {
				System.out.println("the engine if off for Merc");
			}
		
	}

	@Override
	public void seatQuality() {
		// TODO Auto-generated method stub
		
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
