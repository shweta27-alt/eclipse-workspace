package String;

public class check_string_is_rotation_of_other_string {
	public static void main(String[] args) {
		String str1 = "ABACD";
		String str2 = "CDABA";
		if( multiplication(str1,str2)) {
			System.out.println("strings are in rotation");
		}
		else {
			System.out.println("strings are not in rotation");
		}
		
	}

	static boolean multiplication(String str1, String str2) {
		// TODO Auto-generated method stub
		return (str1.length() == str2.length()) && ((str1+str1).indexOf(str2)!=-1);
	}

}

//Example:                 
//    str1 = "ABACD"
//    str2 = "CDABA"
//
//temp = str1.str1 = "ABACDABACD"
//Since str2 is a substring of temp, str1 and str2 are 
//rotations of each other.
