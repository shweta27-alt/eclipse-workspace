package Alpha;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int val){
		data=val;
		left= right = null;
	}
	
}

public class Identical_subtree_or_not {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		root.right.left= new Node(6);
		root.right.right= new Node(7);
		
		
		Node subroot = new Node(2);
		subroot.left=new Node(4);
		subroot.right= new Node(5);
		
		System.out.println(isSubtree(root,subroot));
	}
	
	
	public static boolean isidentical(Node root, Node subroot) {
		if(root==null && subroot == null) {
			return true;
		}else if(root==null || subroot==null || root.data != subroot.data) {
			return false;
		}
		
		//left subtree
		if(!isidentical(root.left,subroot.left)) {
			return false;
		}
		
		//right subtree
		if(!isidentical(root.left,subroot.left)) {
			return false;
		}
		return true;
		
	}
	
	
	
	public static boolean isSubtree(Node root, Node subroot) {
		if(root == null) {
			return false;
		}
		
		if(root.data == subroot.data) {
			if(isidentical(root,subroot)){
				return true;
			}
		}
		return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
	}

}


























