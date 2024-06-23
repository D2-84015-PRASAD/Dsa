package Question_5;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = arr.length;
	}

	public void push(int value) {
		top--;
		arr[top] = value;	
	}

	public void pop() {
		System.out.println("Popped Value : " + arr[top]);
		top++;
	}
	
	public void peek() {
		System.out.println("Peeked Value : " + arr[top]);
	}
	
	public boolean isEmpty() {
		return top==SIZE;
	}
	
	public boolean isFull() {
		return top==0;
	}
}
