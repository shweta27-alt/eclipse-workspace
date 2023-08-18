package Hashset;

public class Mainstudent {
	public static void main(String[] args) {
		Student s1 = new Student("A","1");
		Student s2 = new Student("A","1");
		Student s3 = new Student("B","2");
		Student s4 = s1;
		
		System.out.println(s1.equals(s2)); //f
		System.out.println(s1.equals(s4)); //t
		System.out.println(s1.equals(s3)); //f
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
