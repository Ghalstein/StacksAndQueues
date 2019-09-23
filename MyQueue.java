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

	}

	public static void main(String[] args) {

	}
}