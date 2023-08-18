package treemainimplementation;
import java.util.*;

//level order traversal
//size of tree
class Mode{
	int data;
	Node left;
	Node right;
	Mode(int val){
		data=val;
		left=right=null;
	}
}
public class Tree {
	
	Node root;
	public Object result;

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		int k=2;
		tree.printlevelOrder(tree.root);
		
		//for size of tree
		//System.out.print ("The size is :" + tree.calcSize (tree.root));
		
	}
	
	
	//level order traversal
	
	void printlevelOrder(Node root) {
		if(root == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.data+" ");
			
			if(node.left!=null)
				queue.add(node.left);
			
			if(node.right!=null)
				queue.add(node.right);
		}
		
	}

	
	//size of tree
	// ithe apan subtree la vicharto tuzi size ky toh size deil tyat 1 add karto
	
	/* int calcSize(Node node) {
		if(node==null)
			return 0;
		else {
			return( 1+ calcSize(node.left)+ calcSize(node.right));
		}
	}
	*/
}









