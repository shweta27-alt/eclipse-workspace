package alpha;

public class LinkedList {
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		tail.next=newNode;
		tail =newNode;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("LL is empty");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.print();
		ll.addFirst(4);
		ll.print();
		ll.addFirst(5);
		ll.print();
		ll.addLast(6);
		ll.print();
		ll.addLast(1);
		ll.print();
	}

}
