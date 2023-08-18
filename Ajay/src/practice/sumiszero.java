package practice;
import java.util.*;

public class sumiszero {
	 public static void main(String[] args) {
	      int[] arr = {4, 2, -3, 1, 6};
	       subarray(arr);
	    }
	    
	    static boolean subarray(int[] arr){
	      int sum = 0;
	      Set<Integer> num = new HashSet<Integer>();
	      for(int i=0;i<arr.length;i++){
	          sum+=arr[i];
	          
	          if(sum==0 || num.contains(sum) || arr[i] == 0)
	            return true;
	            
	       num.add(sum);
	      }
	      return false;
	    }
}
