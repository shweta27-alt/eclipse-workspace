package String;

public class sum_of_number {
	public static void main(String[] args) {
		String str = "1bc268";
		System.out.println(findsum(str));
	}
	static int findsum(String str) {
		String temp="0";
		int sum = 0;
		for(int i = 0 ; i<str.length();i++) {
			char s = str.charAt(i);
			if(Character.isDigit(s))
				temp += s;
			
			else {
				sum +=Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

}
