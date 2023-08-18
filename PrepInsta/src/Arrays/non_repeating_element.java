package Arrays;
import java.util.*;

public class non_repeating_element {
	public static void main(String[] args) {
		int[] arr = {19,30,47,28,48,28,30,50,60};
		int n = arr.length;
		nonrepeatingele(arr,n);
	}
	
	static void nonrepeatingele(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		for(int i = 0; i<n;i++) {
			if(visited[i]==true)
				continue;
			
			
		int count=1;
		for(int j = i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				visited[j]=true;
				count++;
				
			}
			}
		
		if(count==1)
			System.out.println(arr[i]+" ");
		}
	}

}
