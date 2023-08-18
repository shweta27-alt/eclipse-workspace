package Arrays;

public class find_frequency_of_ele {
	public static void main(String[] args) {
		int[] arr= {5,8,5,7,8,10};
		int n= arr.length;
		countarr(arr,n);
	}
	
	static void countarr(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int count=0;
			int flag=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					flag = 1;
					break;
				}
			}
			
			if(flag==1)
				continue;
			
			for(int j=0;j<=i;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			System.out.println(arr[i]+": "+count);
		}
	}

}
