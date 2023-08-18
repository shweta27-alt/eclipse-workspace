package Strings;

public class character_is_alphabet_or_not {
	public static void main(String[] args) {
		char ch='9';
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println(ch+" is a alphabet");
		}else {
			System.out.println(ch+" is not a alphabet");
		}
	}

}
