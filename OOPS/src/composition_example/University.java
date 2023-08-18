package composition_example;

public class University {
	private College college;
	private String Name;
	public University(College college, String name) {
		this.college = college;
		Name = name;
	}
	public College getCollege() {
		return college;
	}
	public String getName() {
		return Name;
	}
	
	

}
