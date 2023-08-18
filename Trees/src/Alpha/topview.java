package Alpha;
import java.util.*;
// 2nd 1:20
class got{
	int data;
	Node left;
	Node right;
	
	got(int val){
		data = val;
		left=right= null;
	}
}
public class topview {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		root.right.left= new Node(6);
		root.right.right= new Node(7);
		
		topview(root);
		
	}
	
	
	static class Info{
		Node node;
		int hd;
		
		public Info (Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}
	
	public static void topview(Node root) {
		//first we go by levelorder
		Queue<Info> q =new LinkedList<>();
		// we have to store the value for that we are using the hashmap
		//integer for the hd and Node for the value
		HashMap<Integer,Node> map = new HashMap<>();
		int min =0;
	    int max =0;
	    
	    q.add(new Info(root,0));
	    q.add(null);
	    
	    while(!q.isEmpty()) {
	    	Info curr = q.remove();
	    	if(curr==null) {
	    		if(q.isEmpty()) {
	    			break;
	    		}else {
	    			q.add(null);
	    		}
	    	} else {
	    	
	    	if(!map.containsKey(curr.hd)) {
	    		//first time hd is occuring
	    		map.put(curr.hd, curr.node);
	    	}
	    	
	        if(curr.node.left!= null) {
	        	q.add(new Info(curr.node.left, curr.hd-1));
	        	min=Math.min(min, curr.hd-1);
	        }
	        
	        if(curr.node.right != null) {
	        	q.add(new Info(curr.node.right, curr.hd+1));
	        	max = Math.max(max, curr.hd+1);
	        }
	    	}
	    }
		
		for(int i=min ; i<=max;i++) {
			System.out.print(map.get(i).data+" ");
		}
		
		System.out.println();
	}
	

}





















