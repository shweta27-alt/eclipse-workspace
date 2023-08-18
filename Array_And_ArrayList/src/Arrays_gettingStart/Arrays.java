package Arrays_gettingStart;

public class Arrays {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		
		for(int i=0;i<myarray.length;i++) {
			myarray[i]=i*5;
		}
		
		for(int i=0;i<myarray.length;i++) {
			System.out.println("my element"+i+" is :" +myarray[i]);
		}
	}

}
