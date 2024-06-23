package Question1;

public class List {
	static class Node{
		int data;
		Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node tail;
	private int count;
	
	public List() {
		tail = null;
	}
	
	public void display() {
		if(tail==null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = tail;
		do {
			trav = trav.next;
			System.out.print(" " + trav.data);
		}while(trav!=tail);
		System.out.println(" ");
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(tail==null) {
			tail= newnode;
			newnode.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(tail==null) {
			tail= newnode;
			newnode.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
		}
	
	public void deleteFirst() {
		if(tail==null)
			return;
		else if(tail==tail.next)
			tail=null;
		else {
			tail.next = tail.next.next;
			
		}
		count--;
	}
	
	public void deleteLast() {
		if(tail==null)
			return;
		else if(tail==tail.next)
			tail=null;
		else {
			Node trav = tail.next;
			while(trav.next!=tail)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
		count--;
	}
	
	public void addPosition(int value, int pos) {
		if(pos<1 || pos > count +1) {
			System.out.println("Invalid Position");
			return;
		}
		Node nn = new Node(value);
		if(tail==null) {
			tail=nn;
			nn.next = nn;
		}
		else if(pos==1) {
			addFirst(value);
			return;
		}
		else {
			Node trav = tail.next;
			for(int i=1; i<pos-1; i++)
				trav = trav.next;
			nn.next = trav.next;
			trav.next = nn;
		}
		count++;
	}
	
	public void deletePosition(int pos) {
		if(pos<1 || pos > count+1) {
			System.out.println("Invalid Position");
			return;
		}
		if(tail==null)
			return;
		else if(pos==1) {
			deleteFirst();
			return;
		}
		else {
			Node trav = tail.next;
			for (int i=1; i<pos-1; i++)
				trav = trav.next;
			trav.next = trav.next.next;
			if(trav.next==tail)
				tail=trav;
		}
		count--;
	}
	
	public void deleteAll() {
		tail=null;
		count=0;
	}
	}
