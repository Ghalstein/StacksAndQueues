/*
Once stack exceeds capacity creates a new stack 
*/

import java.util.*;

public class StackOfPlates {

	// initial stack
	private ArrayList<int[]> stacks = new ArrayList<>();
	private int[] s1 = new int[5];
	private int curr = 0;
	private int currIndex = 0;
	
	public StackOfPlates() {
		stacks.add(s1);
	}


	// adds a new value to the stack at the end
	public void push(int value) {
		if (currIndex == stacks.get(curr).length) {
			int[] s = new int[5];
			stacks.add(s);
			++curr;
			currIndex = 0;
		}
		stacks.get(curr)[currIndex++] = value;
	}


	// finds and setsthe currIndex for the new array after a pop
	private int currIndex(int stack) {
		int i = 0;
		for (int current : this.stacks.get(stack)) {
			if (current == 0) {
				return i - 1;
			}
			i++;
		}
		return stacks.get(stack).length - 1;
	}

	// pops the element off the newest stack
	public int pop() {
		if (this.currIndex == 0 && this.stacks.size() == 1) return -1;
		if (this.currIndex == 0) {
			this.stacks.remove(this.curr--);
			this.currIndex = currIndex(this.curr);
			int popped = this.stacks.get(curr)[this.currIndex];
			this.stacks.get(curr)[this.currIndex] = 0;
			return popped;
		}
		int popped = this.stacks.get(curr)[this.currIndex - 1];
		this.stacks.get(curr)[--this.currIndex] = 0;
		return popped;
	}

	// iterates through the arraylist and prints out each array
	public String toString() {
		String str = "";
		for (int[] arr : this.stacks) {
			str += Arrays.toString(arr);
		}
		return str;
	}

	// pops at a specified stack
	public int popAt(int stack) {
		if (stack == this.curr) {
			return pop();
		}
		else {
			int current = currIndex(stack);
			if (current == -1) return -1;
			else {
				int popped = this.stacks.get(stack)[current];
				this.stacks.get(stack)[current] = 0;
				return popped;
			}
		}
	}

	public static void main(String[] args) {
		StackOfPlates stacks = new StackOfPlates();
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		stacks.push(6);
		stacks.push(7);
		System.out.println(stacks);
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.popAt(0));
		System.out.println(stacks);
	}
}