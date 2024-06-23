package Question2;

public class List{
	static class Node{
		int data;
		Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	
	public List() {
		head = null;
	}
	
	public void display()  {
		Node trav = head;
		while(trav!=null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
	}
		System.out.println("");
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void deleteFirst() {
		if(head==null)
			return;
		else
			head= head.next;
	}
	
	
	public void addPosition(int value, int position) {
		Node newnode = new Node(value);
		if(head==null)
			head = newnode;
		else if(position<=1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i=1; i<position-1 && trav.next!=null; i++) 
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void addPositionAfter(int value, int position) {
		Node newnode = new Node(value);
		if(head==null)
			head = newnode;
		else if(position<=1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i=1; i<position && trav.next!=null; i++) 
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
			
	public void deletePosition(int position){	
		if(head==null)
			return;
		else if(head.next==null)
			head=null;
		else if(position<=1)
			head = head.next;
		else { 
			Node trav = head;
			for(int i=1; i<position-1 && trav.next.next!=null; i++)
				trav = trav.next;
			trav.next = trav.next.next;
			}
		}
	public void deleteAll() {
		head=null;
	}
	}
