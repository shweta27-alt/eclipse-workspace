package staticVSinstance;

public class static_VS_nonstatic {
	
	public static void print() {
		System.out.println("hellooooo,I'm static");
	}
	
	public void display() {
		System.out.println("non-static");
	}
	
	public static void main(String[] args) {
		print();
		static_VS_nonstatic prac = new static_VS_nonstatic();
		prac.display();
	}

}


//static variable
// static method
// composition
//aggregation
//threads
