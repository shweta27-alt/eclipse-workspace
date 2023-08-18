package Arrays;

public class calculate_sum_of_ele_array {
	public static void main(String[] args) {
		int sum=0;
		int[] a = {1,6,3,9,4,7};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
