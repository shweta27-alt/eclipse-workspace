package String;

public class capitalize_first_and_last_character_in_string {
	public static void main(String[] args) {
		String str = "take u forward is awesome";
		int size = str.length();
		System.out.println(Capatilize(str,size));
				
	}
	public static String Capatilize(String str, int size) {
		StringBuffer sb = new StringBuffer(str);
		for(int i = 0; i<size ; i++) {
			if(i==0 || i == (size-1) && (int) str.charAt(i)>=97) {
				sb.setCharAt(i,(char)((int) str.charAt(i)-32));
			}
			else if(str.charAt(i)==' ') {
				if((int) str.charAt(i-1-32)>=65){
						sb.setCharAt(i-1,(char)((int) str.charAt(i-1)-32));
				}
				 if (((int) str.charAt(i + 1) - 32) >= 65) // Already not an uppercase letter
			          sb.setCharAt(i + 1, (char)((int) str.charAt(i + 1) - 32));
			}
		}
		return sb.toString();
	}

}
