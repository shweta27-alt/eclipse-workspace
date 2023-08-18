package Thread;

public class Main {
	public static void main(String[] args) {
	System.out.println("this is main method");
	
	Thread secThread = new SecondThread();
	secThread.start();
	System.out.println("new main method");
	}
}
