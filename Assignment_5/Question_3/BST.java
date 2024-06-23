package Question_3;

import com.sunbeam.BSTree.Node;

public class BST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		} else {
			addNode(root, value);
		}
	}

	public void addNode(Node travRoot, int value) {
		if (value < travRoot.data) {
			if (travRoot.left == null) {
				travRoot.left = new Node(value);
				return;
			} else {
				addNode(travRoot.left, value);
			}
		} else {
			if (travRoot.right == null) {
				travRoot.right = new Node(value);
			} else {
				addNode(travRoot.right, value);
			}
		}
	}

	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.print(" ");
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}

	public Node binarySearch(int key) {
		Node trav = root;
		while (trav != null) {
			if (key == trav.data) {
				return trav;
			} else if (key < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		return null;
	}

	public Node[] binarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data) {
				break;
			}
			parent = trav;
			if (key < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null) {
			parent = null;
		}
		return new Node[] { trav, parent };
	}

	public void deleteNodeWthTwoChilds(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		while (temp.left != null && temp.right != null) {
			Node successor = temp.right;
			parent = temp;
			while (successor.left != null) {
				parent = successor;
				successor = successor.left;
			}
			temp.data = successor.data;
			temp = successor;
		}
	}

}
