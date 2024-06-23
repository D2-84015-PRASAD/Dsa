package Question_4;

public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;

	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}

	public void push(int value) {
		if (!isFull()) {
			arr[rear] = value;
			rear++;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		} else {
			int value = arr[front];
			front++;
			return value;
		}
	}

	public int peek() {
		return arr[front];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}
}
