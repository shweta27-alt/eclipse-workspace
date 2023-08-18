package Arrays;

public class array_subset_of_another_array {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5};
		int m= arr1.length;
		int n = arr2.length;
		if(issubset(arr1,arr2,m,n)) 
			 System.out.print("arr2[] is subset of arr1[] ");
		 else
		     System.out.print("arr2[] is not subset of arr1[] ");
		 
		
	}
	
	static boolean issubset(int[] arr1,int[] arr2, int m, int n) {
		int i, j;
		for( i=0;i<arr1.length;i++) {
			for(j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					break;
	           	}
			 }
			if(j==m) {
				return false;
			}
	     }
	  		
		return true;
	}
}
