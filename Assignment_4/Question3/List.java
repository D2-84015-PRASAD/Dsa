package Question3;

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
		
		public void Reverse() {
			Node t1 = head;
			Node t2 = head.next;
			head.next = null;
			
			while(t2!=null) {
				head = t2.next;
				t2.next = t1;
				t1=t2;
				t2=head;
			}
			head=t1;
		}
}
