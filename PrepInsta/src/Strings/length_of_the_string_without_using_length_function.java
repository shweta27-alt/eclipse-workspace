package Strings;

public class length_of_the_string_without_using_length_function {
	public static void main(String[] args) {
		int length=0;
		String s ="shwetasaindane";
		for(char c:s.toCharArray()) {
			length++;
		}
		System.out.println("the length is " + length);
	}

}
