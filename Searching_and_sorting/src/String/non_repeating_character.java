package String;

public class non_repeating_character {
	public static void main(String[] args) {
		String str = "google";
		int n = str.length();
		printFrequency(str,n);
	}
	
	static void printFrequency(String str, int n){
		int count[] = new int[200];
		char s[] = str.toCharArray();
		for(int i = 0; i< n; i++) {
			if(str.charAt(i)==' ')
				continue;
			else
				count[(int)str.charAt(i)]++;
		}
		
		for(int i = 0; i < n; i++) {
			if(count[(int) str.charAt(i)]==1 && s[i]!=' ') {
				System.out.print(s[i]+ " ");
			}
		}
	}

}
