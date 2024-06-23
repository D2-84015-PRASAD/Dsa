package Question3;

public class ReverseOrderLL {

	public static void main(String[] args) {
		List l = new List();
		
		l.addFirst(11);
		l.addFirst(12);
		l.addFirst(32);
		l.addFirst(81);
		l.addFirst(67);
		l.addFirst(21);
		
		System.out.println("List before reversing: ");
		l.display();
		l.Reverse();
		System.out.println("List after reversing: ");
		l.display();
	}

}
