package Basic;
import java.util.*;

public class Insert_Delete_at_k {
	
static Node head;
class Node{
	int data;
	Node next;
	public Object nextNode;
	Node(int new_data){
		data=new_data;
		next=null;
	}
}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(6);
		list.push(2);
		list.push(9);
		list.push(2);
		list.push(8);
		System.out.println("Created Linked list is: ");
		printList();
		
		int data = 12, pos = 3;
        head = InsertPos(head, pos, data);
        System.out.print("Linked list after" + " insertion of 12 at position 3: ");
        PrintList(head);
  
		delete(4);
		System.out.println("Linked List after Deletion at position 4: ");
		printList();
		
	}
	
	static void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head= new_node;	
	}
	
	 static void delete(int position) {
		
		if(head==null)
			return;
		Node temp = head;
		if(position == 0) {
			head = temp.next;
			return;
		}
		
		for(int i=0; temp!=null && i<position-1;i++) {
			temp= temp.next;
		}
		
		if(temp==null || temp.next==null)
			return;
		
		Node next = temp.next.next;
		temp.next = next;
	}

	 
	 static Node InsertPos(Node headNode, int position, int data) {
	        Node head = headNode;
	        if (position < 1)
	            System.out.print("Invalid position");
	  
	        // if position is 1 then new node is
	        // set infront of head node
	        // head node is changing.
	        if (position == 1) {
	            Node newNode = new Node(data);
	            newNode.nextNode = headNode;
	            head = newNode;
	        } else {
	            while (position-- != 0) {
	                if (position == 1) {
	                    // adding Node at required position
	                    Node newNode = GetNode(data);
	  
	                    // Making the new Node to point to
	                    // the old Node at the same position
	                    newNode.nextNode = headNode.nextNode;
	  
	                    // Replacing current with new Node
	                    // to the old Node to point to the new Node
	                    headNode.nextNode = newNode;
	                    break;
	                }
	                headNode = (Node) headNode.nextNode;
	            }
	            if (position != 1)
	                System.out.print("Position out of range");
	        }
	        return head;
	    }
	 static Node GetNode(int data) {
	        return GetNode(data);
	    }
}












