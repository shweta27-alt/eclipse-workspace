package composition_example;

public class College {
	private Branch branch;
	private String CollegeName;
	private Library library;
	
	public College(Branch branch, String collegeName, Library library) {
		this.branch = branch;
		CollegeName = collegeName;
		this.library = library;
	}

	public Branch getBranch() {
		return branch;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public Library getLibrary() {
		return library;
	}
	
	public void OpeningDate() {
		System.out.println("The opening date is: 20thJan");
	}
	

}
