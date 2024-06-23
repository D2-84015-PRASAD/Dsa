package Question_2;

import Question_2.BST.Node;

public class Search {
	public static void main(String[] args) {
		BST b = new BST();
		b.addNode(4);
		b.addNode(10);
		b.addNode(3);
		b.addNode(7);
		b.addNode(5);
		b.addNode(15);
		b.preorder();
		System.out.println(" ");
		Node search = b.binarySearch(20);
		if (search != null) {
			System.out.println("key found");
		} else {
			System.out.println("key not found");
		}

	}
}
