package Alpha_heap;
import java.util.*;

public class implementation {
	static class Heap{
		ArrayList<Integer> arr = new ArrayList<>();
		
		public void add(int data) {
			arr.add(data);
			
			int x = arr.size()-1;
			int par = (x-1)/2;
			
			while(arr.get(x)<arr.get(par)) {
				//swap
				int temp = arr.get(x);
				arr.set(x, arr.get(par));
				arr.set(par, temp);
				
				x=par;
				par=(x-1)/2;
			}
		}
		
		
		
		public int peek() {
			return arr.get(0);
		}
		
		//for deletion we swap first and last then delete the last and call heapify
		public int delete() {
			int data = arr.get(0);
			
			// step1-swap first and last
			int temp = arr.get(0);
			arr.set(0, arr.get(arr.size()-1));
			arr.set(arr.size()-1,temp);
			
			//step2: delete last
			arr.remove(arr.size()-1);
			
			//step3: heapify
			heapify(0);
			return data;
		}
		
		public void heapify(int i) {
			int left = 2*i+1;
			int right = 2*i+2;
			int minidx = i;
			
			if(left<arr.size() && arr.get(minidx)> arr.get(left)) {
				minidx= left;
			}
			
			if(right<arr.size() && arr.get(minidx)> arr.get(right)) {
				minidx= right;
			}
				
			if(minidx !=i) {
				//swap
				int temp = arr.get(i);
				arr.set(i, arr.get(minidx));
				arr.set(minidx, temp);
				
				heapify(minidx);
			}
		}
		
		public static void main(String[] args) {
			Heap h = new Heap();
			h.add(3);
			h.add(5);
			h.add(6);
			h.add(1);
			h.add(2);
			
			
			while(!h.isEmpty()) {
				System.out.println(h.peek());
				h.delete();
			}
		}



		private boolean isEmpty() {
			// TODO Auto-generated method stub
			return arr.size()==0;
		}
	}

}















