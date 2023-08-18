 package Arrays;

public class count_frequency_each_ele_array {
	public static void main(String[] args) {
		int[] arr = { 3,1,4,5,6,4,3};
		int n = arr.length;
		constFreq(arr,n);
		}
	
	public static void constFreq(int arr[], int n) 
	{
		boolean[] visited = new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(visited[i]== true)
				continue;
			//for count
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			
			System.out.println(arr[i]+" "+count);
		}
	}
  
}
