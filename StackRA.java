public class StackRA {

	private int[] arr = new int[2]; 
	private int last = arr[0];
	private int size = 0;

	// copires the old array to the new array
	private void copy(int[] oldArr, int[] newArr) {

		for (int i = 0; i < oldArr.length; ++i) {
			newArr[i] = oldArr[i];
		}
	}

	// resizes the old array if necessary (filled or or less than a quarter filled)
	private void resize() {
		if (size == arr.length) {
			int[] newArr = new int[2 * arr.length];
			copy(arr, newArr);
			arr = newArr;
		}
		else if (size <  arr.length / 4 && size > 1) {
			int[] newArr = new int[arr.length / 2];
			copy(arr, newArr);
			arr = newArr;
		}
	}

	public void push(int element) {
		resize();
		arr[size++] = element;
	}

	public void pop() {
		resize();
		--size;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < size - 1; ++i) {
			str += arr[i] + " ";
		}
		str += arr[size - 1] + "]";
		return str;
	}

	public static void main(String[] args) {
		StackRA test = new StackRA();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test);
		test.pop();
		System.out.println(test);
	}
}