package InnerClass;

public class Quad {
	public int a;
	public int b;
	public int c;
	public double d;
	
	public Quad(int a, int b, int c,double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
//	
//	public void displayOuter() {
//		System.out.println("the value of d is"+e);
//		System.out.println("the value of d is"+a);
//	}
	
	
	
	public class Disc{
 // public void cal() {
//			double x1=(-b + Math.sqrt(d)/(2*a));
//			double x2=(-b - Math.sqrt(d)/(2*a));
//			System.out.println("the +ve root is:"+x1);
//			System.out.println("the -ve root is:"+x2);
//		}
		private int d=15;
		public void display() {
			System.out.println("the value of d is"+d);
			System.out.println("the value of d is"+a);
		}
	
	}

}
