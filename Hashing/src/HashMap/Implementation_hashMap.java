package HashMap;
import java.util.*;
import java.util.HashMap;

public class Implementation_hashMap {
	public static int n = 0;
	public static final double N = 0;


	public static void main(String[] args) {
		//create
				HashMap<String, Integer> hm = new HashMap<>();
				
				//Insert
				hm.put("India", 100);
				hm.put("China", 150);
				hm.put("Canada",200);
				hm.put("paris", 50);
				
				ArrayList<String> keys = hm.keySet();
				for(String key: keys) {
				System.out.println(key);
				}
	}


	public V value;
	 
	
	static class HashMap<K,V>{
	
	public class Node{
		K key;
		V value;
		
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private int size;
	private int arr[];
	private LinkedList<Node> buckets[];
	public HashMap() {
		this.size = 0;
		this.buckets = new LinkedList[4];
		for(int i=0;i<4;i++) {
			this.buckets[i] = new LinkedList<>();
		}
	}
	
	private int hashFunction(K key) {
		int hc = key.hashCode();
		return Math.abs(hc)%size;
	}
	
	
	private int SearchInLL(K key, int bi) {
		LinkedList<Node> ll =buckets[bi];
		int di=0;
		
		for(int i=0;i<ll.size();i++) {
			Node node = ll.get(i);
			if(node.key == key) {
				return di;
			}
			di++;
		}
		return -1;
	}
	
	
	public void put(K key, V value) {
		int bi = hashFunction(key);
		int di = SearchInLL(key,bi);
		
		if(di != -1) {
			Node node = buckets[bi].get(di);
			node.value = value;
		}else {
			buckets[bi].add(new Node(key, value));
			n++;
		}
		
		double lambda =(double)n/N;
		if(lambda>2.0) {
			rehash();
		}
	}
	
	
	public void remove(K key) {
		int bi = hashFunction(key);
		int di = SearchInLL(key,bi);
		
		V value = null;
		if(di != -1) {
			Node node = buckets[bi].get(di);
			node.value = value;
		}else {
			buckets[bi].add(new Node(key, value));
			n++;
		}
	}
	   @SuppressWarnings("unchecked")
         public void rehash() {
		LinkedList<Node> oldBuck[] = buckets;
		buckets = new LinkedList[N*2];
		N = 2*N;
		for(int i=0;i<buckets.length;i++) {
			buckets[i] = new LinkedList<>();
		}
		
		//nodes -> add in bucket
		for(int i=0;i<oldBuck.length;i++) {
			LinkedList<Node> ll = oldBuck[i];
			for(int j=0;j<ll.size();j++) {
				Node node = ll.remove();
				put(node.key, node.value);
			}
		}
		
	public boolean containKey(K key) {
		int bi = hashFunction(key);
		int di = SearchInLL(key,bi);
		
		if(di != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public V get(K key) {
		int bi = hashFunction(key);
		int di = SearchInLL(key,bi);
		
		if(di != -1) {
			Node node = buckets[bi].get(di);
			node.value = value;
		}else {
			return null;
		}
	}
	
	
	public ArrayList<K> keySet(){
		ArrayList<K> keys = new ArrayList<>();
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> ll = buckets[i];
			for(Node node : ll) {
				keys.add(node.key);
			}
		}
		return keys;
	}
	
	
	public boolean isEmpty() {
		return n==0;
	}

}

}

















