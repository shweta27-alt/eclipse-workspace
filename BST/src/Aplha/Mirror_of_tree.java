package Aplha;

class mirror{
	int data;
	Node left;
	Node right;
	
	mirror(int val){
		data=val;
		left=right = null;
	}
}

public class Mirror_of_tree {
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left= new Node(5);
		root.right= new Node(10);
		root.left.left= new Node(3);
		root.left.right= new Node(6);
		root.right.right= new Node(11);
		
		root= createmirror(root);
		preorder(root);
		
	}
	
	public static Node createmirror(Node root) {
		if(root==null) {
			return null;
		}
		
		Node leftMirror = createmirror(root.left);
		Node rightMirror = createmirror(root.right);
		
		root.left=rightMirror;
		root.right= leftMirror;
		return root;
	}
	
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

}
