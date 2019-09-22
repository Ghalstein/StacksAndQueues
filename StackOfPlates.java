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
		if (currIndex == stacks.get(curr).length - 1) {
			int[] s = new int[5];
			stacks.add(s);
			++curr;
			currIndex = 0;
		}
		stacks.get(curr)[currIndex++] = value;
	}

	public String toString() {
		return stacks.toString();
	}

	public static void main(String[] args) {
		StackOfPlates stacks = new StackOfPlates();
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		stacks.push(5);
		stacks.push(6);
		System.out.println(stacks);
	}
}