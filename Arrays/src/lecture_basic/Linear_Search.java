package lecture_basic;

public class Linear_Search {
	public static void main(String[] args) {
		int[] arr = {12,23,24,21,55,65,45,2};
		int key=65;
		int index=linearSearch( arr, key);
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("key is found at "+index);
		}
	}

	public static int linearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
