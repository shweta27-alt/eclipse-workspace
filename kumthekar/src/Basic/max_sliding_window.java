package Basic;

/*
max sliding window k 
Eg 5, -2, 7, 3, -4
k=2
Now find the subarray of size k having max sum
Here 7, 3 is the subarray having max sum of 10
k=3
Then subarray of 5 -2 7 produces max sum of 10

*/

public class max_sliding_window {
	public static void main(String[] args) {
		int[] arr= {5, -2, 7, 3, -4};
		int k=2;
		int n=arr.length;
	
		
		 if (n < k)
	        {
	           System.out.println("Invalid");
	  
	        }
	      
	        // Compute sum of first window of size k
	        int res = 0;
	        for (int i=0; i<k; i++)
	           res += arr[i];
	      
	        // Compute sums of remaining windows by
	        // removing first element of previous
	        // window and adding last element of
	        // current window.
	        int curr_sum = res;
	        for (int i=k; i<n; i++)
	        {
	           curr_sum += arr[i] - arr[i-k];
	           res = Math.max(res, curr_sum);
	        }
	     System.out.print( res);
	        
	}

}
