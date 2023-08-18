package practice;

public class encap {
	public static void main(String[] args) {
		student s1 = new student();
		s1.setname("Shweta");
		System.out.println(s1.getname());
		
		s1.setrollnumber(5);
		System.out.println(s1.getrollnumber());
	}

}


class student{
	private String name;
	private int rollnumber;
	
	void setname(String name){
		this.name=name;
	}
	
	void setrollnumber(int rollnumber) {
		this.rollnumber=rollnumber;
	}
	
	String getname() {
		return this.name;
	}
	
	int getrollnumber() {
		return this.rollnumber;
	}
}