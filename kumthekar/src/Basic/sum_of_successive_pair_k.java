package Basic;

public class sum_of_successive_pair_k {
	public static void main(String[] args) {
		int[] arr = {5,3,2,6,4,4,11,22,10,-2};
		int k=8;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]+arr[i+1]==k) {
				System.out.println(arr[i]+","+arr[i+1]);
			}
		}
		
	}

}
