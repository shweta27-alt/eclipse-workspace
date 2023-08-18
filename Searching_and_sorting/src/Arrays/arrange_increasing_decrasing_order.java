package Arrays;
import java.util.*;

public class arrange_increasing_decrasing_order {
	public static void main(String[] args) {
		int[] a= {1,6,7,2,0,4,9};
		Arrays.sort(a);
		int n = a.length;
		for(int i=0; i<=n/2;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i= n-1;i>=n/2;i--) {
			System.out.println(a[i]+" ");
		}
	}

}
