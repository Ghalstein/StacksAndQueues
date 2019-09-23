/*
I have to find a way to add values to the stack and make sure they're stored in order
Probably have to make the push() O(n) to make it pop() off 
until the right spot is found to push the element to the stack
*/

public class SortStack {

	private StackMin stack = new StackMin();
	private StackMin tempStack = new StackMin();

	public int pop() {
		if (stack.isEmpty()) return -1;
		stack.pop();
	}
	public static main(String[] args) {

	}
}