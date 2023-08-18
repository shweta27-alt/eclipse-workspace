package Arrays;

public class smallest_largest_ele {
	public static void main(String[] args) {
		int[] arr = {12, 56, 45, 34,30};
		int min = arr[0];
		int max= arr[0];
		for(int i=1;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
        else if(min>arr[i]){
			min=arr[i];
		}
		} 
		System.out.println("the largest ele is"+ max);
		System.out.println("the smallest ele is"+ min);
	}

}
