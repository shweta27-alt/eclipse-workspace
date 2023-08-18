package LinkedlistImplementation;

import java.util.*;

class Nde{
	int data;
	Node next;
	
	Nde(int x){
		data=x;
		next=null;
	}
}

public class Deletion {
	 public static void main (String args[]) 
	    {
	    
	        Node head = null;
	     
	        head = insert (head, 12);
	        head = insert (head, 16);
	        head = insert (head, 20);
	        head = insert (head, 24);
	        head = insert (head, 30);
	        head = insert (head, 22);
	 
	        System.out.println ("Linked List Before Operations : ");
	        display (head);
	     
	        //deleting first occurrence of a value in linked list
	        head = deletenode (head, 22);
	        head = deletenode (head, 20);
	        head = deletenode (head, 12);
	 
	        System.out.println ("Linked List After Operations : ");
	 
	        display (head);
	    } 
	 
	 static Node insert(Node head, int data) {
		 Node newNode= new Node(data);
		 newNode.next = head;
		 head = newNode;
		 return head;
	 }
	 
	 static void display(Node node) {
		 while(node != null) {
			 System.out.print(node.data+" ");
			 node = node.next;
		 }
		 System.out.println();
	 }
	 
	 static Node deletenode(Node head, int delVal) {
		 Node temp = head;
		 Node previous = null;
		 
		 //when only one node in list
		 if(temp.next==null) {
			 head=null;
			 System.out.println("Value,deleted"+delVal);
		 }
		 
		 
		 //if the head itself needs to be deleted
		 if(temp != null && temp.data==delVal) {
			 head = temp.next; //changing head to net in list
			 System.out.println("Value, deleted"+ delVal);
			 return head;
		 }
		 
		 while(temp != null && temp.data!= delVal) {
			 previous=temp;
			 temp=temp.next;
		 }
		 
		 //if value is not present 
		 //temp will  have traversed to last node null
		 if(temp==null) {
			 System.out.println("value not found");
			 return head;
		 }
		 
		// Case 2: (24)->next = 16 (as 20->next = 16)
	        // Case 3: (16)->next = NULL (as 12->next = NULL)
	        previous.next = temp.next;
	        //case 2: 20 deleted and freed
	        //case 3: 12 deleted and freed
	        System.out.println ("Value %d, deleted " + delVal);
	        return head;
	 } 

}
