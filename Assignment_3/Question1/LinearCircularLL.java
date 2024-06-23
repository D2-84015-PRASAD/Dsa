package Question1;

import java.util.Scanner;

public class LinearCircularLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int value, pos;
		List l = new List();
		do {
			System.out.println("1.Add at first position\n2.Delete from first position\n3. "
					+ "Add at last position\n4. Delete from last position\n5. Add at a given position\n"
					+ "6. Delete from a given position\n7.Display the list\n8. Delete all elements");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
					System.out.println("Enter the element: ");
					value = sc.nextInt();
					l.addFirst(value);
				break;
			
			case 2:
				l.deleteFirst();
				
			break;
				
			case 3:
				System.out.println("Enter the element: ");
				value = sc.nextInt();
				l.addLast(value);
			break;
			
			case 4:
				l.deleteLast();
				
			break;
			
			case 5:
				System.out.println("Enter the element: ");
				value = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				l.addPosition(value, pos);
				break;
			
			case 6:
				System.out.println("Enter the position");
				pos = sc.nextInt();
				l.deletePosition(pos);
				break;
			
			case 7:
				l.display();
				break;
			
			case 8:
				l.deleteAll();
				break;
			default:
				break;
			}
		} while (choice!=0);

	}

}
