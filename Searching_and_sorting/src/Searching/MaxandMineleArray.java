package Searching;

public class MaxandMineleArray {
    public static void main(String args[]) {
    	int[] a = {40,20,50,10,60,70};
    	int max = a[0];
    	for(int i=0;i<a.length;i++) {
    		if(max<a[i]) {
    			max=a[i];
    		}
    	}
    	System.out.println("Maximum element in an array: " + max);
    
     int min= a[0];
     for(int i=0;i<a.length;i++) {
    	 if(min> a[i]) {
    		 min=a[i];
    	 }
     }
     System.out.println("minimum element in an array: " + min);
     
}
}