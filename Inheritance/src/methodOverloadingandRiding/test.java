package methodOverloadingandRiding;

public class test {
	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println("parent class method sum="+sum);
	}
	public static void main(String args[]) {
		test tt = new test();
		test1 tt1 = new test1();
		tt.add(5,10);
		tt1.add(10,20);
	}

}

class test1 extends test{
	public static void add(int a, int b) {
		int sum=a+b;
		System.out.println("chaild class method sum="+sum);
	}
}