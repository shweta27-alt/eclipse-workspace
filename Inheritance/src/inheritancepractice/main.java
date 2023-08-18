package inheritancepractice;

public class main {
	public static void main(String[] args) {
		car car = new car("mahindra",1299,"circular", "openroof");
		auto auto = new auto("honda",10485098);
		
		auto.movement();
		car.movement();
	}

}
