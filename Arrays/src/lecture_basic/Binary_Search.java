package lecture_basic;
// it is work on the sorted array
//just like dictionary
//TC=log(n)
public class Binary_Search {
	public static void main(String[] args) {
		int[] num= {1,3,4,6,7,8,9,10,25};
		int key=9;
		System.out.println("the index is: "+binarsearch(num,key));
	}
	
	public static int binarsearch(int[]num, int key) {
		int start=0;
		int end=num.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(num[mid]==key) {
				return mid;
			}
			if(num[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}

}
