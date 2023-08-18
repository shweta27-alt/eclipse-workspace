package Circular_linkedlist;

class Node{
    int data;
    Node next;
 
    Node (int x) 
    {
        data = x;
        next = null;
    } 
} 

public class insertion {
	static Node insert (Node head, int data) 
    {
    
        Node newNode = new Node (data);
 
        // if this is the first node
        if (head == null)
        {
	
            newNode.next = newNode;
            return newNode;
        }
 
        Node curr = head;
        //traverse to last node of LL
        while (curr.next != head)
            curr = curr.next;
 
        curr.next = newNode;
        newNode.next = head;
 
        return newNode;
    }
	
	 static Node insertLast (Node head, int data) 
	    {
	    
	        Node newNode = new Node (data);
	        // if this is the first node
	        if (head == null)
	        {
	            newNode.next = newNode;
	            return newNode;
	        }
	        // add element just after the head node
	        // swap data values of new_node and head node
	        // make the new_node(With swapped value) as the head node
	        newNode.next = head.next;
	        head.next = newNode;
	        int temp = head.data;
	        head.data = newNode.data;
	        newNode.data = temp;
	        return newNode;
	    }
	 
 
    static void display (Node head) 
    {
        if (head == null)
            return;
        Node temp = head;
        do
        {
            System.out.print (temp.data + " ");
            temp = temp.next;
        }
        while (temp != head);
    }
 
    public static void main (String args[]) 
    {
        Node head = null;
 
        head = insert (head, 12);
        head = insert (head, 16);
        head = insert (head, 20);
        head = insert (head, 24);
        head = insert (head, 30);
        head = insert (head, 22);
 
        System.out.println (head.data);
        display (head);
        
        head = insertLast (head, 12);
        head = insertLast (head, 16);
        head = insertLast (head, 20);
        head = insertLast (head, 24);
        head = insertLast (head, 30);
        head = insertLast (head, 22);
    
        System.out.println (head.data);
        display (head);
    } 

}
