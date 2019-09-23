/*
Making a queue out of two stacks
First have to have a stack that takes in all elements
and adding all of them to another stack and pop off the last one
*/

public class MyQueue {

	private StackMin addStack = new StackMin();
	private StackMin removeStack = new StackMin();

	// pushing by adding to the add Stack
	public void push(int value) {
		addStack.push(value);
	}

	// pops by popping all of addStack on to removeStack
	public int pop() {
		// readying removeStack to remove first element added
		while (!addStack.isEmpty()) {
			removeStock.push(addStack.pop());
		}
		int popped = removeStock.pop();

		// adding all of the elements back to addStack
		while(!removeStock.isEmpty()) {
			addStack.push(removeStack.pop());
		}

		return popped;
	}

	public String toString() {
		return addStack.toString();
	}

	public static void main(String[] args) {
		
	}
}