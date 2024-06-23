package Question_5;

import java.util.Scanner;

import javax.security.auth.callback.ChoiceCallback;

public class DescendingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Stack s = new Stack(5);
		do {
			System.out.println("0.Exit\n1.Push\n2.Pop\n3.Peek");
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				if (s.isFull()) {
					System.out.println("Stack Is Full");
				} else {
					System.out.println("Enter Value To Push : ");
					int value = sc.nextInt();
					s.push(value);					
				}
				break;

			case 2:
				if (!s.isEmpty())
					s.pop();
				else
					System.out.println("Stack Is Empty");
				break;			
			case 3:
				if (!s.isEmpty())
					s.peek();
				else
					System.out.println("Stack Is Empty");
				break;
			default:
				break;
			}
		} while (choice != 0);

	}
}
