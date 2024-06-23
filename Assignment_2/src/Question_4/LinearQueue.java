package Question_4;

import java.util.Scanner;

public class LinearQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(5);
		int choice;
		do
		{
			System.out.println("0.exit\n1.Push\n2.Pop\n3.Peek");
			System.out.println("Enter your choice - ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				break;
			case 1:
				System.out.println("Enter Value To Push : ");
				int value = sc.nextInt();
				q.push(value);
				break;
			case 2:
				System.out.println("Popped Element : " + q.pop()); 
				break;
			case 3:
				System.out.println("PeekedElement : " + q.peek()); 
				break;
			default:
				break;
			}
		}while(choice!=0);
	}
}	
