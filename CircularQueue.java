public class CircularQueue<T extends Comparable<T>> {

	private T[] arr;
	private int size = 0;
	private int head = 0;
	private int tail = 0;

	public CircularQueue(int capacity) {
		this.arr = (T[]) new Comparable[capacity];
	}

	private void copyArray(T[] oldArr, T[] newArr) {
		int start = this.head;
		int j = 0;
		for (int i = start; i < tail; ++i) {
			newArr[j++] = oldArr[i];
		}
		this.head = 0;
		this.tail = j;
	}

	private void resize() {
		if (size < arr.length / 4) {
			T[] newArr = (T[]) new Comparable[arr.length / 2];
			copyArray(arr, newArr);
			this.arr = newArr;
		}
		else if (size == arr.length || tail == arr.length - 1) {
			T[] newArr = (T[]) new Comparable[arr.length * 2];
			copyArray(arr, newArr);
			this.arr = newArr;
		}
	}

	public T dequeue() {
		resize();
		if (size > 0) {
			--size;
			return arr[head++];
		}
		return arr[head];
	}

	public void enqueue(T data) {
		resize();
		arr[tail++] = data;
		++size;
	}

	public String toString() {
		String str = "[ ";
		for (int i = head; i < tail; ++i) {
			str += this.arr[i] + " ";
		}
		return str + "]";
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		CircularQueue<Integer> test = new CircularQueue<>(3);
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		System.out.println("Initial: " + test);
		test.dequeue();
		System.out.println("After: " + test);

	}
}