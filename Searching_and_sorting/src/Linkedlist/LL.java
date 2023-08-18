package Linkedlist;

public class LL {
	Node head;
     
	static class Node{
	String data;
	Node next;
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
	}
	
	// add-first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head=newNode;
	}
	
	//addlast
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode= head;
		while(currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//delete first
	//if our head is null the we check here if is not null then we make head head's next as we are deleting first node so second node is head now
	public void deleteFirst() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		head= head.next;
	}
	
	//delete last
	//if our head is null the we check here
	public void deleteLast() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		if(head.next == null) {
			head=null;
			return;
		}
		
		// here we are deleting last element so we make secondlast element as head 
		//now we check it using while loop null (lastNode.next !=null)means last node null
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next !=null) {
			lastNode=lastNode.next;
			secondLast= secondLast.next;
		}
		secondLast.next = null;
	}
	
	
	public static void main(String rgs[]) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
	}
}


