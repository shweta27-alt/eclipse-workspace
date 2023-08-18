package practice;

public class allzerotoend {
	
	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	        int counter=0;
	        int n= arr.length;
	        for(int i=0;i<n;i++)
	            if(arr[i] !=0)
	                arr[counter++] = arr[i];
	            
	            
	            while(counter<arr.length)
	                arr[counter++]=0;
	            
	        
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");
	        }
	    }
	    
	

}

