/*
have to 
*/

import java.util.*;

public class StackMin {

	// min property and array property
	private int min = Integer.MAX_VALUE;
	private ArrayList<Integer> arr = new ArrayList<>();

	//push method
	public void push(int value) {
		this.arr.add(value);
		if (value < this.min) this.min = value;
	}

	// pop method for taking things off 
	public int pop() {
		if (this.arr.size() == 0) return -1;
		int popped = this.arr.remove(this.arr.size() - 1);
		if (popped == this.min) {
			this.min = searchForMin();
		}
		return popped;
	}

	private int searchForMin() {
		int smallest = Integer.MAX_VALUE;
		for (int curr : this.arr) {
			if (curr < smallest) {
				smallest = curr;
			}
		}
		return smallest;
	}

	public String toString() {
		return this.arr.toString();
	}

	public int min() {
		if (this.arr.size() == 0) return -1;
		return this.min;
	}

	public isEmpty() {
		if (this.arr.size() > 0) return true;
		return false;
	}


	public static void main(String[] args) {
		StackMin stack = new StackMin();
		System.out.println(stack.min());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		System.out.println(stack.min());
		stack.push(0);
		System.out.println(stack.min());
	}
}