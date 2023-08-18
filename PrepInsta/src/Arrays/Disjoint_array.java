package Arrays;


// disjoint - no element is common between two array

public class Disjoint_array {
	public static void main(String[] args) {
		int[] arr1 = {4,33,2,6,44,77};
		int[] arr2 = {46,76,33,99,65};
		if(Disjoint(arr1,arr2))
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	static boolean Disjoint(int arr1[], int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
