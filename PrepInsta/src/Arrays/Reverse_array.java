package Arrays;

public class Reverse_array {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int len = arr.length;
		for(int i = len-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
