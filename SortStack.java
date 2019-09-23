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
		stack.pop();
	}

	// pushes the elements on so that it is sorted with smallest on top
	public void push(int value) {
		while (!this.stack.isEmpty()) {
			if (this.stack.peek() >= value) {
				this.stack.push(value);
				break;
			}
			this.tempStack.pop(this.stack.pop());
		}

		while (!this.tempStack.isEmpty()) {
			this.stack.pop(this.tempStack.pop());
		}
	}

	public static main(String[] args) {

	}
}