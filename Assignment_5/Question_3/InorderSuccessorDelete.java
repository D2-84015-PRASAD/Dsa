package Question_3;

public class InorderSuccessorDelete {

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
		b.deleteNodeWthTwoChilds(10);
		b.preorder();
	}
}
