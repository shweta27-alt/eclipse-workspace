package lecture_basic;

public class reverse_array {
	public static void main(String[] args) {
		int[] arr = {12,23,24,21,55,65,45,2};
		
		//approach 1
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		//approach 2
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverse(int[] arr) {
		int first=0;
		int last=arr.length-1;
		
		while(first<last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
			last--;
		}
	}
}
