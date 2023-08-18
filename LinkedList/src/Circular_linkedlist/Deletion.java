package Circular_linkedlist;

class Nde{
	  
    int data;
    Node next;
 
    Nde (int x) 
    {
        data = x;
        next = null;
    } 
} 

public class Deletion {
	static Node insert (Node head, int data) 
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
        newNode.next = head.next;
        head.next = newNode;
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
 
        return head;
    }
  
    static Node deleteStart (Node head)
    {
        // if LL is already empty
        if (head == null)
        {
            System.out.println ("LL empty, nothing to delete");
            return head;
        }
        // If there is only one node present
        if (head.next == head)
        {
	        System.out.println ("Node deleted: " + head.data);
            head = null;
            return head;
        }
        Node curr = head;
        while (curr.next != head)
        curr = curr.next;
        curr.next = head.next;	// last node in LL points to next node of current head
        System.out.println ("Node deleted: " + head.data);	// will delete in next line
        head = head.next;		//changed head node to next node
        return head;
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
        System.out.println ();
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
 
        display (head);
        System.out.println ();
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
        head = deleteStart (head);
        display (head);
 
    } 

}
