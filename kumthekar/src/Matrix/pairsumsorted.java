package Matrix;

public class pairsumsorted {
	
	    public static void main(String[] args) {
	       int[] arr = {1,2,7,8,10,6,12,4};
	       int sum = 10;
	       int l = 0;
	       int r = arr.length-1;
	       while(l<r){
	           int currsum = arr[l]+arr[r];
	           if(currsum>sum){
	               r--;
	           }else if(sum>currsum){
	               l++;
	           }else if(sum==currsum){
	               System.out.print(arr[l]+" "+ arr[r]);
	           }else{
	               System.out.print("sum not found");
	           }
	       }
	   }
	

}
