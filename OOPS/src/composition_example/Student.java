package composition_example;

public class Student {
	private String Name;
	private String RollNo;
	
	public Student(String name, String rollNo) {
		Name = name;
		RollNo = rollNo;
	}

	
	public String getName() {
		return Name;
	}

	public String getRollNo() {
		return RollNo;
	}

	
	

}
