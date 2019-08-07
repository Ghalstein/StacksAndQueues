public class CircularQueue<T extends Comparable<T>> {

	private T[] arr;
	private int size = 0;
	private int head = 0;
	private int tail = 0;

	public CircularQueue(int capacity) {
		this.arr = (T[]) new Object[capacity];
	}

	public T dequeue() {
		return arr[head++];
	}

	public T enqueue(T data) {
		arr[++tail] = data;
	}

	public static void main(String[] args) {
		
	}
}