package Basic;

public class Subarray_having_sum_k { 
	public static void main(String[] args) {
		int[] a = {5,10,30,-10,20,-5};
		int k=15;
		int n = a.length;
		int m=0;
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=a[j];
				
				if(sum==k) {
					m++;
				}
			}
		}
		System.out.println(m);
	}

}
