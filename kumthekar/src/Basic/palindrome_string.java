package Basic;

public class palindrome_string {
	public static void main(String[] args) {
		String str = "ABBA";
		
		//1st approach
//		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev+str.charAt(i);
//		}
//		if(str.equals(rev)) {
//			System.out.println("Yes it is palindrome");
//		}else {
//			System.out.println("Not a palindrome");
//		}
		
		//2nd approach
		for(int i=1;i<(str.length())/2;i++) {
			if(str.charAt(i)!= str.charAt(str.length()-1)) {
				System.out.println(" Yes, it is palindrome");
			}else {
				System.out.println("not a palindrome");
			}
		}
		
	}

}