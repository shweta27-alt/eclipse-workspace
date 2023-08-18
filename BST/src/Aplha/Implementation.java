package Aplha;
import java.util.*;

class Node{q																																	
	int data;
	Node left;
	Node right;
	
	Node(int val){
		data=val;
		left=right=null;
	}
	
}
public class Implementation {
	public static void main(String[] args) {
		int[] values = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<values.length;i++) {
			root= insert(root, values[i]);
		}
		inorder(root);
		System.out.println();
		
		//key search
		if(search(root,1)) {
			System.out.println("found");
		}else {
			System.out.println(" not found");
		}
		
		
		// delete node 
//		root=delete(root,1);
//		System.out.println();
//		inorder(root);
		
//	   printInrange(root, 5, 12);
//		
		
//		printroottoleaf(root,new ArrayList<>());
		
		
		if(isvalid(root,null,null)) {
			System.out.println("valid BST");
		}else {
			System.out.println("Not a valid BST");
		}
	}
	
	
	 
	public static Node insert(Node root, int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		
		if(root.data> val) {
			root.left = insert(root.left, val);
		}else {
			root.right = insert(root.right,val);
		}
		return root;
	}
	
	
	
	public static void inorder(Node root) {
		if(root== null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	// code for the search a key: TC= O(h)
	public static boolean search(Node root, int key) {
		if(root==null) {
			return false;
		}
		
		if(root.data==key) {
			return true;
		}
		
		if(root.data> key) {
			return search(root.left,key);
		}else {
			return search(root.right,key);
		}
	}
	
	
	// code for the *delete* a node
	public static Node delete(Node root, int val) {
		if(root.data< val) {
			root.right = delete(root.right,val);
		}else if(root.data>val) {
			root.left = delete(root.left,val);
		}
		else {
			// case 1- leaf node
			if(root.left == null && root.right==null) {
				return null;
			}
			
			// case 2 - single child
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}
			
			// case 3- both children
			Node IS = findInorderSuccessor(root.right);
			root.data = IS.data;
			root.right= delete(root.right, IS.data);
		}
		
		return root;
	}
	
	public static Node findInorderSuccessor(Node root) {
		while(root.left != null) {
			root= root.left;
		}
		return root;
	}
	
	
	
	//PrintInrange
	public static void printInrange(Node root, int k1, int k2) {
		if(root==null) {
			return;
		}
		
		if(root.data>=k1 && root.data<=k2) {
			printInrange(root.left,k1,k2);
			System.out.print(root.data+" ");
			printInrange(root.right,k1,k2);
		}
		
		else if(root.data<k1) {
			printInrange(root.left,k1,k2);
		}else {
			printInrange(root.right,k1,k2);
		}
	}
	
	
	//root to leaf all path
	
	public static void printroottoleaf(Node root, ArrayList<Integer>path) {
		if(root==null) {
			return;
		}
		
		path.add(root.data);
		if(root.left==null && root.right== null) {
			printpath(path);
		}
		
		printroottoleaf(root.left,path);
		printroottoleaf(root.right,path);
		path.remove(path.size()-1);
		}
	
	public static void printpath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.println(); 
	}
	
	
	//Validate BST
	public static boolean isvalid(Node root,Node min,Node max) {
		if(root==null) {
			return true;
		}
		
		if(min!=null && root.data<=min.data) {
			return false;
		}
		
		else if(max!= null && root.data >= max.data) {
			return false;
		}
		
		return isvalid(root.left,min,root) && isvalid(root.right,root,max);
	}
	
	
	
}























