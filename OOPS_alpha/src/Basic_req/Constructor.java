package Basic_req;

public class Constructor {
	public static void main(String[] args) {
		
		//for parameterized
		student s1 = new student("shweta");
		System.out.println(s1.name);
		
		//for default
		student s2 = new student();
	}

}

//we can create as many constructor we want 

// constructor overloading- when we create multiple constructor and each one is called 
//when our program look  for which object which constructor we have to call this 
//is constuctor overloading (multiple constructor in single class)
//constructor overloading is an example of polymorphism


class student{
	String name;
	int roll;
	
	//parameterized constructor
	student(String name){
		this.name = name;
	}
	
	
	// default constructor
	student(){
		System.out.println("hello im default constructor");
	}
}
