public class CircularQueue<T extends Comparable<T>> {

	private T[] arr;
	private int size = 0;
	private int head = 0;
	private int tail = 0;

	public CircularQueue(int capacity) {
		this.arr = (T[]) new Comparable[capacity];
	}

	public T dequeue() {
		return arr[head++];
	}

	public void enqueue(T data) {
		arr[tail++] = data;
	}

	public String toString() {
		String str = "[ ";
		for (int i = head; i < tail; ++i) {
			str += this.arr[i] + " ";
		}
		return str + "]";
	}

	public static void main(String[] args) {
		CircularQueue<Integer> test = new CircularQueue<>(10);
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		System.out.println("Initial: " + test);
		test.dequeue();
		System.out.println("After: " + test);

	}
}