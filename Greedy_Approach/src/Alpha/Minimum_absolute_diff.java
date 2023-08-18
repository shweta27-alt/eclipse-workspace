package Alpha;

import java.util.Arrays;

public class Minimum_absolute_diff {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b = {2,1,3};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int mindiff=0;
		
		for(int i=0;i<a.length;i++) {
			mindiff +=Math.abs(a[i]-b[i]);
		}
   System.out.println("Min absolute diff: "+mindiff);
		
	}

}
