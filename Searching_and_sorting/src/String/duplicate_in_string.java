package String;

public class duplicate_in_string {
	static final int no_of_char = 256;
	public static void main(String[] args) {
		String str ="greek";
		printDups(str);
	}

	private static void printDups(String str) {
		
		int count[] = new int[no_of_char];
		fillcharcount(str,count);
		for(int i = 0 ; i<no_of_char;i++) {
			if(count[i]>1)
				System.out.println((char)(i) + ", count=" + count[i]);
		}
		
	}

	private static void fillcharcount(String str, int[] count) {
		for(int i = 0 ; i< str.length(); i++) {
			count[str.charAt(i)]++;
		}
	}

}
