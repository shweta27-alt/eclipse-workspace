package Arrays;

public class count_even_odd_ele {
	public static void main(String[] args){
		int[] arr= {101,200,301,400,501};
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			even++;
		}
		else
			odd++;
		}
		
		System.out.println("Even element count:" +even);
		System.out.println("Odd element count:" +odd);
	}

}
