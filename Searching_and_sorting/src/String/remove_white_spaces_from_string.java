package String;

public class remove_white_spaces_from_string {
	public static void main(String[] args) {
		String str = "Take you Forward";
		str= str.replaceAll(" ", "");
		System.out.println(str);
	}

}
