package String;

public class count_vowels_consonants_space_in_string {
	public static void main(String[] args) {
		String str="Take you Forward";
		int length = str.length();
		solve(str, length);
		
		}
	public static void solve(String str, int length) {
		int vowels = 0, consonants = 0 , whitespaces = 0;
		str= str.toLowerCase();
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}else if(ch >= 'a' && ch<='z') {
				consonants++;
			}else if(ch == ' ') {
				whitespaces++;
			}
	}
		System.out.println("vowels: " + vowels);
		System.out.println("consonants: "+ consonants);
		System.out.println("whitesoaces: " + whitespaces);
	}

	
}
