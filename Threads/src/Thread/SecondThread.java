package Thread;

public class SecondThread extends Thread {
	
	public void run() {
		System.out.println("This is sub thread"+currentThread().getName());
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("interrupted by another thread");
		}
		
		System.out.println("5 sec have passed");
	}

	

}
