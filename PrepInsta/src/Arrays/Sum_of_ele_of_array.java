package Arrays;

public class Sum_of_ele_of_array {
	public static void main(String[] args) {
		int arr[]= {12,13,1,10,34,10};
		int sum = 0;
		for(int i=0;i< arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("the sum of ele is: " +sum);
	}

}
