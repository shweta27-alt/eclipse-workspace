package Basic;
import java.util.*;
//1) given denominations 10, 20, 50, 100, 200, 500, 2000
//And value k find the least no of notes to make up the sum of k 

public class Notes_sum {
	public static void main(String[] args) {
       Integer[] coins = {1,2,5,10,20,100,200,500,2000};
		
		Arrays.sort(coins, Comparator.reverseOrder());
		
		int countofcoin = 0;
		int k=450;
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<coins.length;i++) {
			while(coins[i] <= k) {
				if(coins[i] <= k) {
					countofcoin++;
					ans.add(coins[i]);
					k-=coins[i];
				}
			}
		}
		
		System.out.println("total min coins=  "+ countofcoin);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+ " ");
		}
		System.out.println();
	}

}
