package composition_example;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("Manish","#123");
		Session FinalYear = new Session("2021", student1);
		Floor ThirdFloor = new Floor(3,1000);
		Branch ECE = new Branch("Electronics", new Session("prefinal", new Student("Atulya","#1234")));
		Library APJ = new Library("bestLibrary","2019",10000, ThirdFloor);
		College IITBombay = new College(ECE,"IIT",APJ);
		University IIT = new University (IITBombay , "IIT");
		
		IIT.getCollege().OpeningDate();
		IIT.getCollege().getLibrary().SearchBook();
		IIT.getCollege().getLibrary().getFloor().Cleanthefloor();
	}
	
}
