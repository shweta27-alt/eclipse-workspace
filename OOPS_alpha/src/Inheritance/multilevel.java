package Inheritance;

public class multilevel {
	public static void main(String[] args) {
		rangerover mp = new rangerover();
		mp.run();
		mp.gear= "4";
		System.out.println(mp.gear);
	}

}

class vehicles{
	String wheels;
	
	void run() {
		System.out.println("runs fast");
	}
	
	void seats() {
		System.out.println("4 seats");
	}
}

class automobile extends vehicles{
	String gear;
}

class rangerover extends automobile{
	String autodriving;
}