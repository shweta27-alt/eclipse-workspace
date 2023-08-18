package Implemetation;


class Node11{
	int data;
	Node11 left;
	Node11 right;
	Node11(int val){
		data=val;
		left= right = null;
	}
}

public class height {
	public static void main(String[] args) {
		Node11 root = new Node11(10);
    	root.left = new Node11(20);
    	root.right= new Node11(30);
    	root.right.left= new Node11(40);
    	root.right.right= new Node11(50);
		System.out.println(maxHeight(root));
	}
	
	public static int maxHeight(Node11 node) {
		int lHeight;
		int rHeight;
		if(node==null) {
			return 0;
		}
		else {
			lHeight = maxHeight(node.left);
			rHeight = maxHeight(node.right);
		}
		
		if(lHeight > rHeight) {
			return lHeight+1;
		}
		else {
			return rHeight+1;
		}
			
	}

}

