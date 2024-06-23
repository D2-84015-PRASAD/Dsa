class MaxStack {
	private int[] stack;
	private int[] maxStack;
	private int top;

	public MaxStack(int capacity) {
		stack = new int[capacity];
		maxStack = new int[capacity];
		top = -1;
	}

	public void push(int x) {
		if (top == stack.length - 1) {
			System.out.println("Stack is empty");
		}

		top++;
		stack[top] = x;

		if (top == 0 || x > maxStack[top - 1]) {
			maxStack[top] = x;
		} else {
			maxStack[top] = maxStack[top - 1];
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
		}

		int popped = stack[top];
		top--;
		return popped;
	}

	public int getMax() {
		if (top == -1) {
			System.out.println("Stack is empty");
		}

		return maxStack[top];
	}

	public static void main(String[] args) {
		MaxStack maxStack = new MaxStack(5);
		maxStack.push(5);
		maxStack.push(2);
		maxStack.push(7);
		maxStack.push(4);
		maxStack.push(8);
		
		int max = maxStack.getMax();
		System.out.println("Maximum value in stack: " + max); 
	}
}
