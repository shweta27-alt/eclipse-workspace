package Student;

public class StudentInfo {
	private String StuName;
	private String StuRollNo;
	private String Std;
	private String Section;
	
	public StudentInfo(){
		this("DefName","455","4th","B");
		System.out.println("this is Default Constructor");
	}

	public StudentInfo(String StuName, String StuRollNo, String Std, String Section) {
		this.StuName = StuName;
		this.StuRollNo=StuRollNo;
		this.Std=Std;
		this.Section=Section;
		System.out.println("constructor called");
	}
	
	public String getStuName(String StuName) {
		return StuName;
	}
	
	public String getStuRollNo(String StuRollNo) {
		return StuRollNo;
	}
	
	public String getStd(String Std) {
		return Std;
	}
	
	public String getSection(String Section) {
		return Section;
	}

}
