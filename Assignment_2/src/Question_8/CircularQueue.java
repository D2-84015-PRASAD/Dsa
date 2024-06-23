package Question_8;

import java.util.Scanner;

public class CircularQueue {

	private int[] queue;
	private int front;
	private int rear;
	private int capacity;
	private int size;
	private int counter;

	public CircularQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
		counter=0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		rear = (rear + 1) % capacity;
		queue[rear] = item;
		size++;
		counter++;
		System.out.println("Enqued item : " + item);
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		int dequedItem = queue[front];
		front = (front + 1) % capacity;
		size--;
		counter--;
		return dequedItem;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[front];
	}

	public int getRear() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[rear];
	}

	public int getSize() {
		return size;
	}

	public void diaplayQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Queue elements : ");
		int count = 0;
		int i = front;
		while (count < size) {
			System.out.println(queue[i] + " ");
			i = (i + 1) % capacity;
			count++;
		}
		System.out.println("Count od elements :" + counter);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		CircularQueue queue = new CircularQueue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.diaplayQueue();
	}

}
