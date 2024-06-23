package Question4;

public class LinkedList {
		static class Node{
			int data;
			Node next;
			
			public Node(int value) {
				data = value;
				next = null;
			}
		}
		private Node head;
		private int max_Value;
		
		public LinkedList() {
			head = null;
		}
		
		public void display() {
			Node trav = head;
			while(trav!=null) {
				System.out.println(" " + trav.data);
				trav = trav.next;
			}
		}
		
		public void addFirst(int value) {
			Node newnode = new Node(value);
			newnode.next = head;
			head = newnode;
		}
		
		public void sortList(int value) {
			Node newnode = new Node(value);
	        if (head == null || head.data >= value) {
	        	addFirst(value);
	            return;
	        }

	        Node trav = head;
	        while (trav.next != null && trav.next.data < value)
	        	trav = trav.next;
	        newnode.next = trav.next;
	        trav.next = newnode;
	    }
		}

