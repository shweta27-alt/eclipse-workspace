package Polymorphism;

class Cricket{
	public String FormatName;
	
	public Cricket(String formatName) {
		formatName=formatName;
	}
	
	public String rule() {
		return "Cricket is an outdoor sport played between two teams of 11 players";
	}
}

class testMatch extends Cricket{
	public testMatch() {
		super("test Match");
	}
	
	public String rule() {
		return "Played for 3 Days, no fixed number of overs for a team";
	}
	
}

class oneDay extends Cricket{
	public oneDay() {
		super("One Day international");
	}
	
	@Override
	public String rule() {
		return "Played for 1 Days, 50  overs per team";
	}
	
}

//class T20 extends Cricket{
//	public T20() {
//		super("T20 international");
//	}
//	 @Override
//	public String rule() {
//		return "Played for 1 Days,30 over per team";
//	}
//	
//}
//
//class IPL extends Cricket{
//	public IPL() {
//		super("IPL international");
//	}
//	 
//	public String rule() {
//		return "Played for 1 Days,30 over per team,but not international";
//	}
//	
//}
//
//class Gully extends Cricket{
//	public Gully() {
//		super("Gully");
//	}
//	 
//}


public class Main {
	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			Cricket cricket = randomMatch();
			System.out.println("format Type"+i+"is"+ cricket.FormatName +".The rule is:"+ cricket.rule());
		}
		
	}
	
	public static Cricket randomMatch() {
		int randomNumber =(int) (Math.random()*2) +1 ;
		System.out.println("the ramdom number is:"+randomNumber);
		switch(randomNumber) {
		 
		case 1:
			return new testMatch();
		
		case 2:
			return new oneDay();
			
//		case 3:
//			return new T20();
//			
//		case 4:
//			return new IPL();
//			
//		case 5:
//			return new Gully();
//			
		default:
			return null;
			
		}
	}
}









