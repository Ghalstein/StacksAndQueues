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
		if (addStack.isEmpty()) return -1;
		while (!addStack.isEmpty()) {
			removeStack.push(addStack.pop());
		}
		int popped = removeStack.pop();

		// adding all of the elements back to addStack
		while(!removeStack.isEmpty()) {
			addStack.push(removeStack.pop());
		}

		return popped;
	}

	public String toString() {
		return addStack.toString();
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		System.out.println(queue);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue);
	}
}