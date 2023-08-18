package Basic_req;
//copy constructor we use when we want to take the values from obj1 to obj2
public class copy_constructor {
public static void main(String[] args) {
		
		student1 s1 = new student1();
		s1.name = "shweta";
		s1.roll = 4658;
		//s1.password="dsjhx";
		s1.marks[0]=3742;
		s1.marks[1]=8375;
		
		student s2 = new student1(s1);
		//s2.password="ewgr";
		s2.marks[1]=6;
		for(int i=0;i<2;i++) {
			System.out.println(s2.marks[i]);
		}
	}
}


class student1{
	String name;
	int roll;
	//String password;
	int marks[];
	
	//shallow copy constructor-whatever changes made get reflect
	
//	student(student s1){
//		marks= new int[2];
//		this.name = s1.name;
//		this.roll = s1.roll;
//	//	this.password=password;
//		this.marks=s1.marks;
//	}
//	
	
	
	//deep copy constructor-here we get unchange values
	student(student s1){
		marks= new int[2];
		this.name = s1.name;
		this.roll = s1.roll;
		for(int i=0;i<marks.length;i++) {
			this.marks[i]=s1.marks[i];
		}
	}

	student(){
		System.out.println("hello im default constructor");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
