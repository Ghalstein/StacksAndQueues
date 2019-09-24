/*
I have to find a way to add values to the stack and make sure they're stored in order
Probably have to make the push() O(n) to make it pop() off 
until the right spot is found to push the element to the stack
*/

public class SortStack {

	private StackMin stack = new StackMin();
	private StackMin tempStack = new StackMin();

	// pops the smallest element off the stack
	public int pop() {
		if (stack.isEmpty()) return -1;
		return stack.pop();
	}

	// pushes the elements on so that it is sorted with smallest on top
	public void push(int value) {
		if (this.stack.isEmpty()) {
			this.stack.push(value);
			return;
		}

		while (!this.stack.isEmpty()) {
			if (this.stack.peek() >= value && value != -1) {
				this.stack.push(value);
				break;
			}
			this.tempStack.push(this.stack.pop());
		}

		while (!this.tempStack.isEmpty()) {
			this.stack.push(this.tempStack.pop());
		}
	}

	public String toString() {
		return stack.toString();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		SortStack sortedStack = new SortStack();

		sortedStack.push(5);
		sortedStack.push(1);
		System.out.println(sortedStack);
		sortedStack.push(4);
		sortedStack.push(3);
		System.out.println(sortedStack);
		sortedStack.pop();
		System.out.println(sortedStack);

	}
}