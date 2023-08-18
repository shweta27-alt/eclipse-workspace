package inheritance_part_1;

public class Main {
	public static void main(String[] args) {
		Automobile auto = new Automobile(200,"Rangerover","2018", "2000000", 10);
		
		Car car = new Car(150,"audi","10","2000000",10,"yes","yes","10000kwatt","yes","1.5inch");
		 
		
		auto.movement();
		car.movement();
	}

}
