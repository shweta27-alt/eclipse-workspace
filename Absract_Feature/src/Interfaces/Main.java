package Interfaces;

public class Main {
	public static void main(String[] args) {
		ICar mynewCar;
		mynewCar = new audi("2020",false);
		mynewCar.engineOnorOff();
		mynewCar.seatQuality();
		
		mynewCar = new audi("2021",true);
		mynewCar.engineOnorOff();
		
		mynewCar = new Merc("2022",false);
		mynewCar.engineOnorOff();
	}

}
