package Arrays_gettingStart;

public class Floor_of_x {
	public static void main(String[] args) {
		int[] arr = {1,2,8,10,10,12,19};
		int n = arr.length;
		int x=5;
//		for(int i=1;i<arr.length;i++) {
//		
//			if(arr[i]<x) {
//				System.out.println(arr[i]);
//			}
//		}
		
		int ind = floorsearch(arr,n-1,x);
		if(ind ==-1)
			System.out.println("Floor of "+x+" doesnot exist in array");
		
		else
			System.out.println("floor of "+ x +" is "+arr[ind] );
			
	}
	
	static int floorsearch(int arr[],int n, int x) {
		if(x>=arr[n-1])
			return n-1;
		if(x<arr[0])
			return -1;
		for(int i=1;i<n;i++)
			if(arr[i]>x)
				return(i-1);
		return -1;
	}

}
 