/*
have to 
*/

import java.util.*;

public class StackMin {

	// min property and array property
	private int min;
	private ArrayList<Integer> arr = new ArrayList<>();

	public StackMin(int value) {
		this.min = value;
		this.arr.add(value);
	}

	//push method
	public void push(int value) {
		this.arr.add(value);
		if (value < this.min) this.min = value;
	}


	public static void main(String[] args) {

	}
}