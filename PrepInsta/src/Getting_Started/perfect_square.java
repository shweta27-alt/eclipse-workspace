package Getting_Started;

public class perfect_square {
	public static void main(String[] args) {
		int x=84;
		if(perfectsquare(x)) {
			System.out.println("perfect square");
		}else {
			System.out.println("not a perfect square");
		}
	}
	
	static boolean perfectsquare(int x) {
		if(x>=0) {
			int sr = (int)Math.sqrt(x);
			return ((sr*sr)==x);
		}
		return false;
	}


}
