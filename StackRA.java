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
		else if (size == arr.length / 4) {
			int[] newArr = new int[arr.length / 2];
			copy(arr, newArr);
			arr = newArr;
		}
	}

	public void add(int element) {
		resize();
		arr[size++]
	}

	public static void main(String[] args) {
	}
}