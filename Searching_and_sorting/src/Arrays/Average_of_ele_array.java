package Arrays;

public class Average_of_ele_array {
	public static void main(String[] args) {
		int[] arr= {3,2,3,5,6};
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		sum=sum/arr.length;
		System.out.println(sum);
	}

}
