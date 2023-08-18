package operations;

class Node{
	int data;
	Node left;
	Node right;
	Node(int val){
		data=val;
		left=right=null;
	}
}

public class sum {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println(sum(root));
		System.out.println(diameter(root));
		
		
	}

   public static int sum(Node root) {
		if(root==null)
			return 0;
		
		int leftsum = sum(root.left);
		int rightsum = sum(root.right);
		
		return leftsum+rightsum+root.data;
		 
	 }
   
   
   //diameter
   
   public static int diameter(Node root) {
	   if(root == null)
		   return 0;
	   
	   
	   int leftDiam = diameter(root.left);
	   int leftht = height(root.left);
	   int rightDiam = diameter(root.left);
	   int rightht = height(root.right);
	   
	   int selfdiam = leftht + rightht +1;
	   return Math.max( selfdiam, Math.max(rightDiam, leftDiam));
   }

 private static int height(Node root) {
	 if(root == null)
		   return 0;
	   
	 int leftht = height(root.left);
	 int rightht = height(root.left);
	 return Math.max(leftht,rightht)+1;
  }
}





















