package String;


public class calculate_frequency_of_character_in_string {
	public static void main(String[] args) {
		String str = "takeyouforward";
		charCount(str);
	}
	public static void charCount(String str) {
		int[] freq = new int[26];
		for(int i = 0 ; i< str.length(); i++) {
			freq[str.charAt(i)-'a']++;
		}
		for(int i = 0 ; i < 26; i++) {
			if(freq[i] != 0) {
				System.out.print((char)(i + 'a'));
		        System.out.print(freq[i] + " ");
			}
		}
	}

}
