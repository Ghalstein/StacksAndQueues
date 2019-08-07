public class CircularQueue<T extends Comparable<T>> {

	private T[] arr;
	private int size = 0;

	public CircularQueue(int capacity) {
		this.arr = (T[]) new Object[capacity];
	}

	public static void main(String[] args) {
		
	}
}