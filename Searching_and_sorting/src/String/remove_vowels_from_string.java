package String;

public class remove_vowels_from_string {
	public static void main(String[] args) {
		String str = "take u forward";
		str= str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str);
	}

}
