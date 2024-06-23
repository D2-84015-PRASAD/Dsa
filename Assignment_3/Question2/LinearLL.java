package Question2;

import java.util.Scanner;

public class LinearLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int value, pos;
		List l = new List();
		
		do {
			System.out.println("1.add a element\n" +
					"2.insert a new node after a given node\n "
					+ "3.insert a new node before a given node\n"
					+ "4. Delete from a given position\n5.Display the list\n6. Delete all elements");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
					System.out.println("Enter the element: ");
					value = sc.nextInt();
					l.addFirst(value);
				break;
				
			case 2:
				System.out.println("Enter the element: ");
				value = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				l.addPositionAfter(value, pos);
				break;
		
			case 3:
				System.out.println("Enter the element: ");
				value = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				l.addPosition(value, pos);
				break;
			
			case 4:
				System.out.println("Enter the position");
				pos = sc.nextInt();
				l.deletePosition(pos);
				break;
			
			case 5:
				l.display();
				break;
			
			case 6:
				l.deleteAll();
				break;
			default:
				break;
			}
		} while (choice!=0);
	}
}
